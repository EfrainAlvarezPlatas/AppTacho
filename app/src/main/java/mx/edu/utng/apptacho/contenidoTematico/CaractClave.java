package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 26/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class CaractClave extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caracteristicas_clave);

        FloatingActionButton btnCarCveAde = (FloatingActionButton) findViewById(R.id.btn_adelante_car_cve);
        btnCarCveAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCarCveAde = new Intent(CaractClave.this, PuedoConstruir.class);
                startActivity(btnCarCveAde);
            }
        });


        FloatingActionButton btnPdoConstAtras = (FloatingActionButton) findViewById(R.id.btn_atras_car_cve);
        btnPdoConstAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPdoConsAtras = new Intent(CaractClave.this, LeccionIntro.class);
                startActivity(btnPdoConsAtras);
            }
        });
    }
    }

