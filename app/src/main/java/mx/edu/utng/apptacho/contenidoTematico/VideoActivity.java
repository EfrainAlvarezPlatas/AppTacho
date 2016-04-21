package mx.edu.utng.apptacho.contenidoTematico;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import mx.edu.utng.apptacho.R;

/**
 * Created by Carlos on 29/02/2016.
 */
//clase para mostrar las lecciones de la aplicacion
public class VideoActivity extends ActionBarActivity {
    //metodo que crea la pantalla que se muestra, y en esta se ponen los botones para avanzar de tema o retroceder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

//declaracion de los botones de imagen
        ImageButton btnVideos=(ImageButton)findViewById(R.id.btn_videos);
        ImageButton btnCss=(ImageButton)findViewById(R.id.btn_video2);
        ImageButton btnBasico=(ImageButton)findViewById(R.id.btn_video3);
        ImageButton btnImagenes=(ImageButton)findViewById(R.id.btn_video4);
        ImageButton btnMenu=(ImageButton)findViewById(R.id.btn_video5);
        ImageButton btnComposer=(ImageButton)findViewById(R.id.btn_video6);
        ImageButton btnNavegacion=(ImageButton)findViewById(R.id.btn_video7);
        ImageButton btnJava=(ImageButton)findViewById(R.id.btn_video8);
        ImageButton btnTable=(ImageButton)findViewById(R.id.btn_video9);



//se le designa la accion del boton
        btnVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=uxVvOLrs2O0";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
//se le designa la accion del boton
        btnCss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=uzEL5NCXP4k";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnBasico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=z9h46k8EtrQ";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=s_F84-ML2zk";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
//se le designa la accion del boton
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=SrjnHbTrhVs";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnComposer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=e1d8zSUSRDY";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnNavegacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=uhG__sOQV2Q";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=9_PSZy7eXrs";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //se le designa la accion del boton
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.youtube.com/watch?v=rDiLjbOPyN4";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
