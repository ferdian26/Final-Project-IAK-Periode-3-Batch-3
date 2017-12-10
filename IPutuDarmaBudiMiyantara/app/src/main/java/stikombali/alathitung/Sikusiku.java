package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class Sikusiku extends AppCompatActivity {
    //Luas
    Button btnHasilLuasSikusiku;
    EditText etAlasSikusiku, etTinggiSikusiku;
    TextView tvHasilSikusiku;
    //Keliling
    Button btnHasilkelilingSikusiku;
    EditText etSisi1Sikusiku, etSisi2Sikusiku, etSisi3Sikusiku;
    //mencari salahs satu sisi
    Button btnSikuMA, btnSikuMT, btnSikuSM;
    EditText etSikuMAmiring, etSikuMAtinggi, etSikuMTmiring, etSikuMTalas, etSikuSMalas, etSikuSMtinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikusiku);
        btnHasilLuasSikusiku = (Button) findViewById(R.id.btnHasilluasSikusiku);
        etAlasSikusiku = (EditText) findViewById(R.id.etAlasSikusiku);
        etTinggiSikusiku = (EditText) findViewById(R.id.etTinggiSikusiku);

        tvHasilSikusiku = (TextView) findViewById(R.id.tvHasilSikusiku);

        etSisi1Sikusiku = (EditText) findViewById(R.id.etSisi1Sikusiku);
        etSisi2Sikusiku = (EditText) findViewById(R.id.etSisi2Sikusiku);
        etSisi3Sikusiku = (EditText) findViewById(R.id.etSisi3Sikusiku);
        btnHasilkelilingSikusiku = (Button) findViewById(R.id.btnHasilKelilingSikusiku);

        btnHasilLuasSikusiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etAlasSikusiku.getText().toString().equals("")&&!etTinggiSikusiku.getText().toString().equals("")){
                    double ValueAlas = Double.valueOf(etAlasSikusiku.getText().toString());
                    double ValueTinggi = Double.valueOf(etTinggiSikusiku.getText().toString());
                    double Hasil =0.5* ValueAlas*ValueTinggi;
                    tvHasilSikusiku.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Sikusiku.this, "masukan alas dan tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHasilkelilingSikusiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSisi1Sikusiku.getText().toString().equals("")&&!etSisi2Sikusiku.getText().toString().equals("")&&!etSisi3Sikusiku.getText().toString().equals("")){
                    double ValueSisi1 = Double.valueOf(etSisi1Sikusiku.getText().toString());
                    double ValueSisi2 = Double.valueOf(etSisi2Sikusiku.getText().toString());
                    double ValueSisi3 = Double.valueOf(etSisi3Sikusiku.getText().toString());
                    double Hasil = ValueSisi1+ValueSisi2+ValueSisi3;
                    tvHasilSikusiku.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Sikusiku.this, "masukan sisi1, sisi2, sisis3", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //mencari salah satu sisi segitiga siku
        btnSikuMA = (Button) findViewById(R.id.btnSikuMA);
        btnSikuMT = (Button) findViewById(R.id.btnSikuMT);
        btnSikuSM = (Button) findViewById(R.id.btnSIkuSM);

        etSikuMAmiring = (EditText) findViewById(R.id.etSikuMAmiring);
        etSikuMAtinggi = (EditText) findViewById(R.id.etSikuMAtinggi);
        etSikuMTmiring = (EditText) findViewById(R.id.etSikuMTmiring);
        etSikuMTalas = (EditText) findViewById(R.id.etSikuMTalas);
        etSikuSMalas = (EditText) findViewById(R.id.etSikuSMAlas);
        etSikuSMtinggi = (EditText) findViewById(R.id.etSIkuSMtinggi);

        btnSikuMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSikuMAmiring.getText().toString().equals("")&&!etSikuMAtinggi.getText().toString().equals("")){
                    double valuemiring = Double.valueOf(etSikuMAmiring.getText().toString());
                    double valuetinggi =  Double.valueOf(etSikuMAtinggi.getText().toString());
                    double valuealasfix = sqrt((valuemiring*valuemiring)-(valuetinggi*valuetinggi));
                    etAlasSikusiku.setText(String.valueOf(valuealasfix));
                    etSisi1Sikusiku.setText(String.valueOf(valuealasfix));
                } else {
                    Toast.makeText(Sikusiku.this, "masukan sisi miring dan tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSikuMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSikuMTalas.getText().toString().equals("")&&!etSikuMTmiring.getText().toString().equals("")){
                    double valuemiring = Double.valueOf(etSikuMTmiring.getText().toString());
                    double valuealas = Double.valueOf(etSikuMTalas.getText().toString());
                    double valuetinggifix = sqrt((valuemiring*valuemiring)-(valuealas*valuealas));
                    etTinggiSikusiku.setText(String.valueOf(valuetinggifix));
                    etSisi2Sikusiku.setText(String.valueOf(valuetinggifix));
                } else {
                    Toast.makeText(Sikusiku.this, "masukan sisi miring dan alas", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSikuSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSikuSMalas.getText().toString().equals("")&&!etSikuSMtinggi.getText().toString().equals("")){
                    double valuealas = Double.valueOf(etSikuSMalas.getText().toString());
                    double valuetinggi = Double.valueOf(etSikuSMtinggi.getText().toString());
                    double valuemiringfix = sqrt((valuealas*valuealas)+(valuetinggi*valuetinggi));
                    etSisi3Sikusiku.setText(String.valueOf(valuemiringfix));
                } else {
                    Toast.makeText(Sikusiku.this, "masukan alas dan tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
