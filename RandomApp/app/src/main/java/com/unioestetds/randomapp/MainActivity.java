package com.unioestetds.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = findViewById(R.id.textoResultado);
    }

    public void randomNumero(View view){
        int numero = new Random().nextInt(11);
        textoResultado.setText("O número selecionado é: " + numero);
    }
}