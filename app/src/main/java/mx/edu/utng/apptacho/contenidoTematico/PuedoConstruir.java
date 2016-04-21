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
public class PuedoConstruir extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puedo_construir);

        FloatingActionButton btnPdoConsAde = (FloatingActionButton) findViewById(R.id.btn_adelante_pdo_const);
        btnPdoConsAde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPdoConsAde = new Intent(PuedoConstruir.this, VistaControlador.class);
                startActivity(btnPdoConsAde);
            }
        });


        FloatingActionButton btnPdoConstAtras = (FloatingActionButton) findViewById(R.id.btn_atras_pdo_const);
        btnPdoConstAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPdoConsAtras = new Intent(PuedoConstruir.this, CaractClave.class);
                startActivity(btnPdoConsAtras);
            }
        });


    }
}
