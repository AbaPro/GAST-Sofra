package com.example.ourproject01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().hide();
        TextView fetarresult= findViewById(R.id.fetarfinalresult);
        TextView lunchresult= findViewById(R.id.lunchfinalresult);
        TextView dinnerresult= findViewById(R.id.dinnerefinalresult);
        TextView waterresult=findViewById(R.id.waterfinalresult);
        TextView foodS=findViewById(R.id.food);
        TextView raG3=findViewById(R.id.rage3);
        Log.d("+++++++", fetarresult.toString());



        Intent intent = getIntent();
        String fetarresultS = intent.getStringExtra("fetarresult");
        String lunchresultS = intent.getStringExtra("lunchresult");
        String dinnerresultS = intent.getStringExtra("dinnerresult");
        String waterresultS= intent.getStringExtra("waterresult");

        fetarresult.setText(fetarresultS);
        lunchresult.setText(lunchresultS);
        dinnerresult.setText(dinnerresultS);
        waterresult.setText(waterresultS);

        if(fetarresultS.equals("") && lunchresultS.equals("") && dinnerresultS.equals("")){
            foodS.setVisibility(View.INVISIBLE);
            raG3.setVisibility(View.INVISIBLE);
        }



    }
}