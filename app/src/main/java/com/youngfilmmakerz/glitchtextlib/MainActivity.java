package com.youngfilmmakerz.glitchtextlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.youngfilmmakerz.glitchtext.Glitchtext;


public class MainActivity extends AppCompatActivity {
    Glitchtext glitchtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glitchtext = (Glitchtext) findViewById(R.id.glitchtext);
        glitchtext.setMaintext("YOUR \nNAME");
        glitchtext.setFontstyle("Bugfast.otf");
        glitchtext.setTextsize(35);
    }
}
