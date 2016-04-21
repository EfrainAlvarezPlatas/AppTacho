package mx.edu.utng.apptacho.contenidoTematico;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 26/03/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class Temario extends ActionBarActivity{
    //metodo que crea la pantalla que se muestra.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temario_activity);
    }
}
