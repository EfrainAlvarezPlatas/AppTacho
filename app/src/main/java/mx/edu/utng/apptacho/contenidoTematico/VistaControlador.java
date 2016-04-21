package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 26/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class VistaControlador extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_controlador);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton btnVisContAde = (FloatingActionButton) findViewById(R.id.btn_adelante_vist_cont);
        btnVisContAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAde = new Intent(VistaControlador.this, MainActivity.class);
                startActivity(btnVisConAde);
            }
        });


        FloatingActionButton btnVisConAtras = (FloatingActionButton) findViewById(R.id.btn_atras_vist_cont);
        btnVisConAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAtras = new Intent(VistaControlador.this, PuedoConstruir.class);
                startActivity(btnVisConAtras);
            }
        });
    }
}
