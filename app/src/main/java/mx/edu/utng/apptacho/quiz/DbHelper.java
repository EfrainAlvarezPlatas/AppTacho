package mx.edu.utng.apptacho.quiz;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.apptacho.quiz.Question;


public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz1";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; //correct option
	private static final String KEY_OPTA= "opta"; //option a
	private static final String KEY_OPTB= "optb"; //option b
	private static final String KEY_OPTC= "optc"; //option c
	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
		String sqld = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTD + " ( "
				+ KEY_IDD + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUESD
				+ " TEXT, " + KEY_ANSWERD+ " TEXT, "+KEY_OPTAD +" TEXT, "
				+KEY_OPTBD +" TEXT, "+KEY_OPTCD+" TEXT)";
		String sqlt = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTT + " ( "
				+ KEY_IDT + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUEST
				+ " TEXT, " + KEY_ANSWERT+ " TEXT, "+KEY_OPTAT +" TEXT, "
				+KEY_OPTBT +" TEXT, "+KEY_OPTCT+" TEXT)";


		db.execSQL(sql);
		db.execSQL(sqld);
		db.execSQL(sqlt);

		//Rellenar Base de datos
		addQuestions();
		addQuestionsDos();
		addQuestionsTres();

		//db.close();
	}

	private void addQuestions()
	{
		Question q1=new Question("¿Que Tipo de Aplicaciones que permite realizar JavaFX?","De Servidor","RIA",  "Otras", "RIA");
		this.addQuestion(q1);
		Question q2=new Question("¿Qué Significa MVC?","Code Moving Directly", "Modelo vista controlador",  "Version minimum confidential", "Modelo vista controlador");
		this.addQuestion(q2);
		Question q3=new Question("un conjunto de bibliotecas Java que permite utilizar JavaFX","Runtime Java", "JavaFX Runtime","MVC Runtime","JavaFX Runtime");
		this.addQuestion(q3);
		Question q4=new Question("¿Cuáles son los los elementos del MVC?","Modelo, controlador y version","Modelo, Vista y Controlador", "Vista y Controlador", "Modelo, Vista y Controlador");
		this.addQuestion(q4);
		Question q5=new Question("Decide como se comportará la vista y se comunicará","Vista","Controlador","Modelo","Controlador");
		this.addQuestion(q5);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION());
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}

	//Tabla dos
	private static final String TABLE_QUESTD = "questdos";
	// tasks Table Columns names
	private static final String KEY_IDD = "id";
	private static final String KEY_QUESD = "question";
	private static final String KEY_ANSWERD = "answer"; //correct option
	private static final String KEY_OPTAD= "opta"; //option a
	private static final String KEY_OPTBD= "optb"; //option b
	private static final String KEY_OPTCD= "optc"; //option c

	private void addQuestionsDos()
	{
		Question q1=new Question("Son elementos individuales que forman una escena", "Nodos", "Scene Graph", "root", "Nodos");
		this.addQuestiondos(q1);
		Question q2=new Question("Puede funcionar en dos renderizadores de hardware y software, incluyendo 3-D","Node class", "JavaFX",  "Procesos Prism", "Procesos Prism");
		this.addQuestiondos(q2);
		Question q3=new Question("Su responsabilidad principal es proporcionar servicios operativos nativos, tales como el manejo de las ventanas, temporizadores y superficies","JavaFX", "Ventana Glass","Abstract Window Toolkit","Ventana Glass");
		this.addQuestiondos(q3);
		Question q4=new Question("Ofrece la posibilidad de aplicar un estilo personalizado a la interfaz de usuario de una aplicación JavaFX sin cambiar ningún de código fuente de la aplicación.","Clase de cadenas","Clases Java", "CSS", "CSS");
		this.addQuestiondos(q4);
		Question q5=new Question("Contenedores de diseño o paneles pueden ser utilizados para prever disposiciones flexibles y dinámicas de los controles UI dentro de un escenario gráfico de una aplicación JavaFX.","Layouts","MVC","Ventana Glass","Layouts");
		this.addQuestiondos(q5);
	}

	// Adding new question
	public void addQuestiondos(Question questtio) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUESD, questtio.getQUESTION());
		values.put(KEY_ANSWERD, questtio.getANSWER());
		values.put(KEY_OPTAD, questtio.getOPTA());
		values.put(KEY_OPTBD, questtio.getOPTB());
		values.put(KEY_OPTCD, questtio.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUESTD, null, values);
	}
	public List<Question> getAllQuestionsdos() {
		List<Question> quesList2 = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUESTD;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList2.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList2;
	}

//Tabla tres
private static final String TABLE_QUESTT = "questt";
	// tasks Table Columns names
	private static final String KEY_IDT = "id";
	private static final String KEY_QUEST = "question";
	private static final String KEY_ANSWERT = "answer"; //correct option
	private static final String KEY_OPTAT= "opta"; //option a
	private static final String KEY_OPTBT= "optb"; //option b
	private static final String KEY_OPTCT= "optc"; //option c
	private void addQuestionsTres()
	{
		Question q1=new Question(" public void start(Stage stage) {\n" +
				" Button boton = new _______();\n" +
				" boton.setText(\"Di 'Hola Mundo'\");\n" +
				" boton.setOnAction(new EventHandler<ActionEvent>() {\n" +
				" @Override\n" +
				" public void handle(ActionEvent event) {\n" +
				" System.out.println(\"Hola Mundo!\");\n" +
				" }\n" +
				" });\n", "Button", "Text", "Event", "Button");
		this.addQuestionT(q1);
		Question q2=new Question("El primer archivo a editar es el archivo FXMLExample.java. Este archivo incluye el código para la creación de la clase principal de la aplicación y para definir el ________ y escena.","Resultado", "Diseo",  "Escenario", "Escenario");
		this.addQuestionT(q2);
		Question q3=new Question("public void start(Stage stage) throws Exception { \n" +
				"Parent root = FXMLLoader.load(getClass().getResource(\"fxml_example.fxml\")); \n" +
				"_____ scene = new Scene(root, 300, 275);\n" +
				" stage.setTitle(\"FXML Welcome\"); \n" +
				"stage.setScene(scene); stage.show();\n" +
				" }\n","Button", "Escena","Scene","Scene");
		this.addQuestionT(q3);
		Question q4=new Question("Su primera tarea es crear un nuevo archivo ______ y guárdalo en el mismo directorio que la clase principal de la aplicación. ","Clase de cadenas","Clases Java", "CSS", "CSS");
		this.addQuestionT(q4);
		Question q5=new Question("Una aplicación JavaFX define el contenedor(container) de _________ de usuario(UI) por medio de una etapa(Stage) y una escena(Scene). La clase de JavaFX “Stage” es el contenedor JavaFX de nivel superior. La clase de JavaFX “Scene” es el contenedor de todo el contenido. Ejemplo 3-1 crea el escenario(Stage) y la escena(Scene) y hace que la escena se visualize en un tamaño de píxel dado.","Layouts","interfaz","Ventana Glass","interfaz");
		this.addQuestionT(q5);
	}

	// Adding new question
	public void addQuestionT(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUEST, quest.getQUESTION());
		values.put(KEY_ANSWERT, quest.getANSWER());
		values.put(KEY_OPTAT, quest.getOPTA());
		values.put(KEY_OPTBT, quest.getOPTB());
		values.put(KEY_OPTCT, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUESTT, null, values);
	}
	public List<Question> getAllQuestionsTres() {
		List<Question> quesList3 = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUESTT;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList3.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList3;
	}
}
