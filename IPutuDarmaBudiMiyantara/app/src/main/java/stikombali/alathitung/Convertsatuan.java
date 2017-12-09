package stikombali.alathitung;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Convertsatuan extends AppCompatActivity {

    Spinner spspiner1, spspiner2;
    Button btncovert;
    EditText etfrom;
    TextView tvto;

    Spinner spspinner1m2, spspinner2m2;
    Button btnconvertm2;
    EditText etfromm2;
    TextView tvtom2;

    Spinner spspinner1m3, spspinner2m3;
    Button btnconvertm3;
    EditText etfromm3;
    TextView tvtom3;

    Spinner spspinnerberat1, spspinnerberat2;
    Button btnconvertberat;
    EditText etfromberat;
    TextView tvtoberat;
    int to = 0, from = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertsatuan);
        panjang();
        luas();
        volume();
        berat();
    }
    private void panjang(){

        ArrayList<String> arrayspiner1 = new ArrayList<>();
        ArrayList<String> arrayspiner2 = new ArrayList<>();
        spspiner1 = (Spinner) findViewById(R.id.spspiner1);
        spspiner2 = (Spinner) findViewById(R.id.spspiner2);

        etfrom = (EditText) findViewById(R.id.etfrom);
        tvto = (TextView) findViewById(R.id.tvto);
        btncovert = (Button) findViewById(R.id.btnconvert);

        arrayspiner1.add("km");
        arrayspiner1.add("hm");
        arrayspiner1.add("dam");
        arrayspiner1.add("m");
        arrayspiner1.add("dm");
        arrayspiner1.add("cm");
        arrayspiner1.add("mm");

        arrayspiner2.add("km");
        arrayspiner2.add("hm");
        arrayspiner2.add("dam");
        arrayspiner2.add("m");
        arrayspiner2.add("dm");
        arrayspiner2.add("cm");
        arrayspiner2.add("mm");

        final ArrayAdapter<String> array1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayspiner1);
        final ArrayAdapter<String> array2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayspiner2);

        spspiner1.setAdapter(array1);
        spspiner2.setAdapter(array2);

        spspiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spspiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btncovert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etfrom.getText().toString().equals("")){
                    int cek = 0;
                    double operator = Double.valueOf(etfrom.getText().toString());
                    if (from < to){
                        cek = to-from;
                        for (int i = 0;i<cek;i++){
                            operator = operator*10;
                        }
                    }
                    else if (from > to){
                        cek = from-to;
                        for (int i=0;i<cek;i++){
                            operator = operator/10;
                        }
                    }
                    else {
                        tvto.setText(String.valueOf(operator));
                        Toast.makeText(Convertsatuan.this,"Nilai Sama",Toast.LENGTH_LONG).show();
                    }
                    tvto.setText(String.valueOf(operator));
                } else {
                    Toast.makeText(Convertsatuan.this, "masukan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void luas(){

        spspinner1m2 = (Spinner) findViewById(R.id.spspiner1m2);
        spspinner2m2 = (Spinner) findViewById(R.id.spspiner2m2);
        etfromm2 = (EditText) findViewById(R.id.etfromm2);
        tvtom2 = (TextView) findViewById(R.id.tvtom2);
        btnconvertm2 = (Button) findViewById(R.id.btnconvertm2);

        ArrayList<String> Arrayspinner1m2 = new ArrayList<>();
        ArrayList<String> Arrayspinner2m2 = new ArrayList<>();

        Arrayspinner1m2.add("km2");
        Arrayspinner1m2.add("hm2");
        Arrayspinner1m2.add("dam2");
        Arrayspinner1m2.add("m2");
        Arrayspinner1m2.add("dm2");
        Arrayspinner1m2.add("cm2");
        Arrayspinner1m2.add("mm2");

        Arrayspinner2m2.add("km2");
        Arrayspinner2m2.add("hm2");
        Arrayspinner2m2.add("dam2");
        Arrayspinner2m2.add("m2");
        Arrayspinner2m2.add("dm2");
        Arrayspinner2m2.add("cm2");
        Arrayspinner2m2.add("mm2");

        final ArrayAdapter<String> array1m2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Arrayspinner1m2);
        final ArrayAdapter<String> array2m2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Arrayspinner2m2);

        spspinner1m2.setAdapter(array1m2);
        spspinner2m2.setAdapter(array2m2);

        spspinner1m2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spspinner2m2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnconvertm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etfromm2.getText().toString().equals("")) {
                    double operator = Double.valueOf(etfromm2.getText().toString());
                    int cek=0;
                    if (from < to){
                        cek = to-from;
                        for (int i=0;i<cek;i++){
                            operator = operator*100;
                        }
                    }
                    else if (from > to){
                        cek = from-to;
                        for (int i = 0;i<cek;i++){
                            operator = operator/100;
                        }
                    }
                    else {
                        tvtom2.setText(String.valueOf(operator));
                        Toast.makeText(Convertsatuan.this,"Nilai Sama",Toast.LENGTH_LONG).show();
                    }
                    tvtom2.setText(String.valueOf(operator));
                } else {
                    Toast.makeText(Convertsatuan.this, "masukan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void volume(){

        spspinner1m3 = (Spinner) findViewById(R.id.spspiner1m3);
        spspinner2m3 = (Spinner) findViewById(R.id.spspiner2m3);
        etfromm3 = (EditText) findViewById(R.id.etfromm3);
        tvtom3 = (TextView) findViewById(R.id.tvtom3);
        btnconvertm3 = (Button) findViewById(R.id.btnconvertm3);

        ArrayList<String> Arrayspspinner1 = new ArrayList<>();
        ArrayList<String> Arrayspspinner2 = new ArrayList<>();

        Arrayspspinner1.add("km3");
        Arrayspspinner1.add("hm3");
        Arrayspspinner1.add("dam3");
        Arrayspspinner1.add("m3");
        Arrayspspinner1.add("dm3");
        Arrayspspinner1.add("cm3");
        Arrayspspinner1.add("mm3");

        Arrayspspinner2.add("km3");
        Arrayspspinner2.add("hm3");
        Arrayspspinner2.add("dam3");
        Arrayspspinner2.add("m3");
        Arrayspspinner2.add("dm3");
        Arrayspspinner2.add("cm3");
        Arrayspspinner2.add("mm3");

        final ArrayAdapter<String> Array1m3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Arrayspspinner1);
        final ArrayAdapter<String> Array2m3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Arrayspspinner2);

        spspinner1m3.setAdapter(Array1m3);
        spspinner2m3.setAdapter(Array2m3);

        spspinner1m3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spspinner2m3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnconvertm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etfromm3.getText().toString().equals("")){
                    int cek =0;
                    double operator = Double.valueOf(etfromm3.getText().toString());

                    if (from < to){
                        cek = to-from;
                        for (int i = 0;i<cek;i++){
                            operator = operator*1000;
                        }
                    }
                    else if (from > to){
                        cek = from-to;
                        for (int i=0;i<cek;i++){
                            operator = operator/1000;
                        }
                    }
                    else {
                        tvtom3.setText(String.valueOf(operator));
                        Toast.makeText(Convertsatuan.this,"Nilai Sama",Toast.LENGTH_LONG).show();
                    }
                    tvtom3.setText(String.valueOf(operator));
                } else {
                    Toast.makeText(Convertsatuan.this, "Masukan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void berat(){

        ArrayList <String> arrayberat1 = new ArrayList<>();
        ArrayList <String> arrayberat2 =  new ArrayList<>();

        btnconvertberat = (Button) findViewById(R.id.btnconvertberat);
        etfromberat = (EditText) findViewById(R.id.etfromberat);
        tvtoberat = (TextView) findViewById(R.id.tvtoberat);
        spspinnerberat1 = (Spinner) findViewById(R.id.spspiner1berat);
        spspinnerberat2 = (Spinner) findViewById(R.id.spspiner2berat);

        arrayberat1.add("kg");
        arrayberat1.add("hg");
        arrayberat1.add("dag");
        arrayberat1.add("g");
        arrayberat1.add("dg");
        arrayberat1.add("cg");
        arrayberat1.add("mg");

        arrayberat2.add("kg");
        arrayberat2.add("hg");
        arrayberat2.add("dag");
        arrayberat2.add("g");
        arrayberat2.add("dg");
        arrayberat2.add("cg");
        arrayberat2.add("mg");

        final ArrayAdapter<String> berat1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayberat1);
        final ArrayAdapter<String> berat2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayberat2);

        spspinnerberat1.setAdapter(berat1);
        spspinnerberat2.setAdapter(berat2);

        spspinnerberat1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spspinnerberat2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnconvertberat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etfromberat.getText().toString().equals("")){
                    double operator = Double.valueOf(etfromberat.getText().toString());
                    int cek = 0;
                    if (from<to){
                        cek = to-from;
                        for (int i = 0;i<cek;i++){
                            operator = operator*10;
                        }
                    }
                    else if (from>to){
                        cek = from-to;
                        for (int i = 0;i<cek;i++){
                            operator = operator/10;
                        }
                    }
                    else{
                        tvtoberat.setText(String.valueOf(operator));
                        Toast.makeText(Convertsatuan.this,"Nilai Sama",Toast.LENGTH_LONG).show();
                    }
                    tvtoberat.setText(String.valueOf(operator));
                } else {
                    Toast.makeText(Convertsatuan.this, "Masukan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
