package com.hvdevelopers.gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mGpaCalc;
    private Button mAvgCalc;
    private Button mSimpCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGpaCalc = (Button) findViewById(R.id.gpa_calc_btn);
        mGpaCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent openGpa = new Intent(MainActivity.this, GpaActivity.class);
                startActivity(openGpa);
            }
        });

        mAvgCalc = (Button) findViewById(R.id.aug_calc_btn);
        mAvgCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent openAvg = new Intent(MainActivity.this, AvgActivity.class);
                startActivity(openAvg);
            }
        });

        mSimpCalc = (Button) findViewById(R.id.normal_calc_btn);
        mSimpCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent openSimp = new Intent(MainActivity.this, SimpActivity.class);
                startActivity(openSimp);
            }
        });
    }
}
