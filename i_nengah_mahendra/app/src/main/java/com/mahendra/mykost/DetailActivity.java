package com.mahendra.mykost;

import android.os.PersistableBundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView image_detailkost;
    TextView detailnama, detailprise, detailaddress, detaildeskripsi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        image_detailkost = (ImageView) findViewById(R.id.iv_detailkost);
        detailnama = (TextView) findViewById(R.id.tv_detailkost);
        detailprise = (TextView) findViewById(R.id.tv_detailprice) ;
        detailaddress = (TextView) findViewById(R.id.tv_detailaddress);
        detaildeskripsi = (TextView) findViewById(R.id.tv_detaildeskripsi);

        getData();
    }
    private void getData(){
        image_detailkost.setImageResource(getIntent().getIntExtra("id_image",R.drawable.ficture));
        detailnama.setText(getIntent().getStringExtra("id_name"));
        detailprise.setText(getIntent().getStringExtra("id_prace"));
        detailaddress.setText(getIntent().getStringExtra("id_address"));
        detaildeskripsi.setText(getIntent().getStringExtra("id_detailkost"));
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.favorit:
                Toast.makeText(this, "Anda Mengklick Favorit", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
