package com.example.averagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_subject1);
        et2 = (EditText)findViewById(R.id.txt_subject2);
        et3 = (EditText)findViewById(R.id.txt_subject3);

        tv1 = (TextView)findViewById(R.id.tv_result);
    }

    public void status(View view){

        String Physic_String = et1.getText().toString();
        String Mathematics_String = et2.getText().toString();
        String Chemistry_String = et3.getText().toString();

        int Physics = Integer.parseInt(Physic_String);
        int Mathematics = Integer.parseInt(Mathematics_String);
        int Chemistry = Integer.parseInt(Chemistry_String);

        int prom = (Physics + Mathematics + Chemistry) / 3;

        if (prom >= 6) {
            tv1.setText("Status Approved: " + prom);
        } else if (prom <= 5){
            tv1.setText("Status Failed: " + prom);
        }

    }
}