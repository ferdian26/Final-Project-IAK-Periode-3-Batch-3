package stikombali.alathitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    Button btnSamakaki, btnSamasisi, btnSikusiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        btnSamakaki = (Button) findViewById(R.id.btnSamakaki);
        btnSamasisi = (Button) findViewById(R.id.btnSsamasisi);
        btnSikusiku = (Button) findViewById(R.id.btnSikusiku);

        btnSamakaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSamakaki = new Intent(segitiga.this, Samakaki.class);
                startActivity(toSamakaki);
            }
        });
        btnSamasisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSamasisi = new Intent(segitiga.this, Samasisi.class);
                startActivity(toSamasisi);
            }
        });
        btnSikusiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSikusiku = new Intent(segitiga.this, Sikusiku.class);
                startActivity(toSikusiku);
            }
        });
    }
}
