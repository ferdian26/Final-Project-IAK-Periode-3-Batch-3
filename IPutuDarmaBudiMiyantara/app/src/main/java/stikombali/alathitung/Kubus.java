package stikombali.alathitung;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;
import static java.sql.Types.DOUBLE;
import static java.sql.Types.NULL;

public class Kubus extends AppCompatActivity {

    Button btnKelPerKubus, btnLuasPerKubus, btnVolKubus;
    EditText etSisiKubus, etRusukKubus;
    TextView tvHasilKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        btnKelPerKubus = (Button) findViewById(R.id.btnKelPerKubus);
        btnLuasPerKubus = (Button) findViewById(R.id.btnLuasPerkubus);
        btnVolKubus = (Button) findViewById(R.id.btnVolKubus);
        etSisiKubus = (EditText) findViewById(R.id.etSisiKubus);
        etRusukKubus = (EditText) findViewById(R.id.etRusukKubus);
        tvHasilKubus = (TextView) findViewById(R.id.tvHasilKubus);

        btnLuasPerKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etRusukKubus.getText().toString().equals("") && etSisiKubus.getText().toString().equals("")){
                    Toast.makeText(Kubus.this,"masukan angkanya dahulu ya",Toast.LENGTH_LONG).show();
                }
                else if (etSisiKubus.getText().toString().equals("")){
//                    Toast.makeText(Kubus.this,"ini rusuk kubus",Toast.LENGTH_LONG).show();
                    double rusuk = Double.valueOf(etRusukKubus.getText().toString());
                    double hasilluas = rusuk*rusuk;
                    double hasil = hasilluas*6;
                    tvHasilKubus.setText(String.valueOf(hasil));
                }
                else if (etRusukKubus.getText().toString().equals("")){
//                    Toast.makeText(Kubus.this,"ini sisi kubus",Toast.LENGTH_LONG).show();
                    double sisikubus = Double.valueOf(etSisiKubus.getText().toString());
                    double hasil = sisikubus*6;
                    tvHasilKubus.setText(String.valueOf(hasil));
                }
                else {
                    Toast.makeText(Kubus.this,"jangan dimasukin keduanya",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnKelPerKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etRusukKubus.getText().toString().equals("") && etSisiKubus.getText().toString().equals("")){
                    Toast.makeText(Kubus.this, "masukan angkanya dahulu ya",Toast.LENGTH_LONG).show();
                }
                else if (etSisiKubus.getText().toString().equals("")){
                    //maka ini rusuk
                    double rusuk = Double.valueOf(etRusukKubus.getText().toString());
                    double hasil = 12 * rusuk;
                    tvHasilKubus.setText(String.valueOf(hasil));
                }
                else if (etRusukKubus.getText().toString().equals("")){
                    // equals adalah jika maka ini sisi kubus
                    double sisikubus = Double.valueOf(etSisiKubus.getText().toString());
                    double rusuk = sqrt (sisikubus);
                    double kelilingkubus =  rusuk*12;
                    tvHasilKubus.setText(String.valueOf(kelilingkubus));
                }
                else{
                    Toast.makeText(Kubus.this, "Jangan dimasukan keduanya",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnVolKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etRusukKubus.getText().toString().equals("") && etSisiKubus.getText().toString().equals("")){
                    Toast.makeText(Kubus.this, "masukan salah angkanya dulu ya", Toast.LENGTH_LONG).show();
                } else if (etSisiKubus.getText().toString().equals("")){
                    //maka ini rusuk kubus
                    double rusuk = Double.valueOf(etRusukKubus.getText().toString());
                    // pow adalah pangkat (value 1 , value pangkat
                    double sisikubus = Math.pow(rusuk, 2);
                    double hasil = Math.pow(sisikubus,3);
                    tvHasilKubus.setText(String.valueOf(hasil));
                } else if (etRusukKubus.getText().toString().equals("")){
                    double sisi = Double.valueOf(etSisiKubus.getText().toString());
                    double hasil = Math.pow(sisi,3);
                    tvHasilKubus.setText(String.valueOf(hasil));
                }
            }
        });
    }
}
