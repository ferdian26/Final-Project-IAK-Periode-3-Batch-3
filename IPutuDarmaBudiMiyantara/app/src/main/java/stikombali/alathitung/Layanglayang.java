package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class Layanglayang extends AppCompatActivity {
    Button btnLuaslayanglayang, btnKelilinglayanglayang;
    EditText etDiagonal1layanglayang, etDiagonal2layanglayang, etsisi1layanglayang, etsisi2layanglayang, etsisi3layanglayang, etsisi4layanglayang;
    TextView tvHasillayanglayang;
    //mencari panjang yang tidak diketahui
    Button btnMDPL, btnMSPL, btnMSPaL;
    EditText etMDPLdiagonalpendek, etMDPLsisimiringpendek, etMDPLsisimiringpanjang;
    EditText etMSPLdiagonalpendek, etMSPLmiringpanjang, etMSPLdagonalpanjang;
    EditText etMSPaLdiagonalpendek, etMSPaLmiringpendek, etMSPaLdiagonalpanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanglayang);
        btnLuaslayanglayang = (Button) findViewById(R.id.btnLuaslayanglayang);
        btnKelilinglayanglayang = (Button) findViewById(R.id.btnKelilinglayanglayang);

        etDiagonal1layanglayang = (EditText) findViewById(R.id.etDiagonal1layanglayang);
        etDiagonal2layanglayang = (EditText) findViewById(R.id.etDiagonal2layanglayang);

        etsisi1layanglayang = (EditText) findViewById(R.id.etsisi1layanglayang);
        etsisi2layanglayang = (EditText) findViewById(R.id.etsisi2layanglayang);
        etsisi3layanglayang = (EditText) findViewById(R.id.etsisi3layanglayang);
        etsisi4layanglayang = (EditText) findViewById(R.id.etsisi4layanglayang);

        tvHasillayanglayang = (TextView)  findViewById(R.id.tvHasillayanglayang);

        btnLuaslayanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etDiagonal1layanglayang.getText().toString().equals("")&&!etDiagonal2layanglayang.getText().toString().equals("")){
                    double Diagonal1 = Double.valueOf(etDiagonal1layanglayang.getText().toString());
                    double Diagonal2 = Double.valueOf(etDiagonal2layanglayang.getText().toString());
                    double Hasil = 0.5 * (Diagonal1 * Diagonal2);
                    tvHasillayanglayang.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Layanglayang.this, "Masukan diagonal 1 da diagonal 2", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnKelilinglayanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etsisi1layanglayang.getText().toString().equals("")||etsisi2layanglayang.getText().toString().equals("")||etsisi3layanglayang.getText().toString().equals("")||etsisi4layanglayang.getText().toString().equals("")){
                    Toast.makeText(Layanglayang.this, "Masukan sisi 1, sisi 2, sisi 3 dan sisi 4", Toast.LENGTH_SHORT).show();
                }else {
                    double Sisi1 = Double.valueOf(etsisi1layanglayang.getText().toString());
                    double Sisi2 = Double.valueOf(etsisi2layanglayang.getText().toString());
                    double Sisi3 = Double.valueOf(etsisi3layanglayang.getText().toString());
                    double Sisi4 = Double.valueOf(etsisi4layanglayang.getText().toString());
                    double Hasil = Sisi1+ Sisi2+ Sisi3+ Sisi4;
                    tvHasillayanglayang.setText(String.valueOf(Hasil));
                }
            }
        });
        btnMDPL = (Button) findViewById(R.id.btnMDPL);
        btnMSPL = (Button) findViewById(R.id.btnMSPL);
        btnMSPaL = (Button) findViewById(R.id.btnMSPaL);

        etMDPLdiagonalpendek = (EditText) findViewById(R.id.etMDPLdiagonalpendek);
        etMDPLsisimiringpendek = (EditText) findViewById(R.id.etMDPLsisimiringpendek);
        etMDPLsisimiringpanjang = (EditText) findViewById(R.id.etMDPLsisimiringpanjang);

        btnMDPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etMDPLdiagonalpendek.getText().toString().equals("")||etMDPLsisimiringpanjang.getText().toString().equals("")||etMDPLsisimiringpendek.getText().toString().equals("")){
                    Toast.makeText(Layanglayang.this, "Masukan diagonal pendek, sisi miring panjang dan sisi miring pendek", Toast.LENGTH_SHORT).show();
                } else {
                    //mencari panjang
                    double valuediagonalpendek = Double.valueOf(etMDPLdiagonalpendek.getText().toString());
                    double valuediagonalpendekbagi = valuediagonalpendek/2;
                    double valuesisimiringpanjang = Double.valueOf(etMDPLsisimiringpanjang.getText().toString());
                    double valuesegitigapanjang = sqrt((valuesisimiringpanjang*valuesisimiringpanjang)-(valuediagonalpendekbagi*valuediagonalpendekbagi));
                    //mencari segitiga kecil
                    double valuesisimiringpendek = Double.valueOf(etMDPLsisimiringpendek.getText().toString());
                    double valuesegitigapendek = sqrt((valuesisimiringpendek*valuesisimiringpendek)-(valuediagonalpendekbagi*valuediagonalpendekbagi));
                    double valuediagonalpanjangLfix = valuesegitigapanjang+valuesegitigapendek;
                    etDiagonal1layanglayang.setText(String.valueOf(valuediagonalpanjangLfix));
                }
            }
        });
        etMSPLdiagonalpendek = (EditText) findViewById(R.id.etMSPLdiagonalpendek);
        etMSPLmiringpanjang = (EditText) findViewById(R.id.etMSPLmiringpanjang);
        etMSPLdagonalpanjang = (EditText) findViewById(R.id.etMSPLdiagonalpanjang);
        btnMSPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etMSPLdagonalpanjang.getText().toString().equals("")||etMSPLdiagonalpendek.getText().toString().equals("")||etMSPLmiringpanjang.getText().toString().equals("")){
                    Toast.makeText(Layanglayang.this, "Masukan diagonal panjang, diagonal pendek, dan sisi miring panjang", Toast.LENGTH_SHORT).show();
                } else {
                    //mencari segitiga panjang dulu
                    double valuediagonalpendek = Double.valueOf(etMSPLdiagonalpendek.getText().toString());
                    double valuediagonalpendekbagi = valuediagonalpendek/2;
                    double valuemiringpanjang = Double.valueOf(etMSPLmiringpanjang.getText().toString());
                    double valuealassegitigapanjang = sqrt((valuemiringpanjang*valuemiringpanjang)-(valuediagonalpendekbagi*valuediagonalpendekbagi));
                    //mencari alas segitiga pendek
                    double valuediagonalpanjang = Double.valueOf(etMSPLdagonalpanjang.getText().toString());
                    double valuealasdiagonalpendek = valuediagonalpanjang-valuealassegitigapanjang;
                    double valuesisimiringpendekfix = sqrt((valuealasdiagonalpendek*valuealasdiagonalpendek)+(valuediagonalpendekbagi*valuediagonalpendekbagi));
                    etsisi1layanglayang.setText(String.valueOf(valuesisimiringpendekfix));
                    etsisi2layanglayang.setText(String.valueOf(valuesisimiringpendekfix));
                }
            }
        });
        etMSPaLdiagonalpendek = (EditText) findViewById(R.id.etMSPaLdiagonalpendek);
        etMSPaLmiringpendek = (EditText) findViewById(R.id.etMSPaLsisimiringpendek);
        etMSPaLdiagonalpanjang = (EditText) findViewById(R.id.etMSPaLdiagonalpanjang);
        btnMSPaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etMSPaLdiagonalpanjang.getText().toString().equals("")||etMSPaLdiagonalpendek.getText().toString().equals("")||etMSPaLmiringpendek.getText().toString().equals("")){
                    Toast.makeText(Layanglayang.this, "Masukan diagonal panjang, diagonal pendek, dan sisimiring pendek", Toast.LENGTH_SHORT).show();
                } else {
                    double valuediagonalpendek = Double.valueOf(etMSPaLdiagonalpendek.getText().toString());
                    double valuediagonalpendekbagi = valuediagonalpendek/2;
                    double valuemiringpendek = Double.valueOf(etMSPaLmiringpendek.getText().toString());
                    double alassegitigapendek = sqrt((valuemiringpendek*valuemiringpendek)-(valuediagonalpendekbagi*valuediagonalpendekbagi));
                    //mencari sisi miring panjang
                    double valuediagonalpanjang = Double.valueOf(etMSPaLdiagonalpanjang.getText().toString());
                    double alassegitigapanjang = valuediagonalpanjang-alassegitigapendek;
                    double sisimiringfix = sqrt((valuediagonalpendekbagi*valuediagonalpendekbagi)+(alassegitigapanjang*alassegitigapanjang));
                    etsisi3layanglayang.setText(String.valueOf(sisimiringfix));
                    etsisi4layanglayang.setText(String.valueOf(sisimiringfix));
                }
            }
        });
    }
}
