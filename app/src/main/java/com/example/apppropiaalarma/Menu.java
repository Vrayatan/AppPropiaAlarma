package com.example.apppropiaalarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //Funciones de navegación
    public void Nueva(View v) {
        Intent siguiente = new Intent(this, Nueva.class);
        startActivity(siguiente);
    }
    public void Config(View v) {
        Intent siguiente = new Intent(this, Configurar.class);
        startActivity(siguiente);
    }
    public void Historial(View v) {
        Intent siguiente = new Intent(this, Historial.class);
        startActivity(siguiente);
    }

    //Andrea tkm

}