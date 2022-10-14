package com.example.smartcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String myCalc = "";
    TextView edtShow, edtResult;
    Button btnClear, btnMod, btnBack, btnDiv, btnMin, btnPlus, btnMul, btn7, btn8, btn9, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btn00, btnEqual, btnDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn_0);
        btn00 = findViewById(R.id.btn_00);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnBack = findViewById(R.id.btn_back);
        btnMin = findViewById(R.id.btn_min);
        btnMod = findViewById(R.id.btn_mod);
        btnMul = findViewById(R.id.btn_mul);
        btnClear = findViewById(R.id.btn_c);
        btnDiv = findViewById(R.id.btn_div);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnPlus = findViewById(R.id.btn_plus);
        edtShow = findViewById(R.id.edt_show);
        edtResult = findViewById(R.id.tv_result);
        clicking();


    }


    public void clicking() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "1";
                edtShow.setText(myCalc);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "2";
                edtShow.setText(myCalc);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "3";
                edtShow.setText(myCalc);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "4";
                edtShow.setText(myCalc);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "5";
                edtShow.setText(myCalc);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "6";
                edtShow.setText(myCalc);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "7";
                edtShow.setText(myCalc);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "8";
                edtShow.setText(myCalc);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "9";
                edtShow.setText(myCalc);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "+";
                edtShow.setText(myCalc);
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "-";
                edtShow.setText(myCalc);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "*";
                edtShow.setText(myCalc);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "/";
                edtShow.setText(myCalc);
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "%";
                edtShow.setText(myCalc);
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "00";
                edtShow.setText(myCalc);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + "0";
                edtShow.setText(myCalc);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = myCalc + ".";
                edtShow.setText(myCalc);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalc = "";
                edtShow.setText("");
                edtResult.setText("");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myCalc = myCalc.substring(0, myCalc.length() - 1);
                edtShow.setText(myCalc);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double result = null;
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                try {
                    result = (double) engine.eval(myCalc);
                } catch (ScriptException e) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
                if (result != null) {
                    edtResult.setText(String.valueOf(result.doubleValue()));
                }
            }
        });
    }
}


