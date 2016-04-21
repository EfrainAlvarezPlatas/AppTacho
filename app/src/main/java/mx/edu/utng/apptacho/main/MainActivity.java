package mx.edu.utng.apptacho.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import mx.edu.utng.apptacho.configuracion.ActividadConfiguracion;
import mx.edu.utng.apptacho.R;
import mx.edu.utng.apptacho.contenidoTematico.ActivityAcercaDe;
import mx.edu.utng.apptacho.contenidoTematico.Arquitectura;
import mx.edu.utng.apptacho.contenidoTematico.AudiosActivity;
import mx.edu.utng.apptacho.contenidoTematico.Fxml;
import mx.edu.utng.apptacho.contenidoTematico.Hilos;
import mx.edu.utng.apptacho.contenidoTematico.HolaMundo;
import mx.edu.utng.apptacho.contenidoTematico.LeccionIntro;
import mx.edu.utng.apptacho.contenidoTematico.Temario;
import mx.edu.utng.apptacho.contenidoTematico.VideoActivity;
import mx.edu.utng.apptacho.correo.CorreoActivity;
import mx.edu.utng.apptacho.login.RegistrateActivity;
import mx.edu.utng.apptacho.quiz.CuestionarioActivity;

//clase principal de toda la aplicacion, HOME
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
//metodo que se crea cuando la aplicacion es iniciada, y se definen las acciones de todos los botones que se muestran
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton btnIntro = (FloatingActionButton) findViewById(R.id.btn_intro);
        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIntro = new Intent(MainActivity.this, LeccionIntro.class);
                startActivity(btnIntro);
            }
        });

        FloatingActionButton btnGraficos = (FloatingActionButton) findViewById(R.id.btn_graficos);
        btnGraficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnGraficos = new Intent(MainActivity.this, Arquitectura.class);
                startActivity(btnGraficos);
            }
        });

        FloatingActionButton btnHilos = (FloatingActionButton) findViewById(R.id.btn_hilos);
        btnHilos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHilos = new Intent(MainActivity.this, Hilos.class);
                startActivity(btnHilos);
            }
        });

        FloatingActionButton btnMundo = (FloatingActionButton) findViewById(R.id.btn_mundo);
        btnMundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMundo = new Intent(MainActivity.this, HolaMundo.class);
                startActivity(btnMundo);
            }
        });


        FloatingActionButton btnInterfaz = (FloatingActionButton) findViewById(R.id.btn_xml);
        btnInterfaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnInterfaz = new Intent(MainActivity.this, Fxml.class);
                startActivity(btnInterfaz);
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
//metodo que le da accion a todas las secciones del menu lateral
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.



        int id = item.getItemId();

        if (id == R.id.nav_home) {

            startActivity(new Intent(this, MainActivity.class));

        } else if (id == R.id.nav_temario) {

            startActivity(new Intent(this,Temario.class));

        } else if (id == R.id.nav_cuestionarios) {
           //startActivity(new Intent(this, cuestionarioActivity.class));
            startActivity(new Intent(this, CuestionarioActivity.class));

        } else if (id == R.id.nav_juegos) {
            //startActivity(new Intent(this, PracticasCodigo.class));
            startActivity(new Intent(this, RegistrateActivity.class));

        }  else if (id == R.id.nav_videos) {

            startActivity(new Intent(this, VideoActivity.class));

        }else if (id == R.id.nav_correo) {

            //startActivity(new Intent(this, LoginPrincipal.class));
            //startActivity(new Intent(this, RegistrateActivity.class));
            startActivity(new Intent(this, CorreoActivity.class));

        } else if (id == R.id.nav_valorar) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com")));
            //startActivity(new Intent(this, Valorar.class));


        } else if (id == R.id.nav_acercade) {
            startActivity(new Intent(this, ActivityAcercaDe.class));


        } else if (id == R.id.nav_configuracion) {
            startActivity(new Intent(this, ActividadConfiguracion.class));

        } else if (id == R.id.nav_audio) {

            startActivity(new Intent(this, AudiosActivity.class));

        }


        // item.setChecked(true);
        //  getSupportActionBar().setTitle(item.getTitle());



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
