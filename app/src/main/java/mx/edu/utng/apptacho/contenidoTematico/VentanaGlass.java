package mx.edu.utng.apptacho.contenidoTematico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.main.MainActivity;
import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 30/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class VentanaGlass extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_glass);


        FloatingActionButton btnVisContAde = (FloatingActionButton) findViewById(R.id.btn_adelante_glass);
        btnVisContAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAde = new Intent(VentanaGlass.this, MainActivity.class);
                startActivity(btnVisConAde);
            }
        });


        FloatingActionButton btnVisConAtras = (FloatingActionButton) findViewById(R.id.btn_atras_glass);
        btnVisConAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVisConAtras = new Intent(VentanaGlass.this, GraficosSistema.class);
                startActivity(btnVisConAtras);
            }
        });


    }
}
