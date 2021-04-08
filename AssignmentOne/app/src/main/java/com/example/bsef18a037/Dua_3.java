package com.example.bsef18a037;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dua_3 extends AppCompatActivity {
    Button playAudio;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_of_seeing_mirror);
        getSupportActionBar().setTitle("آئینے میں دیکھنے کی دعا");
        mediaPlayer= MediaPlayer.create(Dua_3.this,R.raw.aaina_ki_dua);
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