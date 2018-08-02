package com.example.antonio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;


public class MainActivity extends AppCompatActivity {

    Button empezar;
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;

  //  public Session session;//global variable

    DataGame juego;
    EditText p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  session = new Session(this);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        empezar=(Button)findViewById(R.id.empezar);

        p1=(EditText) findViewById(R.id.nombrep1);
        p2=(EditText) findViewById(R.id.nombrep2);
       // session.setusename("olakease");

        String n1=p1.getText().toString();
        String n2=p2.getText().toString();

        juego = new DataGame(n1,n2,0,0);
        
        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // session.setusename("olakease");
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("Name", "olakase");
                editor.commit();

                Intent sig =new Intent(MainActivity.this, Juego.class);

                startActivity(sig);
            }
        });
    }
}
