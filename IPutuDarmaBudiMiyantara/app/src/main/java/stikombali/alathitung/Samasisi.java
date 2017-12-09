package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class Samasisi extends AppCompatActivity {
    //luas
    Button btnHasilSamasisi, btnLuassamasisi;
    EditText etSisi1Samasisi, etalassamasisi, ettinggisamasisi;
    TextView tvHasil;

    Button btnMTSSS;
    EditText etMTSSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samasisi);
        btnHasilSamasisi = (Button) findViewById(R.id.btnHasilKelilingSamasisi);
        btnLuassamasisi = (Button) findViewById(R.id.btnHasilluasSamasisi);
        etSisi1Samasisi = (EditText) findViewById(R.id.etSisi1Samasisi);
        etalassamasisi = (EditText) findViewById(R.id.etAlassamasisi);
        ettinggisamasisi = (EditText) findViewById(R.id.ettinggisamasisi);
        tvHasil = (TextView) findViewById(R.id.tvHasilSamasisi);

        btnMTSSS = (Button) findViewById(R.id.btnMTSSS);
        etMTSSS = (EditText) findViewById(R.id.etMTSSS);

        btnHasilSamasisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etSisi1Samasisi.getText().toString().equals("")){
                    double Value1 = Double.valueOf(etSisi1Samasisi.getText().toString());
                    double Hasil = Value1*3;
                    tvHasil.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(Samasisi.this, "masukan salah satu sisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnLuassamasisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etalassamasisi.getText().toString().equals("")&&!ettinggisamasisi.getText().toString().equals("")){
                    double Valuealas = Double.valueOf(etalassamasisi.getText().toString());
                    double Valuetinggi = Double.valueOf(ettinggisamasisi.getText().toString());
                    double hasilluas = 0.5*Valuealas*Valuetinggi;
                    tvHasil.setText(String.valueOf(hasilluas));
                } else {
                    Toast.makeText(Samasisi.this, "masukan alas dan tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMTSSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etMTSSS.getText().toString().equals("")){
                    double valuealas = Double.valueOf(etMTSSS.getText().toString());
                    double valuealasbagi = valuealas/2;
                    double sisimiring = Double.valueOf(etMTSSS.getText().toString());
                    double tinggi = sqrt((sisimiring*sisimiring)-(valuealasbagi*valuealasbagi));
                    ettinggisamasisi.setText(String.valueOf(tinggi));
                } else {
                    Toast.makeText(Samasisi.this, "masukan salah satu sisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
