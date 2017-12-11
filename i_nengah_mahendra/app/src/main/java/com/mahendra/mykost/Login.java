package com.mahendra.mykost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private ImageView iv_logo;
    private EditText et_username;
    private EditText et_password;
    private Button btn_login;
    private String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // kalau kodingnya masih sedikit, gpp seperti ini
        // tapi kalau aplikasinya berkembang akan repot
        // sebaiknya dibuatkan method baru

        getSupportActionBar().setTitle("Form Login  ");

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        btn_login = (Button) findViewById(R.id.btn_login);

        // todo 1: saat debug, untuk info ke tester, sebaiknya kasi clue agar bisa login
        final String passwd = "123";
        et_password.setHint("Password (" + passwd + ")");

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et_username.getText().toString();
                String pass = et_password.getText().toString();

                if (!user.isEmpty() && !pass.isEmpty()) {

                    // todo 2: sebaiknya untuk checking tidak hardcoded seperti pass.equal
                    if (pass.equals(passwd)) {

                        Toast.makeText(Login.this, "Welcome To Rumah Kost.id", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, Kostlist.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Password Anda salah", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(Login.this, "Data anda belum Lengkap", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}