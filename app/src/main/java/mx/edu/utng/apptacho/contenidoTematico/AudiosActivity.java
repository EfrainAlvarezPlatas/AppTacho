package mx.edu.utng.apptacho.contenidoTematico;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;

import mx.edu.utng.apptacho.R;

/**
 * Created by Carlos on 15/02/2016.
 */
//clase para mostrar en pantalla lo referente a los audios
public class AudiosActivity extends ActionBarActivity {
    boolean playing = false;
//se jala el layout que se usara, ademas de poner los botones que se usaran y las acciones que tendran
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_activity);

        ImageButton play = (ImageButton) findViewById(R.id.btn_start);
        ImageButton pause = (ImageButton) findViewById(R.id.btn_pause);
        ImageButton stop = (ImageButton) findViewById(R.id.btn_stop);

        ImageButton play2 = (ImageButton) findViewById(R.id.btn_start2);
        ImageButton pause2 = (ImageButton) findViewById(R.id.btn_pause2);
        ImageButton stop2 = (ImageButton) findViewById(R.id.btn_stop2);

        ImageButton play3 = (ImageButton) findViewById(R.id.btn_start3);
        ImageButton pause3 = (ImageButton) findViewById(R.id.btn_pause3);
        ImageButton stop3 = (ImageButton) findViewById(R.id.btn_stop3);

//busca el sonido que se reproducira
        final MediaPlayer audio1 = MediaPlayer.create(AudiosActivity.this, R.raw.introduccion);
        final MediaPlayer audio2 = MediaPlayer.create(AudiosActivity.this, R.raw.crear_proyecto);
        final MediaPlayer audio3 = MediaPlayer.create(AudiosActivity.this, R.raw.primera_ventana);

//manda la orden de reproducir
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    audio1.start();
                    playing = true;
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    audio2.start();
                    playing = true;
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    audio3.start();
                    playing = true;
                }
            }
        });
//manda la orden de pausar el audio
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio1.pause();
                    playing = false;
                }
            }
        });

        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio2.pause();
                    playing = false;
                }
            }
        });

        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio3.pause();
                    playing = false;
                }
            }
        });
//manda la orden de parar el audio
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio1.stop();
                    playing = false;
                }
            }
        });

        stop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio2.stop();
                    playing = false;
                }
            }
        });

        stop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    audio3.stop();
                    playing = false;
                }
            }
        });

    }


}
