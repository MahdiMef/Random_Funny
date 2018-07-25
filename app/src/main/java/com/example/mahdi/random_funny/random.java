package com.example.mahdi.random_funny;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

//import static android.graphics.Color.rgb;


public class random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);


        Button btn=findViewById(R.id.btn);
    }
   // @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
   // @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void btn_click (View view){
        LinearLayout linearLayout=findViewById(R.id.linearlayout);

        Random rand = new Random();
        int width=linearLayout.getWidth()-100;
        int height=linearLayout.getHeight()-100;
        int ran_x=rand.nextInt(width)-100;
        int ran_y=rand.nextInt(height)-100;
        int ran_rotate=rand.nextInt(1500)+100;
        int ran_buttwidth=rand.nextInt(1500)+100;
        int ran_duration=rand.nextInt(1000)+200;
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        int colorr = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        linearLayout.setBackgroundColor(Color.rgb(colorr,colorr,colorr));
        Button btn1 =(Button) view;
        //btn1.setTranslationY(ran_y);
      //  btn1.setTranslationX(ran_x);
        btn1.setWidth(ran_buttwidth);
        btn1.setBackgroundColor(Color.rgb(color,color,color));
        btn1.animate().translationY(ran_y).translationX(ran_x).setDuration(ran_duration).rotation(ran_rotate);

    }
}
