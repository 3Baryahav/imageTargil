package com.example.bar_y.tmona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class IMageActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    Random rnd=new Random();
    int i,image1,image2,image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        img=(ImageView)findViewById(R.id.img);
        btn=(Button)findViewById(R.id.btn);
        image1=R.drawable.yos;
        image2=R.drawable.yos2;
        image3=R.drawable.yos3;
    }

    public void img(View view) {
        i=rnd.nextInt(3)+1;
        btn.setText(""+i);
        if (i==1)
            img.setImageResource(image1);
        else {
            if (i==2)
                img.setImageResource(image2);
            else
                img.setImageResource(image3);
        }


    }
}
