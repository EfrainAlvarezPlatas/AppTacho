package mx.edu.utng.apptacho.login;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mx.edu.utng.apptacho.R;

public class LoginPrincipal extends ActionBarActivity
{

    LoginDataBaseAdapter loginDataBaseAdapter;
    Button btnAcceder;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // create a instance of SQLite Database
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();




    }
    // Methos to handleClick Event of Sign In Button
    public void signIn(View V)
    {

        // get the Refferences of views
        final  EditText editTextUserName=(EditText)findViewById(R.id.edt_user_name_login);
        final  EditText editTextPassword=(EditText)findViewById(R.id.edt_password_login);






        btnAcceder=(Button)findViewById(R.id.btn_sign_in);
        // Set On ClickListener
        btnAcceder.setOnClickListener(new View.OnClickListener() {






            public void onClick(View v) {
                // get The User name and Password
                String userName = editTextUserName.getText().toString();
                String password = editTextPassword.getText().toString();

                // fetch the Password form database for respective user name
                String storedPassword = loginDataBaseAdapter.getSinlgeEntry(userName);

                // check if the Stored password matches with  Password entered by user
                if (password.equals(storedPassword)) {
                    Toast.makeText(getApplicationContext(), "Felicidades, has iniciado sesión con éxito", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }
}