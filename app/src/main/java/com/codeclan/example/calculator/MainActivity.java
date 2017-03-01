package com.codeclan.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button addBtn;
    Button subBtn;
    Button multBtn;
    Button divBtn;
    Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        addBtn = (Button) findViewById(R.id.add);
        subBtn = (Button) findViewById(R.id.subtract);
        multBtn = (Button) findViewById(R.id.multiply);
        divBtn = (Button) findViewById(R.id.divide);
        calc = new Calculator();
    }

    public void onCalcButtonClick(View view){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = 0;
        switch(view.getId()){
            case R.id.add:
                result = calc.add(number1, number2);
                break;
            case R.id.subtract:
                result = calc.subtract(number1, number2);
                break;
            case R.id.multiply:
                result = calc.multiply(number1, number2);
                break;
            case R.id.divide:
                result = calc.divide(number1, number2);
                break;
        }

        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        intent.putExtra("answer", result);
        startActivity(intent);
    }
}
