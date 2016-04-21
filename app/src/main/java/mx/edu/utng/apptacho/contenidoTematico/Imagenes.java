package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 27/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class Imagenes extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenes);

        FloatingActionButton btnAdeImgns = (FloatingActionButton) findViewById(R.id.btn_adelante_imagenes);
        btnAdeImgns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHilosAde = new Intent(Imagenes.this, CSS.class);
                startActivity(btnHilosAde);
            }
        });

        FloatingActionButton btnHilosAtras = (FloatingActionButton) findViewById(R.id.btn_atras_imagenes);
        btnHilosAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHilosAtras = new Intent(Imagenes.this, Hilos.class);
                startActivity(btnHilosAtras);
            }
        });

    }
}
