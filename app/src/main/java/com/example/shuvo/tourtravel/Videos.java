package com.example.shuvo.tourtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailView;

public class Videos extends YouTubeBaseActivity implements View.OnClickListener{
    YouTubePlayerView youTubePlayerView;
    YouTubePlayerView youTubePlayerView2,youTubePlayerView3,youTubePlayerView4;
    Button watch1, watch2,watch3,watch4;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    YouTubePlayer.OnInitializedListener onInitializedListener2,onInitializedListener3,onInitializedListener4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        youTubePlayerView = findViewById(R.id.youtube_video);
        youTubePlayerView2 = findViewById(R.id.youtube_video2);
        youTubePlayerView3 = findViewById(R.id.youtube_video3);
        youTubePlayerView4 = findViewById(R.id.youtube_video4);

        watch1 = findViewById(R.id.watch_button1);
        watch1.setOnClickListener(this);
        watch2 = findViewById(R.id.watchbtn2);
        watch2.setOnClickListener(this);
        watch3=findViewById(R.id.watchbtn3);
        watch4=findViewById(R.id.watchbtn4);
        watch3.setOnClickListener(this);
        watch4.setOnClickListener(this);


        onInitializedListener =  new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
               /* youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION);
                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);
                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI);
*/
                youTubePlayer.loadVideo("5LTTLqZeBQM");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        onInitializedListener2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("ltyneiA3Etg");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        onInitializedListener3 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("CvI8fe1GUGE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        onInitializedListener4 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("T0pfoInDjUY");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.watch_button1){
            youTubePlayerView.initialize(VideoConfig.API_KEY,onInitializedListener);
        }
        if (v.getId()==R.id.watchbtn2){
            youTubePlayerView2.initialize(VideoConfig.API_KEY,onInitializedListener2);
        }
        if (v.getId()==R.id.watchbtn3){
            youTubePlayerView3.initialize(VideoConfig.API_KEY,onInitializedListener3);
        }
        if (v.getId()==R.id.watchbtn4){
            youTubePlayerView4.initialize(VideoConfig.API_KEY,onInitializedListener4);
        }
    }
}
