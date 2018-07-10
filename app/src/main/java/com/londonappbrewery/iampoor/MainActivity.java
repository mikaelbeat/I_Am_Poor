package com.londonappbrewery.iampoor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    MediaPlayer sadSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sadSound = MediaPlayer.create(getApplicationContext(), R.raw.sad);
        mMediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.fall);
        mMediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMediaPlayer.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mMediaPlayer.start();
    }

    public void playSadSound(View v){
        sadSound.start();
    }
}