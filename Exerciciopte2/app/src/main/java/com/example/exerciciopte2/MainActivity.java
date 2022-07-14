package com.example.exerciciopte2;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView cont2;
    private Button buton;
    private int c=0;

    @Override
    protected void onCreate(Bundle dados) {
        super.onCreate(dados);
        if(dados != null){
            c = dados.getInt("cont2");
            cont2.setText(c + "");
        }

        setContentView(R.layout.activity_main);
        buton = findViewById(R.id.Boton);
        cont2 = findViewById(R.id.Contador);
        buton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        c++;
        cont2.setText(c +"");

    }
    @Override
    protected void onSaveInstanceState(Bundle dados) {
        super.onSaveInstanceState(dados);
        dados.putInt("cont2" , c);


    }
}