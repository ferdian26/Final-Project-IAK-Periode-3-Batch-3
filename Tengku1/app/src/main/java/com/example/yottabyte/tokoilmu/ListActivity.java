package com.example.yottabyte.tokoilmu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    RecyclerView rv_list;
    private BelajarIlmu adapter;
    private List<MenuData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setupEnv();
        setupList();
        loadDummyData();
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mn_exit:
                finish();
                break;

            case R.id.mn_about:
                Toast.makeText(this, "Ini tentang saya", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    private void loadDummyData() {
        for (int i = 0; i < 8; i ++){
            list.add(new MenuData("Python" , "Selengkapnya"));
        }
        adapter.replaceAll(list);
    }

    private void setupList() {
        adapter = new BelajarIlmu(list);
        rv_list.setLayoutManager(new LinearLayoutManager(this));
        rv_list.setAdapter(adapter);
    }

    private void setupEnv() {
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
        list = new ArrayList<>();
    }
}
