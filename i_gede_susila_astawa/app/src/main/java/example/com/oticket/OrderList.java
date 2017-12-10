package example.com.oticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderList extends AppCompatActivity {
    Button finish;
    TextView name, moviename, genre, time, ticket, position, price, total_price;
    private String get_ticket, get_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
            Intent intent = new Intent (OrderList.this, MenuActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            }
        });

        name = (TextView) findViewById(R.id.name);
        moviename = (TextView) findViewById(R.id.moviename);
        genre = (TextView) findViewById(R.id.genre);
        time = (TextView) findViewById(R.id.time);
        ticket = (TextView) findViewById(R.id.ticket);
        position = (TextView) findViewById(R.id.position);
        price = (TextView) findViewById(R.id.price);
        total_price = (TextView) findViewById(R.id.total_price);

        get_ticket = getIntent().getStringExtra("ticket");
        get_position = getIntent().getStringExtra("position");

        name.setText("Name : "+MainActivity.username);
        moviename.setText(MainActivity.title);
        genre.setText(MainActivity.genre);
        time.setText("Time : "+MainActivity.time);
        ticket.setText("Number of Ticket : "+get_ticket);
        position.setText("Position : "+get_position);

        price.setText("Rp. "+MainActivity.price);
        int total = Integer.parseInt(get_ticket) * MainActivity.price;
        total_price.setText("Rp. "+total);

    }
}
