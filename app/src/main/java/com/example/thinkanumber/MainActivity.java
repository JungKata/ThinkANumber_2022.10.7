package com.example.thinkanumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button plusButton;
    private Button minusButton;
    private Button tippButton;
    private TextView tippValue;
    private ImageView pic1;
    private ImageView pic2;
    private ImageView pic3;
    private ImageView pic4;
    private int tipp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListeners();
    }

    private void addListeners(){
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tippButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void init(){
        plusButton=findViewById(R.id.plusButton);
        minusButton=findViewById(R.id.minusButton);
        tippButton=findViewById(R.id.tippButton);
        tippValue=findViewById(R.id.tippValue);
        pic1=findViewById(R.id.Pic1);
        pic2=findViewById(R.id.Pic2);
        pic3=findViewById(R.id.Pic3);
        pic4=findViewById(R.id.Pic4);
        tipp = 1;
    }
}