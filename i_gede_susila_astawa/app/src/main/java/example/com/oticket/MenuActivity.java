package example.com.oticket;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MenuActivity extends AppCompatActivity {

    ViewPager viewPager;
    EditText username;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        username = (EditText) findViewById(R.id.username);
        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
            String user = username.getText().toString();

            if(!user.isEmpty()){
                if(user.length() < 1){
                    Toast.makeText(MenuActivity.this, "The minimum character is 5.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MenuActivity.this, "Thanks "+user, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent (MenuActivity.this, ListMovie.class);
                    MainActivity.username = user;
                    startActivity(intent);
                }
            }else{
                Toast.makeText(MenuActivity.this, "Please enter your name.", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(R.string.app_name);
                builder.setMessage("Do you want to exit ?");
                builder.setIcon(R.drawable.oticket);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                        finish();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
