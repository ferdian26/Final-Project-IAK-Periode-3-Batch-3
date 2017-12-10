package stikombali.alathitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangunruang extends AppCompatActivity {
    Button btnKubus, btnBalok, btnLimas, btnKrucut, btnPrisma, btnTabung, btnBola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangunruang);

        btnKubus = (Button) findViewById(R.id.btnKubus);
        btnBalok = (Button) findViewById(R.id.btnBalok);
        btnLimas = (Button) findViewById(R.id.btnLimas);
        btnKrucut = (Button) findViewById(R.id.btnKrucut);
        btnTabung = (Button) findViewById(R.id.btnTabung);
        btnPrisma = (Button) findViewById(R.id.btnPrisma);
        btnBola = (Button) findViewById(R.id.btnBola);

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toKubus = new Intent(Bangunruang.this, Kubus.class);
                startActivity(toKubus);
            }
        });
        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBalok = new Intent(Bangunruang.this, Balok.class);
                startActivity(toBalok);
            }
        });
        btnLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLimas = new Intent(Bangunruang.this, Limas.class);
                startActivity(toLimas);
            }
        });
        btnKrucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toKrucut = new Intent(Bangunruang.this, Krucut.class);
                startActivity(toKrucut);
            }
        });
        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTabung = new Intent(Bangunruang.this, Tabung.class);
                startActivity(toTabung);
            }
        });
        btnPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPrisma = new Intent(Bangunruang.this, Prisma.class);
                startActivity(toPrisma);
            }
        });
        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBola = new Intent(Bangunruang.this,Bola.class);
                startActivity(toBola);
            }
        });
    }
}
