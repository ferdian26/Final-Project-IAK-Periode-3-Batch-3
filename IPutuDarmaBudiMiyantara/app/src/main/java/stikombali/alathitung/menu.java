package stikombali.alathitung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu extends AppCompatActivity implements View.OnClickListener {
    Button btnTambah, btnKurang, btnKali, btnBagi, btnPersen, btnMod, btnPangkat, btnakar2;
    Button btnbangundatar, btnbangunruang, btnconvertersatuan, btninfo;
    EditText Value1, Value2;

    double value1, value2;

    TextView tv_hasil_perhitungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // todo 1: pisahkan setup environment dan implement onclick listener agar lebih rapi
        setupEnv();
        setupListener();
    }

    @Override
    public void onClick(View view) {

        // todo 3: untuk mengurangi redudansi kode, kita bisa membuat method seperti isValidForm() juga setIntent()

        // saran saja, sebaiknya buatkan standar desain dan kode, sehingga terhindar dari redudansi
        // apalagi jika banyak fitur dalam satu aplikasi

        switch (view.getId()) {
            case R.id.btnTambah:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 + value2));
                break;

            case R.id.btnKurang:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 - value2));
                break;

            case R.id.btnKali:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 * value2));
                break;

            case R.id.btnBagi:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 / value2));
                break;

            case R.id.btnPersen:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 / 100) + "%");
                break;

            case R.id.btnMod:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(value1 % value2));
                break;

            case R.id.btnPangkat:
                if (isValidForm())
                    tv_hasil_perhitungan.setText(String.valueOf(Math.pow(value1, value2)));
                break;

            case R.id.btnakar2:
                if (isValidForm()) tv_hasil_perhitungan.setText(String.valueOf(Math.sqrt(value1)));
                break;

            case R.id.btnbangundatar:
                setIntent(Bangundatar.class);
                break;

            case R.id.btnbangunruang:
                setIntent(Bangunruang.class);
                break;

            case R.id.btnconversisatuan:
                setIntent(Convertsatuan.class);
                break;

            case R.id.btninfo:
                setIntent(info.class);
                break;
        }
    }

    private void setupEnv() {
        //pendeklerasian button kalkulator
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnPersen = (Button) findViewById(R.id.btnPersen);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnPangkat = (Button) findViewById(R.id.btnPangkat);
        btnakar2 = (Button) findViewById(R.id.btnakar2);

        //pendeklerasian button passing atau pindah
        btnbangundatar = (Button) findViewById(R.id.btnbangundatar);
        btnbangunruang = (Button) findViewById(R.id.btnbangunruang);
        btnconvertersatuan = (Button) findViewById(R.id.btnconversisatuan);
        btninfo = (Button) findViewById(R.id.btninfo);

        //pendeklerasian value
        Value1 = (EditText) findViewById(R.id.Value1);
        Value2 = (EditText) findViewById(R.id.Value2);

        // sebaiknya hasil perhitungan disimpan di tempat yang khusus
        tv_hasil_perhitungan = (TextView) findViewById(R.id.tv_hasil_perhitungan);
    }

    private void setupListener() {
        //method untuk kalkulator
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);

        btnPersen.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnPangkat.setOnClickListener(this);
        btnakar2.setOnClickListener(this);

        //button untuk pindah ke benberapa layer
        btnbangundatar.setOnClickListener(this);
        btnbangunruang.setOnClickListener(this);
        btnconvertersatuan.setOnClickListener(this);
        btninfo.setOnClickListener(this);
    }

    private boolean isValidForm() {
        boolean isValid = true;
        String error_message = "Silahkan isi nilai disini!";

        String val1 = Value1.getText().toString();
        String val2 = Value2.getText().toString();

        if (val1.isEmpty()) {
            Value1.setError(error_message);
            isValid = false;
        }

        if (val2.isEmpty()) {
            Value2.setError(error_message);
            isValid = false;
        }

        if (isValid) {
            value1 = Double.parseDouble(val1);
            value2 = Double.parseDouble(val2);
        }

        return isValid;
    }

    private void setIntent(Class class_name) {
        Intent intent = new Intent(this, class_name);
        startActivity(intent);
    }
}
