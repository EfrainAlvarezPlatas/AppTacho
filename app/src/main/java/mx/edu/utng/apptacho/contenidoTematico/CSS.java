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
public class CSS extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.css);

        FloatingActionButton btnCssAde = (FloatingActionButton) findViewById(R.id.btn_adelante_css);
        btnCssAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCssAde = new Intent(CSS.this, Controles.class);
                startActivity(btnCssAde);
            }
        });


        FloatingActionButton btnCssAtras = (FloatingActionButton) findViewById(R.id.btn_atras_css);
        btnCssAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCssAtras = new Intent(CSS.this, Imagenes.class);
                startActivity(btnCssAtras);
            }
        });


    }
}
