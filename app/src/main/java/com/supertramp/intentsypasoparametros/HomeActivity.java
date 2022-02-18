package com.supertramp.intentsypasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView textMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Bundle extras = getIntent().getExtras();
        String emailPasado = extras.getString("valorEmail");


        textMensaje = findViewById(R.id.textViewMensaje);
        textMensaje.setText("Bienvenido: " + emailPasado);

    }
}