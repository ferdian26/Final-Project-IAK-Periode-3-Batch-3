package stikombali.alathitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class menu extends AppCompatActivity {
    Button btnTambah, btnKurang,btnKali,btnBagi,btnPersen, btnMod, btnPangkat, btnakar2;
    Button btnbangundatar, btnbangunruang, btnconvertersatuan, btninfo;
    EditText Value1, Value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //pendeklerasian button kalkulator
        btnTambah=(Button) findViewById(R.id.btnTambah);
        btnKurang=(Button) findViewById(R.id.btnKurang);
        btnKali=(Button) findViewById(R.id.btnKali);
        btnBagi=(Button) findViewById(R.id.btnBagi);
        btnPersen=(Button) findViewById(R.id.btnPersen);
        btnMod=(Button) findViewById(R.id.btnMod);
        btnPangkat=(Button) findViewById(R.id.btnPangkat);
        btnakar2 = (Button) findViewById(R.id.btnakar2);

        //pendeklerasian button passing atau pindah
        btnbangundatar = (Button) findViewById(R.id.btnbangundatar);
        btnbangunruang = (Button) findViewById(R.id.btnbangunruang);

        btnconvertersatuan = (Button) findViewById(R.id.btnconversisatuan);
        btninfo = (Button) findViewById(R.id.btninfo);

        //pendeklerasian value
        Value1=(EditText) findViewById(R.id.Value1);
        Value2=(EditText) findViewById(R.id.Value2);

        //method untuk kalkulator
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    //mengubah tipe data variable dari string menjadi float
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2= Double.valueOf(Value2.getText().toString());
                    double Hasil=Valuee1+Valuee2;
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih menu penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2= Double.valueOf(Value2.getText().toString());
                    double Hasil=Valuee1-Valuee2;
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2= Double.valueOf(Value2.getText().toString());
                    double Hasil=Valuee1*Valuee2;
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2= Double.valueOf(Value2.getText().toString());
                    double Hasil=Valuee1/Valuee2;
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Hasil=Valuee1/100;
                    Value2.setText(String.valueOf(Hasil)+"%");
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama untuk menghitung persen", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2= Double.valueOf(Value2.getText().toString());
                    double Hasil= Valuee1 % Valuee2;
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPangkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&!Value2.getText().toString().equals("")){
                    double Valuee1= Double.valueOf(Value1.getText().toString());
                    double Valuee2 = Double.valueOf(Value2.getText().toString());
                    double Hasil= Math.pow(Valuee1,Valuee2);
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama dan kedua dahulu lalu pilih penjumlahan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnakar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Value1.getText().toString().equals("")&&Value2.getText().toString().equals("")){
                    double Valuee1 = Double.valueOf(Value1.getText().toString());
                    double Hasil = sqrt(Valuee1);
                    Value1.setText(String.valueOf(Hasil));
                } else {
                    Toast.makeText(menu.this, "masukan angka pertama", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //button untuk pindah ke benberapa layer
        btnbangundatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tobangundatar = new Intent(menu.this, Bangundatar.class);
                startActivity(tobangundatar);
            }
        });
        btnconvertersatuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toconvertsatuan = new Intent(menu.this, Convertsatuan.class);
                startActivity(toconvertsatuan);
            }
        });
        btnbangunruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBangunRuang = new Intent(menu.this,Bangunruang.class);
                startActivity(toBangunRuang);
            }
        });
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toinfo = new Intent(menu.this, info.class);
                startActivity(toinfo);
            }
        });
    }
}
