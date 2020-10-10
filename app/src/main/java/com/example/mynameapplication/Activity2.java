package com.example.mynameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private String username = "Justin13";
    private String password = "131313";
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //TextView tv = findViewById(R.id.textView);
        TextView tv = findViewById(R.id.textView2);


        String sentusername = getIntent().getStringExtra("USERNAME");
        String sentpassword = getIntent().getStringExtra("PASSWORD");


        if(username.equals(sentusername) && password.equals(sentpassword))
        {
            tv.setText("Welcome"+sentusername);
        }
        else
        {
            tv.setText("Username/Password combination is wrong");
        }

    }
}