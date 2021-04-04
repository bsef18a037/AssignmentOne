package com.example.bsef18a037;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dua_2 extends AppCompatActivity {
    Button playAudio;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_of_waking_up);
        getSupportActionBar().setTitle("Dua after waking up from sleep");
        mediaPlayer= MediaPlayer.create(Dua_2.this,R.raw.duaafterwakingupfromsleep);
        if(mediaPlayer.isPlaying()==false)
            mediaPlayer.start();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying() == true)
            mediaPlayer.stop();
    }
}