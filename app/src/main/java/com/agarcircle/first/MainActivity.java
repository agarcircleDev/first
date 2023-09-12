package com.agarcircle.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, res;
    Button hap, gop, min, div;
    View.OnClickListener mycl;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        res = (EditText) findViewById(R.id.result);
        hap = (Button) findViewById(R.id.hap);
        gop = (Button) findViewById(R.id.gop);
        min = (Button) findViewById(R.id.min);
        div = (Button) findViewById(R.id.div);

        mycl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a, b, c = 0;



                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                int i;
                i = view.getId();
                if (i == R.id.hap) {
                    c = a + b;
                }   else if (i == R.id.gop) {
                    c = a * b;
                }   else if (i == R.id.min) {
                    c = a - b;
                }   else if (i == R.id.div) {
                    c = a / b;
                }
                res.setText(c + "");
            }
        };

        hap.setOnClickListener(mycl);
        gop.setOnClickListener(mycl);
        min.setOnClickListener(mycl);
        div.setOnClickListener(mycl);
    }
}