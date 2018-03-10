package com.freecreator.whiteforest.ui;

/**
 * Created by niko on 2018/3/8.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.freecreator.whiteforest.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        UI_init();
    }

    private void UI_init() {

        //全屏
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);

        ImageView ImageView_background = (ImageView)findViewById(R.id.ImageView_background);
        ImageView_background.setImageResource(R.drawable.background);

        ImageView ImageView_story_banner = (ImageView)findViewById(R.id.ImageView_story_banner);
        ImageView_story_banner.setImageResource(R.drawable.banner);

        // 建立阴影
        //ImageView shadow_story_banner = (ImageView)findViewById(R.id.shadow_story_banner);
        //shadow_story_banner.setImageResource(R.drawable.shadow);

        ImageView ImageView_character = (ImageView) findViewById(R.id.ImageView_character);
        ImageView_character.setImageResource(R.drawable.character);
    }
}
