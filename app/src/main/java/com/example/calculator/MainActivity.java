package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view){
        EditText a_field = (EditText)findViewById(R.id.first_num);
        int numA = Integer.parseInt(a_field.getText().toString());

        EditText b_field = (EditText)findViewById(R.id.second_num);
        int numB = Integer.parseInt(b_field.getText().toString());
        display(String.valueOf(numA+numB));
    }
    public void minus(View view){
        EditText a_field = (EditText)findViewById(R.id.first_num);
        int numA = Integer.parseInt(a_field.getText().toString());

        EditText b_field = (EditText)findViewById(R.id.second_num);
        int numB = Integer.parseInt(b_field.getText().toString());
        display(String.valueOf(numA-numB));
    }
    public void multiple(View view){
        EditText a_field = (EditText)findViewById(R.id.first_num);
        int numA = Integer.parseInt(a_field.getText().toString());

        EditText b_field = (EditText)findViewById(R.id.second_num);
        int numB = Integer.parseInt(b_field.getText().toString());
        display(String.valueOf(numA*numB));
    }
    public void divide(View view){
        EditText a_field = (EditText)findViewById(R.id.first_num);
        int numA = Integer.parseInt(a_field.getText().toString());

        EditText b_field = (EditText)findViewById(R.id.second_num);
        int numB = Integer.parseInt(b_field.getText().toString());
        if(numB!=0){
            display(String.valueOf(numA/numB));
        }else display("Error!");
    }
    public void clear(View view){
        EditText a_field = (EditText)findViewById(R.id.first_num);
        a_field.setText("0");
        EditText b_field = (EditText)findViewById(R.id.second_num);
        b_field.setText("0");
        display("0");
    }

    private void display(String num){
        TextView showText = (TextView) findViewById(R.id.result_field);
        showText.setText(num);
    }
}