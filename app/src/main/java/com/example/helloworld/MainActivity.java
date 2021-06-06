package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Muestra un mensaje emergente en pantalla
    public void mensajeActivitySecundario(View view) {
        //Toast.makeText saca el mensaje en pantalla que recibe como parámetro en la misma pantalla
        Toast.makeText(this, "Entrando en el activity secundario", Toast.LENGTH_SHORT).show();
    }

    //Cargamos la pantalla conocida como ActivitySecundario
    public void iniciarActivitySecundario(View view) {
        //Declaramos el Intent que corresconderá a la pantalla o activity que queremos cargar
        //Habrá que declarar su clase
        Intent intentSecundario = new Intent(this, ActivitySecundario.class);
        //Con el metodo startActivity lo ejecutaremos
        startActivity(intentSecundario);
    }
}