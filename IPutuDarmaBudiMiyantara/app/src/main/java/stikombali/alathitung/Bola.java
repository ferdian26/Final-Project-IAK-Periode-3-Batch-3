package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bola extends AppCompatActivity {
    private Button btnLuasPermukaanBola, btnVolumeBola;
    private EditText etJarijaribola, etDiameterBola;
    private TextView tvHasilBola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        btnLuasPermukaanBola = (Button) findViewById(R.id.btnluaspermukaanbola);
        btnVolumeBola = (Button) findViewById(R.id.btnVolumeBola);
        etJarijaribola = (EditText) findViewById(R.id.etjarijaribola);
        etDiameterBola = (EditText) findViewById(R.id.etdiameterbola);
        tvHasilBola = (TextView) findViewById(R.id.tvhasilbola);

        btnLuasPermukaanBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etJarijaribola.getText().toString().equals("")&&!etDiameterBola.getText().toString().equals("")){
                    //ini diameter bola
                    double diameter = Double.valueOf(etDiameterBola.getText().toString());
                    double jariJari = diameter/2;
                    double luaspermukaanbola = 4*3.14*(Math.pow(jariJari, 2));
                    tvHasilBola.setText(String.valueOf(luaspermukaanbola));
                } else if (etDiameterBola.getText().toString().equals("")&&!etJarijaribola.getText().toString().equals("")){
                    //inijarijari
                    double jariJari = Double.valueOf(etJarijaribola.getText().toString());
                    double luaspermukaan = 4*3.14*(Math.pow(jariJari, 2));
                    tvHasilBola.setText(String.valueOf(luaspermukaan));
                } else {
                    Toast.makeText(Bola.this, "masukan diameter atau jari-jari", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVolumeBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etDiameterBola.getText().toString().equals("") && etJarijaribola.getText().toString().equals("")){
                    Toast.makeText(Bola.this , "Masukan diameter atau jari jari",Toast.LENGTH_LONG).show();
                } else if (etJarijaribola.getText().toString().equals("")){
                    //ini diameter
                    double diameter = Double.valueOf(etDiameterBola.getText().toString());
                    double rusuk = diameter/2;
                    double volumebola = (4/3)*3.14*(Math.pow(rusuk, 2));
                    tvHasilBola.setText(String.valueOf(volumebola));
                } else if (etDiameterBola.getText().toString().equals("")){
                    //ini jarijari
                    double rusuk = Double.valueOf(etJarijaribola.getText().toString());
                    double volumeBola = (4/3)*3.14*(Math.pow(rusuk, 2));
                    tvHasilBola.setText(String.valueOf(volumeBola));
                } else if (!etJarijaribola.getText().toString().equals("")&&!etDiameterBola.getText().toString().equals("")){
                    Toast.makeText(Bola.this, "Jangan Masukan Keduanya", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
