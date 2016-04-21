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
public class Arquitectura extends ActionBarActivity{
    BloqueQuizDos session;
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arquitectura);
        session=new BloqueQuizDos(getApplicationContext());
        if(session.checkQuiz())
            finish();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FloatingActionButton btnVisContAde = (FloatingActionButton) findViewById(R.id.btn_adelante_arqui);
        btnVisContAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAde = new Intent(Arquitectura.this, GraficosSistema.class);
                startActivity(btnVisConAde);
            }
        });


        FloatingActionButton btnVisConAtras = (FloatingActionButton) findViewById(R.id.btn_atras_arqui);
        btnVisConAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAtras = new Intent(Arquitectura.this, MainActivity.class);
                startActivity(btnVisConAtras);
            }
        });


    }
}
