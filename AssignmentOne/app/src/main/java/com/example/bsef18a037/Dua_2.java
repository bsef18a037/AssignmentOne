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
        setContentView(R.layout.activity_dua_when_visiting_sick);
        getSupportActionBar().setTitle("بیمار وں کی عیادت کی دعا");
        mediaPlayer= MediaPlayer.create(Dua_2.this,R.raw.dua_for_visting_the_sick);
        if(!mediaPlayer.isPlaying() && mediaPlayer!=null)
            mediaPlayer.start();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying())
            mediaPlayer.stop();
    }
}