package com.example.bsef18a037;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dua_4 extends AppCompatActivity {
    Button playAudio,videoButton;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_of_second_ashra);
        getSupportActionBar().setTitle("دوسرے عشرہ کی دعا");
        mediaPlayer= MediaPlayer.create(Dua_4.this,R.raw.dosray_ashray_ki_dua);
        if(mediaPlayer.isPlaying()==false)
            mediaPlayer.start();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer.isPlaying()==true)
            mediaPlayer.stop();
    }
}