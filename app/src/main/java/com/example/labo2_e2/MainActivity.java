package com.example.labo2_e2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img2, img3 , img4, img5, img6, img7, img8, img9;
    private Drawable d1,d2,d3,d4,d5,d6,d7,d8,d9;
    private Random rand = new Random();
    private int n=3;
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

        d1= img1.getDrawable();
        d2= img2.getDrawable();
        d3= img3.getDrawable();
        d4= img4.getDrawable();
        d5= img5.getDrawable();
        d6= img6.getDrawable();
        d7= img7.getDrawable();
        d8= img8.getDrawable();
        d9= img9.getDrawable();


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img2);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img3);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img3);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img5);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img6);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img7);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img8);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImg(img9);
            }
        });

    }

    public void changeImg(ImageView img){
        n= rand.nextInt(9);
        System.out.print(n);
        switch (n){
            case 0:
                img.setImageDrawable(d1);
                break;
            case 1:
                img.setImageDrawable(d2);
                break;
            case 2:
                img.setImageDrawable(d3);
                break;
            case 3:
                img.setImageDrawable(d4);
                break;
            case 4:
                img.setImageDrawable(d5);
                break;
            case 5:
                img.setImageDrawable(d6);
                break;
            case 6:
                img.setImageDrawable(d7);
                break;
            case 7:
                img.setImageDrawable(d8);
                break;
            case 8:
                img.setImageDrawable(d9);
                break;
        }

    }




}
