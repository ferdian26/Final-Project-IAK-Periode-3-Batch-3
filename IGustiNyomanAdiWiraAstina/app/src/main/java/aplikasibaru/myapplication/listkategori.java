package aplikasibaru.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class listkategori extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<Data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listkategori);

        // todo 5: rapikan lagi setup, list, dan load data
        setupEnv();
        setupList();

        loadDataDummy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itadd:
                Toast.makeText(this, "Kategori Barang baru telah ditambahkan", Toast.LENGTH_SHORT).show();

                // sudah pakai option menu... keren!
                // coba tambahkan lagi layout disini untuk tambah item barang

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupEnv() {
        getSupportActionBar().setTitle("KATEGORI BARANG");
        recyclerView = findViewById(R.id.rview);
        list = new ArrayList<>();
    }

    private void setupList() {
        adapter = new RecyclerViewAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new Data(R.drawable.makanan, "Makanan Ringan"));
        list.add(new Data(R.drawable.minuman, "Minuman"));
        list.add(new Data(R.drawable.roti, "Roti"));
        list.add(new Data(R.drawable.eskrim, "Es Krim"));
        list.add(new Data(R.drawable.alatmandi, "Alat Mandi"));
        list.add(new Data(R.drawable.alatkantor, "Alat Tulis dan Kantor"));
        list.add(new Data(R.drawable.peralatancuci, "Peralatan Cuci"));
        list.add(new Data(R.drawable.peralatandapur, "Peralatan Dapur"));
    }
}
