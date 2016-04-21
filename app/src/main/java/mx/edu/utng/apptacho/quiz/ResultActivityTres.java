package mx.edu.utng.apptacho.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;

import mx.edu.utng.apptacho.R;
import mx.edu.utng.apptacho.bloqueos.BloqueQuizTres;
import mx.edu.utng.apptacho.grafica.Grafica;
import mx.edu.utng.apptacho.grafica.GraficaHelperDos;
import mx.edu.utng.apptacho.grafica.GraficoActivityDos;


public class ResultActivityTres extends Activity {


	GraficaHelperDos db= new GraficaHelperDos(this);
	Grafica g= new Grafica();

	BloqueQuizTres session;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);

		session= new BloqueQuizTres(getApplicationContext());
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
		bar.setNumStars(5);
		bar.setStepSize(0.5f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		bar.setRating(score);

		switch (score)
		{
			case 0: t.setText("Eres malisimo tienes todas las respuestas mal");

			case 1:t.setText("Haz tenido solo una respuesta bien");

			case 2:t.setText("Haz obtenido 2 respuestas bien");

				break;
			case 3:t.setText("Haz obtenido todas las respuestas bien");
				g.setNombre("Implementando Código JavaFx");
				g.setSigla("Q1");
				g.setVotos(20);
				db.insertResult(g);
				session.createUserQuiz("pass", "pass");
				Intent i=new Intent(getApplicationContext(), GraficoActivityDos.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(i);
				finish();
				break;

			case 4:t.setText("Haz obtenido 4 respuestas bien");
				g.setNombre("Implementando Código JavaFx");
				g.setSigla("Q3");
				g.setVotos(20);
				db.insertResult(g);
				session.createUserQuiz("pass", "pass");
				Intent ib=new Intent(getApplicationContext(), GraficoActivityDos.class);
				ib.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				ib.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ib);
				finish();
				break;

			case 5:t.setText("Haz obtenido todas las respuestas bien");
				g.setNombre("Implementando Código JavaFx");
				g.setSigla("Q3");
				g.setVotos(20);
				db.insertResult(g);
				session.createUserQuiz("pass", "pass");
				Intent ic=new Intent(getApplicationContext(), GraficoActivityDos.class);
				ic.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				ic.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(ic);
				finish();
				break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}
}
