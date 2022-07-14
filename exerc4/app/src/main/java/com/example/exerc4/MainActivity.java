package com.example.exerc4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText real;
    private EditText dolar;
    private EditText peso;

    Double r, d, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        real = findViewById(R.id.reais);
        dolar = findViewById(R.id.dolar);
        peso = findViewById(R.id.peso);

        dolar.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                d = Double.parseDouble(dolar.getText().toString());
                p = (d * 39.55);
                peso.setText(String.valueOf(p));
                r = (d * 5.33);
                real.setText(String.valueOf(r));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s == null) {
                    dolar.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        peso.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                p = Double.parseDouble(peso.getText().toString());
                r = (p * 0.14);
                real.setText(String.valueOf(r));
                d = (p * 0.025);
                dolar.setText(String.valueOf(d));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s == null) {
                    peso.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        real.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                r = Double.parseDouble(real.getText().toString());
                d = (r * 0.19);
                dolar.setText(String.valueOf(d));
                p = (r * 7.42);
                peso.setText(String.valueOf(p));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s == null) {
                    real.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

}








