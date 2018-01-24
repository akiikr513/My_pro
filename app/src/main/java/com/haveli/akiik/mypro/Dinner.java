package com.haveli.akiik.mypro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Dinner extends AppCompatActivity {

    String TAG = ".Dinner";
    Random random = new Random();
    int myImg[] = {R.drawable.gobhi,R.drawable.chicken,R.drawable.egg,R.drawable.paneer,R.drawable.soya,
            R.drawable.aalu_p,R.drawable.omlet,R.drawable.fry_r,R.drawable.egg_fry_r,R.drawable.mus_fry_r,R.drawable.veg,
            R.drawable.c_bir,R.drawable.ad,R.drawable.cap,R.drawable.matar,R.drawable.palak_p,R.drawable.kfc,R.drawable.khayali};
    ImageView imgView;
    Button bu;
    int n;
    String dish[]={"gobhi","chicken","egg","paneer","soya chunks","aalu paratha","omlet"
            ,"fry rice","fry rice egg","fry rice mushroom","veg biryani","chicken biryani",
            "aalu dam","capscium","matar aalu","palak paneer","kfc chicken","khayali pulaw"};


    TextView tu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        tu=findViewById(R.id.dish);
        bu=findViewById(R.id.dinner);
        imgView = findViewById(R.id.bimg);



                bu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        n=random.nextInt(dish.length);
                        tu.setText(dish[n]);
                        imgView.setImageResource(myImg[n]);
                    }
                });

    }
}
