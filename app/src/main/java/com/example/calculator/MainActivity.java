package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.result);
        String s1, s2;
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            String result = "pleas enter a value";
            t1.setText(result);
            return false;
        } else {
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
        }
        return true;
    }

    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void doMul(View v) {
        if (getNumbers()) {
            int Mul = num1 * num2;
            t1.setText(Integer.toString(Mul));
        }
    }
    public void doDiv(View v) {
        if (getNumbers()) {
            int Div = num1 / num2;
            t1.setText(Integer.toString(Div));
        }
    }
    public void doMod(View v) {
        if (getNumbers()) {
            int Mod = num1 % num2;
            t1.setText(Integer.toString(Mod));
        }
    }
    public void doPow(View v) {
        if (getNumbers()) {
            int Pow = (int) Math.pow(num1, num2);
            t1.setText(Integer.toString(Pow));
        }
    }
}

