package com.example.mynameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String[] cities = {"Seattle", "Bothell", "Kirkland", "Bellevue", "Lynnwood", "Renton", "Redmond", "Spokane", "Vancouver", "Tacoma", "Olympia",
            "Bellingham", "Arlington", "Everett", "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.listview_layout, R.id.city, cities);
        ListView lv = findViewById(R.id.city_list);
        lv.setAdapter(adapter);

        //Makes a list on my apps landing page
    }

    public void LogIn(View view){


        /*Log.i( "INFO", "Logging in to " + Activity2.class.getName());
        EditText user = findViewById(R.id.Username);
        EditText pass = findViewById(R.id.Password);
        String theusername = user.getText().toString();
        String thepassword = pass.getText().toString();
        Log.i("INFO", "Username is " + user.getText().toString());
        Log.i("INFO", "Password is " + pass.getText().toString());
        Intent intent = new Intent(getApplicationContext(),Activity2.class);
        intent.putExtra("USERNAME", theusername);
        intent.putExtra("PASSWORD", thepassword);
        startActivity(intent);*/



        // This was first lesson TextView tv = findViewById(R.id.textView);
       // This was first lesson tv.setText("Hello World!");
    }
}