package example.com.oticket;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class MenuActivity extends AppCompatActivity {

    ViewPager viewPager;
    EditText username;
    Button start;

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        username = (EditText) findViewById(R.id.username);
        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String user = username.getText().toString();

                if (!user.isEmpty()) {

                    // todo 1: kondisi if disesuaikan dengan toast warning dibawahnya
                    if (user.length() <= 5) {

                        Toast.makeText(MenuActivity.this, "The minimum character is 5.", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MenuActivity.this, "Thanks " + user, Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MenuActivity.this, ListMovie.class);
                        MainActivity.username = user;
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(MenuActivity.this, "Please enter your name.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // todo 2: secara ux, user tidak tahu bahwa view pager itu merupakan image slider
        // tambahkan kode berikut agar image slider berjalan otomatis
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                viewPager.post(new Runnable() {
                    @Override
                    public void run() {
                        viewPager.setCurrentItem((viewPager.getCurrentItem() + 1) % viewPagerAdapter.getCount(), true);
                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 3000, 3000);

    }

    @Override
    protected void onDestroy() {
        timer.cancel();
        super.onDestroy();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_exit:
                exitDialog();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // todo 5: saat tombol back ditekan, tampilkan exit dialog
    @Override
    public void onBackPressed() {
        exitDialog();
    }

    private void exitDialog() {
        // sudah pakai alert dialog... keren!

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
    }
}
