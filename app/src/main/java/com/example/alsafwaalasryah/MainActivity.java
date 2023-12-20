package com.example.alsafwaalasryah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout Address;
    LinearLayout QRcode;
    TextView textmarqeuu;
    LinearLayout CompanyInfor;
    LinearLayout ContractInfor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        CompanyInfor = findViewById(R.id.CompanyInfor);
        ContractInfor = findViewById(R.id.ContractInfor);
        QRcode = findViewById(R.id.QrCode);
        Address = findViewById(R.id.Adrress);



        TextView txtMarquee;

        txtMarquee = (TextView) findViewById(R.id.marqueeText);
        txtMarquee.setSelected(true);

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(myIntent);
            }
        });

        QRcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(MainActivity.this, MainActivity4.class);
                startActivity(myIntent);
            }
        });

        CompanyInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(MainActivity.this, MainActivity2.class);
                startActivity(myIntent);

            }
        });


        ContractInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myTntent =new Intent(MainActivity.this, MainActivity3.class);
                startActivity(myTntent);
            }
        });


        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();




        imageList.add(new SlideModel(R.drawable.coverr,ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.coverrrrrr,ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.coverb,ScaleTypes.FIT));


        imageSlider.setImageList(imageList);





    }
}