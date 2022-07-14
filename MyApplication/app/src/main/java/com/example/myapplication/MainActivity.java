package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView nome;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button btn;
    private Button cambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// aq e link com xml
        nome=findViewById(R.id.setnome);
        e1 = findViewById(R.id.nome);
        e2 = findViewById(R.id.senha);
        e3 = findViewById(R.id.matricula);
        btn = findViewById(R.id.btnEnviar);
        cambiar = findViewById(R.id.btncambiar);
        btn.setOnClickListener(this);
        cambiar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnEnviar){

        String n;
        String s;
        String m;
        n = e1.getText().toString();
        s = e2.getText().toString();
        m = e3.getText().toString();

        String msg = "Usuario" + n + ", senha" + s + ",matricula" + m;
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }


            if (v.getId() == R.id.btncambiar) {
                String n;
                n = e1.getText().toString();
                nome.setText(n);
                String msg1 = "sucesso";
                Toast.makeText(getApplicationContext(), msg1, Toast.LENGTH_LONG).show();

            }

    }
}