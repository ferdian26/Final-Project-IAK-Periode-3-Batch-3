package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {
    private Button btnLuasTabung, btnVolumeTabung;
    private EditText etJariJariTabung, etDiameterTabung, etTinggiTabung;
    private TextView tvHasilTabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnLuasTabung = (Button) findViewById(R.id.btnLuasTabung);
        btnVolumeTabung = (Button) findViewById(R.id.btnVolumeTabung);

        etJariJariTabung = (EditText) findViewById(R.id.etJariJariTabung);
        etDiameterTabung = (EditText) findViewById(R.id.etDiameterTabung);
        etTinggiTabung = (EditText) findViewById(R.id.etTinggiTabung);

        tvHasilTabung = (TextView) findViewById(R.id.tvHasilTabung);

        btnLuasTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etJariJariTabung.getText().toString().equals("")&&!etTinggiTabung.getText().toString().equals("")&&etDiameterTabung.getText().toString().equals("")){
                    double jariJari = Double.valueOf(etJariJariTabung.getText().toString());
                    double tinggi = Double.valueOf(etTinggiTabung.getText().toString());
                    double hasil = 2 * 3.14 * jariJari * (tinggi+jariJari);
                    tvHasilTabung.setText(String.valueOf(hasil));
//                    Toast.makeText(Tabung.this, "ini jarijari", Toast.LENGTH_SHORT).show();
                } else if (!etDiameterTabung.getText().toString().equals("")&&!etTinggiTabung.getText().toString().equals("")&&etJariJariTabung.getText().toString().equals("")){
                    double diameter = Double.valueOf(etDiameterTabung.getText().toString());
                    double jariJari = diameter/2;
                    double tinggi = Double.valueOf(etTinggiTabung.getText().toString());
                    double hasil = 2 * 3.14 * jariJari * (tinggi+jariJari);
                    tvHasilTabung.setText(String.valueOf(hasil));
//                    Toast.makeText(Tabung.this, "ini diameter", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Tabung.this, "masukan jari-jari atau diameter dan juga tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVolumeTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etJariJariTabung.getText().toString().equals("")&&!etTinggiTabung.getText().toString().equals("")&&etDiameterTabung.getText().toString().equals("")){
                    double jarijari = Double.valueOf(etJariJariTabung.getText().toString());
                    double tinggi = Double.valueOf(etTinggiTabung.getText().toString());
                    double hasil = 3.14*jarijari*jarijari*tinggi;
                    tvHasilTabung.setText(String.valueOf(hasil));
                } else if (!etDiameterTabung.getText().toString().equals("")&&!etTinggiTabung.getText().toString().equals("")&&etJariJariTabung.getText().toString().equals("")){
                    double diameter = Double.valueOf(etDiameterTabung.getText().toString());
                    double jarijari = diameter/2;
                    double tinggi = Double.valueOf(etTinggiTabung.getText().toString());
                    double hasil = 3.14*jarijari*jarijari*tinggi;
                    tvHasilTabung.setText(String.valueOf(hasil));
                } else {
                    Toast.makeText(Tabung.this, "masukan jari-jari atau diameter dan juga tinggi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
