package com.example.dam_elberthluquev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button b_enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SE HACE REFERENCIA AL BOTON
        b_enviar = findViewById(R.id.button_enviar);

        //evento click

        b_enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show();
    }
}