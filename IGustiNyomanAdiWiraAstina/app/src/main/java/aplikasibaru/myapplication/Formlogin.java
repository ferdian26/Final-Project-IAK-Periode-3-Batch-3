package aplikasibaru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formlogin extends AppCompatActivity {
    private EditText etuser;
    private EditText etpass;
    private Button login;
    private  Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);
        etuser = findViewById(R.id.etuser);
        etpass = findViewById(R.id.etpass);
        login= findViewById(R.id.blogin);
        register = findViewById( R.id.bregister );
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = etuser.getText().toString();
                String pass = etpass.getText().toString();
                if (!user.isEmpty() && !pass.isEmpty()) {
                    Toast.makeText(Formlogin.this, "Selamat Datang di Aplikasi", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Formlogin.this, listkategori.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Formlogin.this, "Username dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( Formlogin.this, aplikasibaru.myapplication.register.class );
                startActivity( intent );
            }
        } );

    }
}
