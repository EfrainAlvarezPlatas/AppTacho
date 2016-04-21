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
public class Layouts extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouts);


        final FloatingActionButton btnAdelayout = (FloatingActionButton) findViewById(R.id.btn_adelante_layouts);
        btnAdelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAdeLayout = new Intent(Layouts.this, MainActivity.class);
                startActivity(btnAdeLayout);
            }
        });


        final FloatingActionButton btnAtrasLayout= (FloatingActionButton) findViewById(R.id.btn_atras_layouts);
        btnAtrasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAtrasLayout = new Intent(Layouts.this, Controles.class);
                startActivity(btnAtrasLayout);
            }
        });


    }
}
