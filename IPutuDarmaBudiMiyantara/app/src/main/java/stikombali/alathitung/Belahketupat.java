package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class Belahketupat extends AppCompatActivity {
    //mencari luas dan keliling
    Button btnLuasbelahketupat, btnKelilingbelahketupat;
    EditText etdiagonal1, etdiagonal2, etsisibelahketupat;
    TextView tvHasilbelahketupat;
    //mencari salah satu diagonal dan salah satu sisi
    Button btnMDD, btnMSD;
    EditText etMDDdiagonal, etMDDsisi, etMSDdiagonal1, etMSDdiagonal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat);
        btnLuasbelahketupat = (Button) findViewById(R.id.btnluasbelahketupat);
        btnKelilingbelahketupat = (Button) findViewById(R.id.btnkelilingBelahketupat);
        etdiagonal1 = (EditText) findViewById(R.id.etdiagonal1);
        etdiagonal2 = (EditText) findViewById(R.id.etdiagonal2);
        etsisibelahketupat = (EditText) findViewById(R.id.etsisibelahketupat);
        tvHasilbelahketupat = (TextView) findViewById(R.id.tvHasilbelahketupat);

        btnLuasbelahketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etdiagonal1.getText().toString().equals("")&&etdiagonal2.getText().toString().equals("")){
                    Toast.makeText(Belahketupat.this, "Masukan diagonal 1 dan 2 dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double Diagonal1 = Double.valueOf(etdiagonal1.getText().toString());
                    double Diagonal2 = Double.valueOf(etdiagonal2.getText().toString());
                    double Hasil = 0.5* Diagonal1* Diagonal2;
                    tvHasilbelahketupat.setText(String.valueOf(Hasil));
                }

            }
        });
        btnKelilingbelahketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etsisibelahketupat.getText().toString().equals("")){
                    Toast.makeText(Belahketupat.this, "masukan salah satu sisi", Toast.LENGTH_SHORT).show();
                } else {
                    double Panjangsisi = Double.valueOf(etsisibelahketupat.getText().toString());
                    double Hasil = 4* Panjangsisi;
                    tvHasilbelahketupat.setText(String.valueOf(Hasil));
                }

            }
        });
        //mencari salah satu diagonal dan salah satu sisi
        btnMDD = (Button) findViewById(R.id.btnMDD);
        btnMSD = (Button) findViewById(R.id.btnMSD);
        etMDDdiagonal = (EditText) findViewById(R.id.etMDDdiagonal);
        etMDDsisi = (EditText) findViewById(R.id.etMDDsisi);
        etMSDdiagonal1 = (EditText) findViewById(R.id.etMSDdiagonal1);
        etMSDdiagonal2 = (EditText) findViewById(R.id.etMSDdiagonal2);
        //mencari diagonal
        btnMDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etMDDdiagonal.getText().toString().equals("")||etMDDsisi.getText().toString().equals("")){
                    Toast.makeText(Belahketupat.this, "Masukan salah satu diagonal dan juga salah satu sisi", Toast.LENGTH_SHORT).show();
                }else {
                    double valuediagonal = Double.valueOf(etMDDdiagonal.getText().toString());
                    double valuediagonal1 = valuediagonal/2;
                    double valuesisi = Double.valueOf(etMDDsisi.getText().toString());
                    double valuediagonalbagi = sqrt((valuesisi*valuesisi)-(valuediagonal1*valuediagonal1));
                    double valuediagonalfix = valuediagonalbagi*2;
                    etdiagonal1.setText(String.valueOf(valuediagonalfix));
                }
            }
        });
        btnMSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etMSDdiagonal1.getText().toString().equals("")||etMSDdiagonal2.getText().toString().equals("")){
                    Toast.makeText(Belahketupat.this, "masukan diagonal 1 dan diagonal 2 dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double valuediagonal1 = Double.valueOf(etMSDdiagonal1.getText().toString());
                    double valuediagonal1bagi = valuediagonal1/2;
                    double valuediagonal2 = Double.valueOf(etMSDdiagonal2.getText().toString());
                    double valuediagonal2bagi = valuediagonal2/2;
                    double valuesisidiagonalfix = sqrt((valuediagonal1bagi*valuediagonal1bagi)+(valuediagonal2bagi*valuediagonal2bagi));
                    etsisibelahketupat.setText(String.valueOf(valuesisidiagonalfix));
                }
            }
        });
    }
}
