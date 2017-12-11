package aplikasibaru.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formlogin extends AppCompatActivity implements View.OnClickListener {
    private EditText etuser;
    private EditText etpass;
    private Button login;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);

        // todo 1: sebaiknya setup dan listener dipisah agar lebih rapi
        setupEnv();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.blogin:
                showLogin();
                break;

            case R.id.bregister:
                showRegister();
                break;
        }
    }

    private void setupEnv() {
        etuser = findViewById(R.id.etuser);
        etpass = findViewById(R.id.etpass);
        login = findViewById(R.id.blogin);
        register = findViewById(R.id.bregister);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    private void showLogin() {
        String user = etuser.getText().toString();
        String pass = etpass.getText().toString();

        if (!user.isEmpty() && !pass.isEmpty()) {
            Toast.makeText(Formlogin.this, "Selamat Datang di Aplikasi", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Formlogin.this, listkategori.class);
            startActivity(intent);

            // todo 2: agar tidak kembali lagi ke form login, jalankan method finish()
            finish();

        } else {
            Toast.makeText(Formlogin.this, "Username dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }

    private void showRegister() {
        Intent intent = new Intent(Formlogin.this, register.class);
        startActivity(intent);

        // todo 3: agar tidak kembali lagi ke form login, jalankan method finish()
        finish();
    }
}
