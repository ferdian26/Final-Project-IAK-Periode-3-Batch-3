package stikombali.alathitung;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Krucut extends AppCompatActivity {
    private Button btnLuasKerucut, btnVolumeKerucut;
    private EditText etJarijariKerucut, etDiameterKerucut, etTinggiKerucut, etSisiPelukisKerucut;
    private TextView tvHasilKerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krucut);



        btnLuasKerucut = (Button) findViewById(R.id.btnLuasPermukaanKerucut);
        btnVolumeKerucut = (Button) findViewById(R.id.btnVolumeKerucut);
        etJarijariKerucut = (EditText) findViewById(R.id.etJarijariKerucut);
        etDiameterKerucut = (EditText) findViewById(R.id.etDiameterKerucut);
        etTinggiKerucut = (EditText) findViewById(R.id.etTinggiKerucut);
        etSisiPelukisKerucut = (EditText) findViewById(R.id.etSisiPelukiskerucut);
        tvHasilKerucut = (TextView) findViewById(R.id.tvHasilKerucut);

        btnLuasKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etJarijariKerucut.getText().toString().equals("")&&!etSisiPelukisKerucut.getText().toString().equals("")&&!etTinggiKerucut.getText().toString().equals("")&&etDiameterKerucut.getText().toString().equals("")){
                    double jariJari = Double.valueOf(etJarijariKerucut.getText().toString());
                    double garisPelukis = Double.valueOf(etSisiPelukisKerucut.getText().toString());
                    double luasPermukaan = (3.14* Math.pow(jariJari,2))+(3.14*jariJari*garisPelukis);
                    tvHasilKerucut.setText(String.valueOf(luasPermukaan));
                } else if (!etDiameterKerucut.getText().toString().equals("")&&!etSisiPelukisKerucut.getText().toString().equals("")&&!etTinggiKerucut.getText().toString().equals("")&&etJarijariKerucut.getText().toString().equals("")){
                    double diameter = Double.valueOf(etDiameterKerucut.getText().toString());
                    double jariJari = diameter/2;
                    double garisPelukis = Double.valueOf(etSisiPelukisKerucut.getText().toString());
                    double luasPermukaan = (3.14* Math.pow(jariJari,2))+(3.14*jariJari*garisPelukis);
                    tvHasilKerucut.setText(String.valueOf(luasPermukaan));
                } else {
                    Toast.makeText(Krucut.this, "Masukan jari-jari atau dameter, dan masukan juga tinggi, sisi pelukis dengan benar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVolumeKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etDiameterKerucut.getText().toString().equals("")&&!etTinggiKerucut.getText().toString().equals("")&&etJarijariKerucut.getText().toString().equals("")&&etSisiPelukisKerucut.getText().toString().equals("")){
                    double diameter = Double.valueOf(etDiameterKerucut.getText().toString());
                    double tinggi = Double.valueOf(etTinggiKerucut.getText().toString());
                    double jariJari = diameter/2;
                    double volumeKerucut = 0.3333333333333333*3.14* Math.pow(jariJari,2)*tinggi;
                    tvHasilKerucut.setText(String.valueOf(volumeKerucut));
                } else if (!etJarijariKerucut.getText().toString().equals("")&&!etTinggiKerucut.getText().toString().equals("")&&etDiameterKerucut.getText().toString().equals("")&&etSisiPelukisKerucut.getText().toString().equals("")){
                    double jariJari = Double.valueOf(etJarijariKerucut.getText().toString());
                    double tinggi = Double.valueOf(etTinggiKerucut.getText().toString());
                    double volumeKerucut = 0.3333333333333333*3.14* Math.pow(jariJari,2)*tinggi;
                    tvHasilKerucut.setText(String.valueOf(volumeKerucut));
                }else{
                    Toast.makeText(Krucut.this, "masukan jari-jari atau diameter dan juga tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
