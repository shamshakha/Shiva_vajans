package com.example.shiva_vajans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
public class Shiv extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView repeat_btn;
    private ImageView back_btn;
    private ImageView pause_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiv);
        repeat_btn = findViewById(R.id.repeat);
        back_btn = findViewById(R.id.back);
        pause_btn = findViewById(R.id.pause);


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

        //  next_btn.setOnClickListener(new View.OnClickListener() {
        //      @Override
        //      public void onClick(View v) {
        //          open_next();
        //      }
        //    });

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shiv_amritvaani);

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
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shiv_amritvaani);

        mediaPlayer.start();
    }
    public void open_back() {

        // StartAppAd.showAd(this);
        this.finish();
        mediaPlayer.stop();
        Intent intent = new Intent(this, Jyotirlingg.class);
        startActivity(intent);
    }
}