package example.com.oticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class Transaction extends AppCompatActivity {

    EditText ticket, position;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        ticket = (EditText) findViewById(R.id.number_of_ticket);
        position = (EditText) findViewById(R.id.position);
        order = (Button) findViewById(R.id.order);


        order.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
            String num_ticket = ticket.getText().toString();
            String pos = position.getText().toString();
                if(num_ticket.isEmpty() || pos.isEmpty()){
                    Toast.makeText(Transaction.this, "Please enter the number of tickets and position.", Toast.LENGTH_SHORT).show();
                }else{
                    if(num_ticket.equals("0")){
                        Toast.makeText(Transaction.this, "The minimum number of tickets is 1", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent intent = new Intent (Transaction.this, OrderList.class);
                        intent.putExtra("ticket", num_ticket);
                        intent.putExtra("position", pos);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
