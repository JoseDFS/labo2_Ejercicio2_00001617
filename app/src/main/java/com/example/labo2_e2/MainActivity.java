package com.example.labo2_e2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img2, img3 , img4, img5, img6, img7, img8, img9;
    private Random rand = new Random();
    private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.image_1);
        img2 = findViewById(R.id.image_2);
        img3 = findViewById(R.id.image_3);
        img4 = findViewById(R.id.image_4);
        img5 = findViewById(R.id.image_5);
        img6 = findViewById(R.id.image_6);
        img7 = findViewById(R.id.image_7);
        img8 = findViewById(R.id.image_8);
        img9 = findViewById(R.id.image_9);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n= 0;
                switch (n){
                    case 0:
                        img1.setImageDrawable(img2.getDrawable());
                }

            }
        });

    }




}
