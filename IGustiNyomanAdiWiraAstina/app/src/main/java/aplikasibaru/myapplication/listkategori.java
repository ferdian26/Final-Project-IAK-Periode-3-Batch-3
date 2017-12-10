package aplikasibaru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class listkategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_listkategori );

        getSupportActionBar().setTitle( "KATEGORI BARANG" );

        final RecyclerView recyclerView = findViewById( R.id.rview );

        List<Data> list = new ArrayList<>();
        list.add( new Data( R.drawable.makanan, "Makanan Ringan" ) );
        list.add( new Data( R.drawable.minuman, "Minuman" ) );
        list.add( new Data( R.drawable.roti, "Roti" ) );
        list.add( new Data( R.drawable.eskrim, "Es Krim" ) );
        list.add( new Data( R.drawable.alatmandi, "Alat Mandi" ) );
        list.add( new Data( R.drawable.alatkantor, "Alat Tulis dan Kantor" ) );
        list.add( new Data( R.drawable.peralatancuci, "Peralatan Cuci" ) );
        list.add( new Data( R.drawable.peralatandapur, "Peralatan Dapur" ) );
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( list );

        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.addItemDecoration( new DividerItemDecoration( this, DividerItemDecoration.VERTICAL ) );
        recyclerView.setAdapter( adapter );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu1,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itadd:
                Toast.makeText( this, "Kategori Barang baru telah ditambahkan", Toast.LENGTH_SHORT ).show();
                break;
        }
        return super.onOptionsItemSelected( item );
    }
}
