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

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );
        getSupportActionBar().setTitle( "Data Barang" );

        final RecyclerView recyclerView = findViewById( R.id.rview2 );
        int position = getIntent().getIntExtra( "position", 0 );


        List<DataBarang> list = new ArrayList<>();
        if (position == 0) {
            list.add( new DataBarang( R.drawable.sukro, "001", "Sukro", "28 September 2018", "50" ) );
            list.add( new DataBarang( R.drawable.chetos, "002", "Cheetos", "25 September 2018", "60" ) );
            list.add( new DataBarang( R.drawable.chitato, "003", "Chitato", "22 September 2018", "100" ) );
            list.add( new DataBarang( R.drawable.lays, "004", "Lays", "29 September 2018", "30" ) );

        } else if (position == 1) {
            list.add( new DataBarang( R.drawable.sprit, "100", "Sprit", "30 Desember 2018", "50" ) );
            list.add( new DataBarang( R.drawable.fanta, "101", "Sprit", "20 Desember 2018", "60" ) );
            list.add( new DataBarang( R.drawable.pocari, "102", "Sprit", "10 Desember 2018", "70" ) );
        }else if (position==2){
            list.add( new DataBarang( R.drawable.sariroti, "200", "Sari Roti", "30 Desember 2018", "50" ) );
            list.add( new DataBarang( R.drawable.fred, "201", "Fred Roti", "20 Desember 2018", "110" ) );
            list.add( new DataBarang( R.drawable.fresh, "202", "Supreme", "10 Desember 2018", "70" ) );
        }else if (position==3){
            list.add( new DataBarang( R.drawable.hula2, "300", "Hula Hula", "30 Desember 2018", "30" ) );
            list.add( new DataBarang( R.drawable.campina, "301", "Neapolitan", "21 Desember 2018", "20" ) );
            list.add( new DataBarang( R.drawable.campina2, "302", "Walls", "21 Desember 2018", "50" ) );
        }else if (position ==4){
            list.add( new DataBarang( R.drawable.pantene, "400", "Pantene", "21 November 2019", "30" ) );
            list.add( new DataBarang( R.drawable.dettol, "401", "Dettol", "30 November 2020", "40" ) );
        }else if (position ==5){
            list.add( new DataBarang( R.drawable.pensilwarna, "500", "Pensil Warna", "", "20" ) );
            list.add( new DataBarang( R.drawable.pulpen, "501", "Pulpen", "", "20" ) );
        }else if (position==6){
            list.add( new DataBarang( R.drawable.sunlight, "600", "Sunlight", "", "20" ) );
            list.add( new DataBarang( R.drawable.spon, "601", "Spoon", "", "10" ) );
        }else if (position==7){
            list.add( new DataBarang( R.drawable.wajan, "700", "Wajan", "", "20" ) );
            list.add( new DataBarang( R.drawable.spatula, "701", "Spatula", "", "10" ) );
        }

        RecyclerViewAdapter2 adapter = new RecyclerViewAdapter2( list );

        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.addItemDecoration( new DividerItemDecoration( this, DividerItemDecoration.VERTICAL ) );
        recyclerView.setAdapter( adapter );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu1, menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itadd:
                Toast.makeText( this, "Data Barang baru telah ditambahkan", Toast.LENGTH_SHORT ).show();
                break;
        }
        return super.onOptionsItemSelected( item );
    }
}
