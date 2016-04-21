package mx.edu.utng.apptacho.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import mx.edu.utng.apptacho.R;

/**
 * Created by Efraz on 26/03/2016.
 */
public class CuestionarioActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_activity);

        FloatingActionButton btnCues1 = (FloatingActionButton) findViewById(R.id.cues1);
        btnCues1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCues1 = new Intent(CuestionarioActivity.this, QuizActivity.class);
                startActivity(btnCues1);
            }
        });


        FloatingActionButton btnCues2 = ( FloatingActionButton) findViewById(R.id.cues2);
        btnCues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCues2 = new Intent(CuestionarioActivity.this, QuizActivityDos.class);
                startActivity(btnCues2);
            }
        });


        FloatingActionButton btnCues22 = ( FloatingActionButton) findViewById(R.id.cues22);
        btnCues22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCues22 = new Intent(CuestionarioActivity.this, QuizActivityDos.class);
                startActivity(btnCues22);
            }
        });


        FloatingActionButton btnCues3 = ( FloatingActionButton) findViewById(R.id.cues3);
        btnCues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCues3 = new Intent(CuestionarioActivity.this, QuizActivityTres.class);
                startActivity(btnCues3);
            }
        });


        FloatingActionButton btnCues33 = ( FloatingActionButton) findViewById(R.id.cues33);
        btnCues33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCues33 = new Intent(CuestionarioActivity.this, QuizActivityTres.class);
                startActivity(btnCues33);
            }
        });

    }


    }
