package stikombali.alathitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangundatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar);
        Button btnSegitiga, btnPersegi, btnLingkaran, btnJajargenjang, btnBelahketupat, btnTrapesium, btnLayanglayang;

        btnSegitiga=(Button) findViewById(R.id.btnSegitiga);
        btnPersegi=(Button) findViewById(R.id.btnPersegi);
        btnLingkaran=(Button) findViewById(R.id.btnLingkaran);
        btnJajargenjang=(Button) findViewById(R.id.btnJajargenjang);
        btnBelahketupat=(Button) findViewById(R.id.btnBelahketupat);
        btnTrapesium=(Button) findViewById(R.id.btnTrapesium);
        btnLayanglayang = (Button) findViewById(R.id.btnLayanglayag);


        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSegitiga = new Intent(Bangundatar.this, segitiga.class);
                startActivity(toSegitiga);
            }
        });
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPersegi = new Intent(Bangundatar.this, Persegi.class);
                startActivity(toPersegi);
            }
        });
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLingkaran = new Intent(Bangundatar.this, Lingkaran.class);
                startActivity(toLingkaran);
            }
        });
        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toJajargenjang = new Intent(Bangundatar.this, Jajargenjang.class);
                startActivity(toJajargenjang);
            }
        });
        btnBelahketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBelahketupat = new Intent(Bangundatar.this, Belahketupat.class);
                startActivity(toBelahketupat);
            }
        });
        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTrapesium = new Intent(Bangundatar.this, Trapesium.class);
                startActivity(toTrapesium);
            }
        });
        btnLayanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLayanglayang = new Intent(Bangundatar.this, Layanglayang.class);
                startActivity(toLayanglayang);
            }
        });
    }
}
