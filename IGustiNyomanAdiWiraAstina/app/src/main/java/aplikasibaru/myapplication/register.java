package aplikasibaru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    private EditText etremail;
    private EditText etruser;
    private EditText etrpass;
    private Button bregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );

        etremail= findViewById( R.id.etremail );
        etruser= findViewById( R.id.etruser );
        etrpass = findViewById( R.id.etrpass );
        bregister= findViewById( R.id.bregister );

        bregister.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etremail.getText().toString();
                String user = etruser.getText().toString();
                String pass = etrpass.getText().toString();
                if (!email.isEmpty() && !user.isEmpty() && !pass.isEmpty()) {
                    Toast.makeText( register.this, "Selamat Datang di Aplikasi", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent( register.this, listkategori.class );
                    startActivity( intent );
                } else {
                    Toast.makeText( register.this, "Data yang anda masukan harus lengkap", Toast.LENGTH_SHORT ).show();
                }
            }
        } );


    }
}
