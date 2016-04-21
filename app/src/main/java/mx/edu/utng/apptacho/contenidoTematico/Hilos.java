package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.bloqueos.BloqueQuizDos;
import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class Hilos extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    BloqueQuizDos session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hilos);
        //al ser el acceso para el tema 2 se coloca el codigo para que haga efectivo el bloqueo
        session=new BloqueQuizDos(getApplicationContext());
        if(session.checkQuiz())
            finish();

        FloatingActionButton btnHilosAde = (FloatingActionButton) findViewById(R.id.btn_adelante_hilos);
        btnHilosAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHilosAde = new Intent(Hilos.this, Imagenes.class);
                startActivity(btnHilosAde);
            }
        });

        FloatingActionButton btnHilosAtras = (FloatingActionButton) findViewById(R.id.btn_atras_hilos);
        btnHilosAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHilosAtras = new Intent(Hilos.this, MainActivity.class);
                startActivity(btnHilosAtras);
            }
        });



    }
}
