package mx.edu.utng.apptacho.grafica;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by a on 30/03/2016.
 */
//clase que crea la tabla y la base de datos que alojaran los datos para que se pueda graficar
public class GraficaHelperDos extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="votosdos.db";
    private static final String TABLE_NAME="Eleccion";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_SIGLA="sigla";
    private static final String COLUMN_NAME="nombre";
    private static final String COLUMN_VOTOS="votos";
    private static final String TABLE_CREATE="create table Eleccion (id integer primary key AUTOINCREMENT not null , "+
            "sigla TEXT unique NOT NULL , " +
            "nombre prima TEXT unique NOT NULL , " +
            "votos INTEGER not null DEFAULT 0);";
    SQLiteDatabase db;
    //datos

    /**
     * Constructor de clase
     * */
    public GraficaHelperDos(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }
//datos que se insertaran a la grafica
    public void insertResult(Grafica g){
        db= this.getWritableDatabase();
        ContentValues values= new ContentValues();
        String query = "select * from "+ TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        values.put(COLUMN_NAME, g.getNombre());
        values.put(COLUMN_SIGLA, g.getSigla());
        values.put(COLUMN_VOTOS, g.getVotos());
        values.put(COLUMN_ID, count);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
//define
    @Override
    public void onUpgrade( SQLiteDatabase db,  int oldVersion, int newVersion ) {
        String query= "DROP TABLE IF EXIST"+ TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
    //metodo de arreglos para pasarle a la grafica
    public ArrayList<Grafica> getCandidatos(){

        ArrayList<Grafica> partidoList = new ArrayList<Grafica>();
        Cursor cursor = db.query( "Eleccion" ,
                new String[]{"id","sigla","nombre","votos"} , //columns
                null, //clausula where
                null, //The values for the WHERE clause
                null, // don't group the rows
                null, //don't filter by row groups
                null //The sort order
        );
        cursor.moveToFirst();
        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            Grafica grafica = new Grafica();
            grafica.setId( cursor.getInt(cursor.getColumnIndexOrThrow("id")) );
            grafica.setSigla( cursor.getString(cursor.getColumnIndexOrThrow("sigla")) );
            grafica.setNombre( cursor.getString(cursor.getColumnIndexOrThrow("nombre")) );
            grafica.setVotos( cursor.getInt(cursor.getColumnIndexOrThrow("votos")) );
            partidoList.add(grafica);
        }
        return partidoList;
    }

    /** Abre conexion a base de datos */
    public void openConnection(){
        db= this.getWritableDatabase();
    }

    /** Cierra conexion a la base de datos */
    public void closeConnection()
    {
        db.close();
    }
    public int getTotalVotos()
    {
        String sql = "SELECT SUM(votos) AS total FROM Eleccion";
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        int total = cursor.getInt(cursor.getColumnIndexOrThrow("total"));
        cursor.close();
        return total;
    }

}//SQLiteHelper:end