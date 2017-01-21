package com.example.zzzz.myapp4;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

import static com.example.zzzz.myapp4.R.drawable.androidicon;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
                if (b == true) {
                    imageView3.setVisibility(View.INVISIBLE);
                } else {
                    imageView3.setVisibility(View.VISIBLE);
                }
            }
        });

    }


}
