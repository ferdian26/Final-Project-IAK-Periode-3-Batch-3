package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Prisma extends AppCompatActivity {
    private Button btnLuasPermukaanPrisma, btnVolumePrisma, btnCariAlasPrisma, btnCariSelimutPrisma;
    private EditText etLuasAlasPrisma, etLuasSelimutPrisma, ettinggiPrisma, etAlasCariAlasPrisma, etTinggiCariAlasPrisma, etKelilingCariSelimutPrisma, etTinggiCariSelimutPrisma;
    private TextView tvHasilPrisma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);


        btnLuasPermukaanPrisma = (Button) findViewById(R.id.btnluasPermukaanPrisma);
        btnVolumePrisma = (Button) findViewById(R.id.btnvolumePrisma);
        etLuasAlasPrisma = (EditText) findViewById(R.id.etLuasAlasPrisma);
        etLuasSelimutPrisma = (EditText) findViewById(R.id.etluasSelimutPrisma);
        ettinggiPrisma = (EditText) findViewById(R.id.ettinggiPrisma);

        btnCariAlasPrisma = (Button) findViewById(R.id.btnCariAlasPrisma);
        etAlasCariAlasPrisma = (EditText) findViewById(R.id.etAlasCariAlasPrisma);
        etTinggiCariAlasPrisma = (EditText) findViewById(R.id.etTinggiCariAlasPrisma);

        btnCariSelimutPrisma = (Button) findViewById(R.id.btnCariSelimutPrisma);
        etKelilingCariSelimutPrisma = (EditText) findViewById(R.id.etKelilingCariSelimutPrisma);
        etTinggiCariSelimutPrisma = (EditText) findViewById(R.id.etTinggiCariSelimutPrisma);

        tvHasilPrisma =  (TextView) findViewById(R.id.tvHasilPrisma);

        btnLuasPermukaanPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etLuasAlasPrisma.getText().toString().equals("")&&!etLuasSelimutPrisma.getText().toString().equals("")&&ettinggiPrisma.getText().toString().equals("")){
                    double luasalas = Double.valueOf(etLuasAlasPrisma.getText().toString());
                    double luasselimut = Double.valueOf(etLuasSelimutPrisma.getText().toString());
                    double hasil = (2*luasalas) + luasselimut;
                    tvHasilPrisma.setText(String.valueOf(hasil));
                } else {
                    Toast.makeText(Prisma.this, "masukan luas alas dan juga luas selimut prisma", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVolumePrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etLuasAlasPrisma.getText().toString().equals("")&&!ettinggiPrisma.getText().toString().equals("")&&etLuasSelimutPrisma.getText().toString().equals("")){
                    double luasAlas = Double.valueOf(etLuasAlasPrisma.getText().toString());
                    double tinggiPrisma = Double.valueOf(ettinggiPrisma.getText().toString());
                    double hasil = luasAlas*tinggiPrisma;
                    tvHasilPrisma.setText(String.valueOf(hasil));
                } else {
                    Toast.makeText(Prisma.this, "masukan luas alas dan juga tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCariAlasPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etAlasCariAlasPrisma.getText().toString().equals("") && etTinggiCariAlasPrisma.getText().toString().equals("")){
                    Toast.makeText(Prisma.this, "Masukan alas dan tinggi segitiga dengan benar", Toast.LENGTH_SHORT).show();
                }else {
                    double alas = Double.valueOf(etAlasCariAlasPrisma.getText().toString());
                    double tinggi = Double.valueOf(etTinggiCariAlasPrisma.getText().toString());
                    double luasAlas = (1/2)*alas*tinggi;
                    etLuasAlasPrisma.setText(String.valueOf(luasAlas));
                }
            }
        });
        btnCariSelimutPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etKelilingCariSelimutPrisma.getText().toString().equals("") && etTinggiCariSelimutPrisma.getText().toString().equals("")){
                    Toast.makeText(Prisma.this, "Masukan text dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double keliling = Double.valueOf(etKelilingCariSelimutPrisma.getText().toString());
                    double tinggiselimut = Double.valueOf(etTinggiCariSelimutPrisma.getText().toString());
                    double hasil = keliling * tinggiselimut;
                    etLuasSelimutPrisma.setText(String.valueOf(hasil));
                }
            }
        });
    }
}
