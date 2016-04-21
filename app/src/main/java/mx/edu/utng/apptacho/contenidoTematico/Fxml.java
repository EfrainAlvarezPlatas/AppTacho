package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.bloqueos.BloqueQuizTres;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class Fxml extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    BloqueQuizTres session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fxml);
       //al ser el acceso para el tema 3 se coloca el codigo para que haga efectivo el bloqueo
        session =new BloqueQuizTres(getApplicationContext());
        if (session.checkQuiz())
            finish();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton btnAdeFxml= (FloatingActionButton) findViewById(R.id.btn_adelante_fxml);
        btnAdeFxml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAdeFxml = new Intent(Fxml.this, HolaMundo.class);
                startActivity(btnAdeFxml);
            }
        });


        FloatingActionButton btnAtrasFxml = (FloatingActionButton) findViewById(R.id.btn_atras_fxml);
        btnAtrasFxml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAtrasFxml = new Intent(Fxml.this, HolaMundo.class);
                startActivity(btnAtrasFxml);
            }
        });

    }
}
