package com.example.bsef18a037;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    Button dua1Button;
    Button dua2Button;
    Button dua3Button;
    Button dua4Button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().hide();
        dua1Button=findViewById(R.id.dua1Button);
        dua2Button=findViewById(R.id.dua2Button);
        dua3Button=findViewById(R.id.dua3Button);
        dua4Button=findViewById(R.id.dua4Button);
        dua1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), Dua_1.class);
                startActivity(i);
            }
        });
        dua2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), Dua_2.class);
                startActivity(i);
            }
        });
        dua3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Dua_3.class);
                startActivity(i);
            }
        });
        dua4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Dua_4.class);
                startActivity(i);
            }
        });
        text=findViewById(R.id.textView);
        text.animate().translationY(60).setDuration(1200);
        dua1Button.animate().translationY(-60).setDuration(1600);
        dua2Button.animate().translationY(-60).setDuration(2200);
        dua3Button.animate().translationY(-60).setDuration(2600);
        dua4Button.animate().translationY(-60).setDuration(3000);
    }
}