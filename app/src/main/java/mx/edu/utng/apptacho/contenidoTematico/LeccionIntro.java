package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 26/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class LeccionIntro extends ActionBarActivity {
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leccion_intro);


        FloatingActionButton btnCarCveAde = (FloatingActionButton) findViewById(R.id.btn_adelante);
        btnCarCveAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCarCveAde = new Intent(LeccionIntro.this, CaractClave.class);
                startActivity(btnCarCveAde);
            }
        });


        FloatingActionButton btnCarCveAtras = (FloatingActionButton) findViewById(R.id.btn_atras);
        btnCarCveAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCarCve = new Intent(LeccionIntro.this, MainActivity.class);
                startActivity(btnCarCve);
            }
        });
    }
}


