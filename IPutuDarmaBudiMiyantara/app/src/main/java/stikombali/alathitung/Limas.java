package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Limas extends AppCompatActivity {
    private Button btnLuasPermukaanLimas, btnVolumeLimas, btnCariLuasAlasSegitigaLimas, btnCariLuasTegakSegitiga, btnCariLuasAlasSegiempatLimas;
    private EditText etLuasAlasLimas, etLuasSisiTegakLimas, etJumlahSisiLimas, etTinggiLimas;
    private EditText etAlasAlasLimas, etTinggiAlasLimas;
    private EditText etAlasTegaklimas, ettinggiTegakLimas;
    private EditText etSisiSegiempatlimas;
    private TextView tvhasilLimas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);
        btnLuasPermukaanLimas = (Button) findViewById(R.id.btnLuasPermukaanLimas);
        btnVolumeLimas = (Button) findViewById(R.id.btnVolumeLimas);
        etLuasAlasLimas = (EditText) findViewById(R.id.etLuasAlasLimas);
        etLuasSisiTegakLimas = (EditText) findViewById(R.id.etLuasSisiTegakLimas);
        etJumlahSisiLimas = (EditText) findViewById(R.id.etJumlahSisiLimas);
        etTinggiLimas = (EditText) findViewById(R.id.etTinggiLimas);

        tvhasilLimas = (TextView) findViewById(R.id.tvHasilLimas);

        btnCariLuasAlasSegitigaLimas = (Button) findViewById(R.id.btnCariLuasAlasSegitigaLimas);
        etAlasAlasLimas = (EditText) findViewById(R.id.etalasAlasLimas);
        etTinggiAlasLimas = (EditText) findViewById(R.id.etTinggiAlasLimas);

        btnCariLuasTegakSegitiga = (Button) findViewById(R.id.btnLuasTegakLimas);
        etAlasTegaklimas = (EditText) findViewById(R.id.etAlasTegak);
        ettinggiTegakLimas = (EditText) findViewById(R.id.etTinggiLimas);

        btnCariLuasAlasSegiempatLimas = (Button) findViewById(R.id.btnCariLuasAlasSegiempatLimas);
        etSisiSegiempatlimas = (EditText) findViewById(R.id.etSisiSegiempetLimas);

        btnLuasPermukaanLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etJumlahSisiLimas.getText().toString().equals("3")&&!etLuasAlasLimas.getText().toString().equals("")&&!etLuasSisiTegakLimas.getText().toString().equals("")&&etTinggiLimas.getText().toString().equals("")){
                    double luasAlas = Double.valueOf(etLuasAlasLimas.getText().toString());
                    double sisiTegak = Double.valueOf(etLuasSisiTegakLimas.getText().toString());
                    double jumlahSisiTegak = Double.valueOf(etJumlahSisiLimas.getText().toString());
                    double luasPermukaan = luasAlas+(sisiTegak*jumlahSisiTegak);
                    tvhasilLimas.setText(String.valueOf(luasPermukaan));
                }else if (etJumlahSisiLimas.getText().toString().equals("4")&&!etLuasAlasLimas.getText().toString().equals("")&&!etLuasSisiTegakLimas.getText().toString().equals("")&&etTinggiLimas.getText().toString().equals("")){
                    double luasAlas = Double.valueOf(etLuasAlasLimas.getText().toString());
                    double sisiTegak = Double.valueOf(etLuasSisiTegakLimas.getText().toString());
                    double jumlahSisiTegak = Double.valueOf(etJumlahSisiLimas.getText().toString());
                    double luasPermukaan = luasAlas+(sisiTegak*jumlahSisiTegak);
                    tvhasilLimas.setText(String.valueOf(luasPermukaan));
                }else if (etJumlahSisiLimas.getText().toString().equals("5")&&!etLuasAlasLimas.getText().toString().equals("")&&!etLuasSisiTegakLimas.getText().toString().equals("")&&etTinggiLimas.getText().toString().equals("")){
                    double luasAlas = Double.valueOf(etLuasAlasLimas.getText().toString());
                    double sisiTegak = Double.valueOf(etLuasSisiTegakLimas.getText().toString());
                    double jumlahSisiTegak = Double.valueOf(etJumlahSisiLimas.getText().toString());
                    double luasPermukaan = luasAlas+(sisiTegak*jumlahSisiTegak);
                    tvhasilLimas.setText(String.valueOf(luasPermukaan));
                }else if (etJumlahSisiLimas.getText().toString().equals("6")&&!etLuasAlasLimas.getText().toString().equals("")&&!etLuasSisiTegakLimas.getText().toString().equals("")&&etTinggiLimas.getText().toString().equals("")) {
                    double luasAlas = Double.valueOf(etLuasAlasLimas.getText().toString());
                    double sisiTegak = Double.valueOf(etLuasSisiTegakLimas.getText().toString());
                    double jumlahSisiTegak = Double.valueOf(etJumlahSisiLimas.getText().toString());
                    double luasPermukaan = luasAlas + (sisiTegak * jumlahSisiTegak);
                    tvhasilLimas.setText(String.valueOf(luasPermukaan));
                } else if (etJumlahSisiLimas.getText().toString().equals("")||etLuasAlasLimas.getText().toString().equals("")||etLuasSisiTegakLimas.getText().toString().equals("")||etTinggiLimas.getText().toString().equals("")){
                    Toast.makeText(Limas.this,"masukan luas alas, luas sisi tegak dan jumlah sisi tegak",Toast.LENGTH_LONG).show();
                } else if (!etJumlahSisiLimas.getText().toString().equals("")&&!etLuasAlasLimas.getText().toString().equals("")&&!etLuasSisiTegakLimas.getText().toString().equals("")&&!etTinggiLimas.getText().toString().equals("")){
                    Toast.makeText(Limas.this,"masukan luas alas, luas sisi tegak dan jumlah sisi tegak",Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(Limas.this,"Hanya terdapat limas segitiga, segiempat dan segilima",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnVolumeLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etLuasAlasLimas.getText().toString().equals("") && !etTinggiLimas.getText().toString().equals("")&&etLuasSisiTegakLimas.getText().toString().equals("")&&etJumlahSisiLimas.getText().toString().equals("")){
                    //ini luas sisi tegak dan juga jumlah kosong, ini mencari volume
                    double luasAlas = Double.valueOf(etLuasAlasLimas.getText().toString());
                    double tinggi = Double.valueOf(etTinggiLimas.getText().toString());
                    double volume = 0.3333333333333333*luasAlas*tinggi;
                    tvhasilLimas.setText(String.valueOf(volume));
                }else {
                    Toast.makeText(Limas.this, "Masukan luas alas dan juga tinggi saja", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCariLuasAlasSegitigaLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etAlasAlasLimas.getText().toString().equals("") || etTinggiAlasLimas.getText().toString().equals("")){
                    Toast.makeText(Limas.this, "Masukan angka dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double alasAlas = Double.valueOf(etAlasAlasLimas.getText().toString());
                    double tinggiAlas = Double.valueOf(etTinggiAlasLimas.getText().toString());
                    double luasAlas = 0.5 *alasAlas*tinggiAlas;
                    etLuasAlasLimas.setText(String.valueOf(luasAlas));
                }
            }
        });
        btnCariLuasTegakSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etAlasTegaklimas.getText().toString().equals("") || ettinggiTegakLimas.getText().toString().equals("")){
                    Toast.makeText(Limas.this, "Masukan angka dengan benar", Toast.LENGTH_SHORT).show();
                }else {
                    double alasTegak = Double.valueOf(etAlasTegaklimas.getText().toString());
                    double tinggiTegak = Double.valueOf(ettinggiTegakLimas.getText().toString());
                    double luasTegak = 0.5 *alasTegak*tinggiTegak;
                    etLuasSisiTegakLimas.setText(String.valueOf(luasTegak));
                }
            }
        });
        btnCariLuasAlasSegiempatLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etSisiSegiempatlimas.getText().toString().equals("")){
                    Toast.makeText(Limas.this, "Masukan angka dengan benar", Toast.LENGTH_LONG).show();
                }else {
                    double sisiSegiempat = Double.valueOf(etSisiSegiempatlimas.getText().toString());
                    double hasil = sisiSegiempat*sisiSegiempat;
                    etLuasAlasLimas.setText(String.valueOf(hasil));
                }
            }
        });


    }
}
