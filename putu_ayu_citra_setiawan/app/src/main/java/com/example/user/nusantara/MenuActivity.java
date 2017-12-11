package com.example.user.nusantara;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity
        implements CultureFragment.OnFragmentInteractionListener,
        LocalBrandFragment.OnFragmentInteractionListener,
        AboutFragment.OnFragmentInteractionListener {

    // private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // todo 1: mTextMessage ini mungkin maksudnya dipakai cuma pas debug, sebaiknya dihilangkan saat release
        // mTextMessage = (TextView) findViewById(R.id.message);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /* default set bottomnav */
        navigation.setSelectedItemId(R.id.nav_artculture);
    }

    /*-- Option bar --*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btn_exit:
                showExitDialog();
                //finish();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    /*-- dialog confirm exit --*/
    public void showExitDialog() {

        // sudah pakai alert dialog... keren!

        new AlertDialog.Builder(this).setMessage("Keluar dari Aplikasi ?").setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).show();
    }

    /*-- action bottom navigation view --*/
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            // sudah mainan fragment... keren!

            FragmentManager manager = getSupportFragmentManager();

            switch (item.getItemId()) {
                case R.id.nav_artculture:
                    //mTextMessage.setText("Culture");
                    manager.beginTransaction().replace(R.id.frameawal, new CultureFragment()).commit();
                    return true;

                case R.id.nav_localbrand:
                    //mTextMessage.setText("Local Brand");
                    manager.beginTransaction().replace(R.id.frameawal, new LocalBrandFragment()).commit();
                    return true;

                case R.id.nav_about:
                    //mTextMessage.setText("About");
                    manager.beginTransaction().replace(R.id.frameawal, new AboutFragment()).commit();
                    return true;

                default:
                    manager.beginTransaction().replace(R.id.frameawal, new CultureFragment()).commit();
                    return true;
            }
        }

    };

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    // todo 2: saat tombol back ditekan, tampilkan exit dialog
    @Override
    public void onBackPressed() {
        showExitDialog();
    }
}