package com.example.shiva_vajans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
public class Panchyaskari extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView repeat_btn;
    private ImageView back_btn;
    private ImageView pause_btn;
    private ImageView next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panchyaskari);
        repeat_btn = findViewById(R.id.repeat);
        back_btn = findViewById(R.id.back);
        pause_btn = findViewById(R.id.pause);
        next_btn = findViewById(R.id.next);

        repeat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_repeat();
            }
        });
        pause_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    pause_btn.setImageResource(R.drawable.play);

                }
                else {
                    mediaPlayer.start();
                    pause_btn.setImageResource(R.drawable.pause);
                }
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_back();
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_next();
            }
        });

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shiv_panchakshar);

        mediaPlayer.start();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //finish();
        mediaPlayer.stop();
        this.finish();
    }


    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();

    }

    public void open_repeat() {

        // StartAppAd.showAd(this);

        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shiv_panchakshar);

        mediaPlayer.start();
    }
    public void open_back() {

        // StartAppAd.showAd(this);
        this.finish();
        mediaPlayer.stop();
        Intent intent = new Intent(this, Shankar_shiv.class);
        startActivity(intent);
    }

    public void open_next() {

        // StartAppAd.showAd(this);
        this.finish();
        mediaPlayer.stop();
        Intent intent = new Intent(this, Sadakshara.class);
        startActivity(intent);
    }
}