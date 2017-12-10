package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Balok extends AppCompatActivity {
    private Button btnLuasPermukaanBalok, btnKelilingPermukaanBalok, btnVolumeBalok;
    private EditText etPanjangBalok, etTinggiBalok, etLebarbalok;
    private TextView tvHasilBalok;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        btnLuasPermukaanBalok = (Button) findViewById(R.id.btnluaspermukaanbalok);
        btnKelilingPermukaanBalok = (Button) findViewById(R.id.btnkelilingpermukaanbalok);
        btnVolumeBalok = (Button) findViewById(R.id.btnvolumebalok);

        etPanjangBalok = (EditText) findViewById(R.id.etpanjangbalok);
        etTinggiBalok = (EditText) findViewById(R.id.ettinggibalok);
        etLebarbalok = (EditText) findViewById(R.id.etlebarbalok);
        tvHasilBalok = (TextView) findViewById(R.id.tvHasilBalok);

        btnLuasPermukaanBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPanjangBalok.getText().toString().equals("")|| etLebarbalok.getText().toString().equals("")||etTinggiBalok.getText().toString().equals("")){
                    Toast.makeText(Balok.this, "Masukan panjang, tinggi dan lebar dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double panjang = Double.valueOf(etPanjangBalok.getText().toString());
                    double tinggi = Double.valueOf(etTinggiBalok.getText().toString());
                    double lebar = Double.valueOf(etLebarbalok.getText().toString());
                    double luasPermukaanBalok  = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
                    tvHasilBalok.setText(String.valueOf(luasPermukaanBalok));
                }
            }
        });
        btnKelilingPermukaanBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPanjangBalok.getText().toString().equals("")|| etLebarbalok.getText().toString().equals("")||etPanjangBalok.getText().toString().equals("")){
                    Toast.makeText(Balok.this, "Masukan panjang, tinggi dan lebar dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double panjang = Double.valueOf(etPanjangBalok.getText().toString());
                    double tinggi = Double.valueOf(etTinggiBalok.getText().toString());
                    double lebar = Double.valueOf(etLebarbalok.getText().toString());
                    double kelilingPermukaanBalok = 4*(panjang*lebar*tinggi);
                    tvHasilBalok.setText(String.valueOf(kelilingPermukaanBalok));
                }
            }
        });
        btnVolumeBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPanjangBalok.getText().toString().equals("")|| etLebarbalok.getText().toString().equals("")||etPanjangBalok.getText().toString().equals("")){
                    Toast.makeText(Balok.this, "Masukan panjang, tinggi dan lebar dengan benar", Toast.LENGTH_SHORT).show();
                } else {
                    double panjang = Double.valueOf(etPanjangBalok.getText().toString());
                    double tinggi = Double.valueOf(etTinggiBalok.getText().toString());
                    double lebar = Double.valueOf(etLebarbalok.getText().toString());
                    double volumeBalok = panjang*lebar*tinggi;
                    tvHasilBalok.setText(String.valueOf(volumeBalok));
                }
            }
        });
    }
}
