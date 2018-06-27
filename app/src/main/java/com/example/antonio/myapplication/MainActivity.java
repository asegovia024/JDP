package com.example.antonio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button empezar;
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    DataGame juego;
    EditText p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empezar=(Button)findViewById(R.id.empezar);

        p1=(EditText) findViewById(R.id.nombrep1);
        p2=(EditText) findViewById(R.id.nombrep2);

        String n1=p1.getText().toString();
        String n2=p2.getText().toString();

        juego = new DataGame(n1,n2,0,0);
        
        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sig =new Intent(MainActivity.this, Ruleta.class);
                startActivity(sig);
            }
        });
    }
}
