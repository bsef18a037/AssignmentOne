package com.example.bsef18a037;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button startButton;
    TextView text;
    Button buttonToMyWebsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton=findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), MainMenu.class);
                startActivity(intent);
            }
        });
        buttonToMyWebsite=findViewById(R.id.buttonToMyWebsite);
        buttonToMyWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://duas184744489.wordpress.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        text=findViewById(R.id.textView);
        text.animate().translationY(90).setDuration(2000);
        startButton.animate().translationY(-70).setDuration(2000);
        startButton.animate().rotationXBy(360).setDuration(1200);
    }
}