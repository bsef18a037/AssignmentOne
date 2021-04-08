package com.example.bsef18a037;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dua_1 extends AppCompatActivity {
    Button playAudio;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_of_waking_up);
        getSupportActionBar().setTitle("نیند سے جاگنے کے بعد دعا");
        mediaPlayer= MediaPlayer.create(Dua_1.this,R.raw.duaafterwakingupfromsleep);
        if(!mediaPlayer.isPlaying() && mediaPlayer!=null)
            mediaPlayer.start();
        }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer.isPlaying())
            mediaPlayer.stop();
    }
}