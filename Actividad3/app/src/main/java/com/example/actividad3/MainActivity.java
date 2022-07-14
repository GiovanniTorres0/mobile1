package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText e1;
    private EditText e2;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.email);
        e2=findViewById(R.id.senha);
        login=findViewById(R.id.btnlogin);
        login.setOnClickListener(this);

        }


    @Override
    public void onClick(View v) {

        String mail= e1.getText().toString();
        String senha= e2.getText().toString();
        if(mail.equals("123")&&senha.equals("345")){
            Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Iniciando..",Toast.LENGTH_SHORT).show();

        } else
            Toast.makeText(getApplicationContext(),"Error al iniciar sesion",Toast.LENGTH_SHORT).show();

    }
}