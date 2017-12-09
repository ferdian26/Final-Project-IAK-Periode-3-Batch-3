package example.com.oticket;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static String username = "";
    public static String title = "", genre = "", time = "";
    public static int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTimer(2000, MenuActivity.class);
    }

    private void setTimer(int delay, final Class intent){
        new Handler().postDelayed(new Runnable(){
            public void run(){
                startActivity(new Intent(getApplicationContext(), intent));
                finish();
            }
        }, delay);
    }
}
