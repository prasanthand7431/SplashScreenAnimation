package com.example.gspl96.splashscreen_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageid);
        textView=findViewById(R.id.textid);
        Animation ani= AnimationUtils.loadAnimation(this,R.anim.animations);
        imageView.startAnimation(ani);
        textView.startAnimation(ani);
    }
}
