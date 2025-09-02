package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;


public class Actividad2 extends AppCompatActivity {
    private TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado = findViewById(R.id.Resultado);

        // Se crea el string para almacenar el msj
        String dato = getIntent().getStringExtra(MainActivity.msj);

        // Lo muestra llega el string
        Resultado.setText(dato);
        //casa 2 2
    }

}