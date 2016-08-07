package edu.uw.lucav17.pillapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_layout);

        /*
        boolean loginStatus = MyApplication.preferences.getBoolean("isLoggedIn", false);
        if(!loginStatus) {

        } else {
            //setContentView(R.layout.activity_home);

        } */


    }
}
