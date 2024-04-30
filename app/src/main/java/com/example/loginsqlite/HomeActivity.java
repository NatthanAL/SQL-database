package com.example.loginsqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class HomeActivity extends AppCompatActivity  {

    TextView helloUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        helloUser = (TextView) findViewById(R.id.helloUser);

        Bundle extras = getIntent().getExtras();
        String username = null;
        if(extras != null){
            username = extras.getString("username");
            helloUser.setText("Welcome " + username);
        }

    }
}