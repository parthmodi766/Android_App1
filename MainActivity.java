package com.example.parthmodilab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity<num> extends AppCompatActivity {
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int[] decimalToBinary(int num) {
        // Creating and assigning binary array size
        int[] binary = new int[3];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        return binary;
    }

        public void count (View view){
        RadioButton button1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton button3 = (RadioButton) findViewById(R.id.radioButton3);
        num++;
        int[] binary = decimalToBinary(num);
        if (binary[2] == 1) button1.setChecked(true);
        else button1.setChecked(false);

        if (binary[1] == 1) button2.setChecked(true);
        else button2.setChecked(false);

        if (binary[0] == 1) button3.setChecked(true);
        else button3.setChecked(false);

        if (num == 7) num=-1;
    }

        public void reset (View view){
        RadioButton button1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton button3 = (RadioButton) findViewById(R.id.radioButton3);

        button1.setChecked(false);
        button2.setChecked(false);
        button3.setChecked(false);

        num = 0;
    }
}