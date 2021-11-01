package com.example.capston_design;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class Setting extends Activity {
    ImageButton imgbtn1;
    ImageButton imgbtn2;
    ImageButton imgbtn3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        imgbtn1 = (ImageButton) findViewById(R.id.imgbtn1);
        imgbtn2 = (ImageButton) findViewById(R.id.imgbtn2);
        imgbtn3 = (ImageButton) findViewById(R.id.imgbtn3);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
