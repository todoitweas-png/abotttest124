package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText etMensaje;
    private Button btnEnviar;
    public static final String msj = "com.example.intentsapp.msj";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMensaje = findViewById(R.id.etMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });
    }

    private void enviarDatos() {
        String mensaje = etMensaje.getText().toString();

            Intent intent = new Intent(MainActivity.this, Actividad2.class);
            intent.putExtra(msj, mensaje);
            startActivity(intent);
        }
    }
