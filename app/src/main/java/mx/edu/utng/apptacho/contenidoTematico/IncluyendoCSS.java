package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class IncluyendoCSS extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incluyendo_css);

        FloatingActionButton btnAdeIncluy = (FloatingActionButton) findViewById(R.id.btn_adelante_incluy);
        btnAdeIncluy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAdeIncluy = new Intent(IncluyendoCSS.this, MainActivity.class);
                startActivity(btnAdeIncluy);
            }
        });


        FloatingActionButton btnAtrasIncluy = (FloatingActionButton) findViewById(R.id.btn_atras_incluy);
        btnAtrasIncluy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAtrasIncluy = new Intent(IncluyendoCSS.this, HolaMundo.class);
                startActivity(btnAtrasIncluy);
            }
        });

    }
}
