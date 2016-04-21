package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class Controles extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controles);


        final FloatingActionButton btnAdeControles = (FloatingActionButton) findViewById(R.id.btn_adelante_controles);
        btnAdeControles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAdeControles = new Intent(Controles.this, Layouts.class);
                startActivity(btnAdeControles);
            }
        });


        final FloatingActionButton btnAtrasControles = (FloatingActionButton) findViewById(R.id.btn_atras_controles);
        btnAtrasControles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAtrasControles = new Intent(Controles.this, CSS.class);
                startActivity(btnAtrasControles);
            }
        });


    }
}
