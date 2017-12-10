package example.com.oticket;

import android.app.ActionBar;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListMovie extends AppCompatActivity {



    private RecyclerView list_movie;
    private TicketAdapter adapter;
    private List<MovieData> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_movie);

        list_movie = (RecyclerView) findViewById(R.id.list_movie);

        setupEnv();
        setupList();
        loadDummyData();
    }

    private void setupEnv() {
        list_movie = (RecyclerView) findViewById(R.id.list_movie);
        list = new ArrayList<>();
    }

    private void setupList() {
        adapter = new TicketAdapter(list);
        list_movie.setLayoutManager(new LinearLayoutManager(this));
        list_movie.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        list_movie.setAdapter(adapter);
    }

    private void loadDummyData() {

        String title[] = {"Captain America : Civil War", "Wonder Woman (2017)", "Spider-man : Homecoming (2017)", "The Autopsy of Jane Doe", "IT (2017)"};
        int price[] = {40000, 30000, 50000, 70000, 100000};
        String time[] = {"03.00 - 04.30","04.45 - 06.00","06.15 - 07.45","08.00 - 09.45","10.00 - 11.30"};
        String genre[] = {"Action","Action","Action","Horror","Horror"};

        for (int i = 0; i < title.length; i++) {
            list.add(new MovieData("Movie Name : " + title[i], "Genre : " + genre[i], time[i]+" Wita","" + price[i]));
        }
        adapter.replaceAll(list);
    }
}
