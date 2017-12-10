package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Samakaki extends AppCompatActivity {
    //Luas
    Button btnHasilLuas;
    EditText etAlas, etTinggi;
    TextView tvHasil;
    //Keliling
    Button btnHasilkeliling;
    EditText etSisialas, etSisiMiring;
    //Mencari alas, tinggi dan sisi miring
    Button btnSM, btnMT, btnMA;
    EditText etSMtinggi, etSMalas, etMTalas, etMTmiring, etMAtinggi, etMAsisimiring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samakaki);
        //luas
        btnHasilLuas = (Button) findViewById(R.id.btnHasilluas);
        etAlas = (EditText) findViewById(R.id.etAlas);
        etTinggi = (EditText) findViewById(R.id.etTinggi);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        //Keliling
        btnHasilkeliling = (Button) findViewById(R.id.btnHasilKeliling);
        etSisialas = (EditText) findViewById(R.id.etSisiAlas);
        etSisiMiring = (EditText) findViewById(R.id.etSisimiring);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etAlas.getText().toString().equals("")&&!etTinggi.getText().toString().equals("")){
                    double Valuealas = Double.valueOf(etAlas.getText().toString());
                    double Valuetingi = Double.valueOf(etTinggi.getText().toString());
                    double Hasil = 0.5 * Valuealas * Valuetingi;
                    tvHasil.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Samakaki.this, "masukan alas dan juga tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHasilkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSisialas.getText().toString().equals("")&&!etSisiMiring.getText().toString().equals("")){
                    double Valuealas = Double.valueOf(etSisialas.getText().toString());
                    double ValueSisimiring = Double.valueOf(etSisiMiring.getText().toString());
                    double Hasil = Valuealas + (ValueSisimiring*2);
                    tvHasil.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Samakaki.this, "masukan alas dan juga tinggi", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Sisi Miring segitiga
        btnSM = (Button) findViewById(R.id.btnSM);
        etSMalas = (EditText) findViewById(R.id.etSMalas);
        etSMtinggi = (EditText) findViewById(R.id.etSMtinggi);
        btnSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSMalas.getText().toString().equals("")&&!etSMtinggi.getText().toString().equals("")){
                    double Valuesmalas = Double.valueOf(etSMalas.getText().toString());
                    double Valuesmalas1 = Valuesmalas/2;
                    double Valuesmtinggi = Double.valueOf(etSMtinggi.getText().toString());
                    double Valuemiring = sqrt((Valuesmalas1*Valuesmalas1)+(Valuesmtinggi*Valuesmtinggi));
                    etSisiMiring.setText(String.valueOf(Valuemiring));
                    etSisialas.setText(String.valueOf(Valuesmalas));
                    etTinggi.setText(String.valueOf(Valuesmtinggi));
                } else {
                    Toast.makeText(Samakaki.this, "masukan alas dan juga tinggi", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //Tinggi segitiga
        btnMT = (Button) findViewById(R.id.btnMT);
        etMTalas = (EditText) findViewById(R.id.etMTalas);
        etMTmiring = (EditText) findViewById(R.id.etMTMiring);
        btnMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etMTalas.getText().toString().equals("")&&!etMTmiring.getText().toString().equals("")){
                    double Valuemtalas = Double.valueOf(etMTalas.getText().toString());
                    double Valuemtalas1 = Valuemtalas/2;
                    double Valuemtmiring = Double.valueOf(etMTmiring.getText().toString());
                    double Valuetinggi = sqrt((Valuemtmiring*Valuemtmiring)-(Valuemtalas1*Valuemtalas1));
                    etTinggi.setText(String.valueOf(Valuetinggi));
                    etSisiMiring.setText(String.valueOf(Valuemtmiring));
                    etAlas.setText(String.valueOf(Valuemtalas));
                } else {
                    Toast.makeText(Samakaki.this, "masukan alas dan sisi miring", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Alas Segitiga
        btnMA = (Button) findViewById(R.id.btnMA);
        etMAtinggi = (EditText) findViewById(R.id.etMAtinggi);
        etMAsisimiring = (EditText) findViewById(R.id.etMAsisimiring);
        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etMAsisimiring.getText().toString().equals("")&&!etMAtinggi.getText().toString().equals("")){
                    double Valuetinggi = Double.valueOf(etMAtinggi.getText().toString());
                    double Valuesisimiring = Double.valueOf(etMAsisimiring.getText().toString());
                    double Valuealas = sqrt((Valuesisimiring*Valuesisimiring)-(Valuetinggi*Valuetinggi));
                    double Valuealasfix = Valuealas*2;
                    etAlas.setText(String.valueOf(Valuealasfix));
                    etSisiMiring.setText(String.valueOf(Valuesisimiring));
                    etTinggi.setText(String.valueOf(Valuetinggi));
                } else {
                    Toast.makeText(Samakaki.this, "masukan tinggi dan sisi miring", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
