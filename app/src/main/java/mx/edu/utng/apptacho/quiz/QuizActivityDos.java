package mx.edu.utng.apptacho.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import mx.edu.utng.apptacho.bloqueos.BloqueQuizDos;
import mx.edu.utng.apptacho.R;

public class QuizActivityDos extends AppCompatActivity {
	List<Question> quesList2;
	int score=0;
	int qid=0;
	Question currentQ;
	TextView txtQuestion, text;
	RadioButton rda, rdb, rdc;
	Button butNext;
	BloqueQuizDos session;
	CountDownTimer countDownTimer;
	boolean timerHasStarted=false;
	final long starTime=30*1000;
	final long interval=1*1000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		text=(TextView)findViewById(R.id.timers);
		//countDownTimer=new MyCountDownTimer(starTime, interval);
		text.setText(text.getText() + String.valueOf(starTime / 1000));
		session= new BloqueQuizDos(getApplicationContext());
		if(session.checkQuiz())
			finish();
		DbHelper db=new DbHelper(this);
		quesList2=db.getAllQuestionsdos();
		currentQ=quesList2.get(qid);
		txtQuestion=(TextView)findViewById(R.id.textView1);
		rda=(RadioButton)findViewById(R.id.radio0);
		rdb=(RadioButton)findViewById(R.id.radio1);
		rdc=(RadioButton)findViewById(R.id.radio2);
		butNext=(Button)findViewById(R.id.button1);
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				if(!timerHasStarted){
//					countDownTimer.start();
					timerHasStarted=true;
					butNext.setText("Siguiente");
				}else {
//					countDownTimer.cancel();
					timerHasStarted=false;
					butNext.setText("Empezar");
				}
				RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
				RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
				grp.clearCheck();
				Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
				if(currentQ.getANSWER().equals(answer.getText()))
				{
					score++;
					Log.d("score", "Your score"+score);
				}
				if(qid<5){					
					currentQ=quesList2.get(qid);
					setQuestionView();
				}else{
					Intent intent = new Intent(QuizActivityDos.this, ResultActivityDos.class);
					Bundle b = new Bundle();
					b.putInt("score", score); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
					finish();
				}
			}
		}

		);

	}
	/*public class MyCountDownTimer extends CountDownTimer{
		public MyCountDownTimer(long starTime , long interval){
			super(starTime, interval);
		}

		@Override
		public void onTick(long millisUntilFinished) {
			text.setText(""+millisUntilFinished/1000);
		}

		@Override
		public void onFinish() {
			text.setText("Times up");
			Intent a = new Intent(getApplicationContext(), Inicio.class);
			startActivity(a);
		}
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_quiz, menu);
		return true;
	}
	private void setQuestionView()
	{
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		qid++;
	}
}
