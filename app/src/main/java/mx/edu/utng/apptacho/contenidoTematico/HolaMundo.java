package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.bloqueos.BloqueQuizTres;
import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class HolaMundo extends ActionBarActivity{
    BloqueQuizTres session;
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hola_mundo);
        //al ser el acceso para el tema 3 se coloca el codigo para que haga efectivo el bloqueo
        session =new BloqueQuizTres(getApplicationContext());
        if (session.checkQuiz())
            finish();

        FloatingActionButton btnAdeHola = (FloatingActionButton) findViewById(R.id.btn_adelante_hola);
        btnAdeHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAdeHola = new Intent(HolaMundo.this, IncluyendoCSS.class);
                startActivity(btnAdeHola);
            }
        });


        FloatingActionButton btnAtrasHola = (FloatingActionButton) findViewById(R.id.btn_atras_hola);
        btnAtrasHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAtrasHola = new Intent(HolaMundo.this, MainActivity.class);
                startActivity(btnAtrasHola);
            }
        });
    }
}
