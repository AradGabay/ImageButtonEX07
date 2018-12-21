package com.example.aradg.imagebuttonex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    ImageButton ib;
    ImageView iv;
    int i;
    int cat,dog,mouse,number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.iv);
        ib=(ImageButton)findViewById(R.id.ib);
        cat=R.drawable.cat;
        dog=R.drawable.dog;
        mouse=R.drawable.mouse;
        number1=R.drawable.number1;
        number2=R.drawable.number2;
        number3=R.drawable.number3;
    }

    public void changeimage(View view) {
        i=rnd.nextInt(3)+1;
        switch(i){
            case 1:iv.setImageResource(cat);ib.setImageResource(number1);break;
            case 2:iv.setImageResource(dog);ib.setImageResource(number2);break;
            case 3:iv.setImageResource(mouse);ib.setImageResource(number3);break;
        }
           }
}
