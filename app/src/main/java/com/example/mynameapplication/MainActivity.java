package com.example.mynameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LogIn(View view){

        Log.i( "INFO", "Logging in to " + Activity2.class.getName());
        EditText user = findViewById(R.id.Username);
        EditText pass = findViewById(R.id.Password);
        String theusername = user.getText().toString();
        String thepassword = pass.getText().toString();
        Log.i("INFO", "Username is " + user.getText().toString());
        Log.i("INFO", "Password is " + pass.getText().toString());
        Intent intent = new Intent(getApplicationContext(),Activity2.class);
        intent.putExtra("USERNAME", theusername);
        intent.putExtra("PASSWORD", thepassword);
        startActivity(intent);

        // This was first lesson TextView tv = findViewById(R.id.textView);
       // This was first lesson tv.setText("Hello World!");
    }
}