package com.supertramp.intentsypasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView textMensaje;
    ListView lista;
    List<String> versionesAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Bundle extras = getIntent().getExtras();
        String emailPasado = extras.getString("valorEmail");


        textMensaje = findViewById(R.id.textViewMensaje);
        textMensaje.setText("Bienvenido: " + emailPasado);
        setTitle(emailPasado);


        lista = findViewById(R.id.listViewElementos);
        versionesAndroid = new ArrayList<>();
        versionesAndroid.add("Pie");
        versionesAndroid.add("Oreo");
        versionesAndroid.add("Nougat");
        versionesAndroid.add("Marshmallow");
        versionesAndroid.add("Lollipop");
        versionesAndroid.add("KitKat");

        // Usamos un adaptador (que es una plantilla qeu ya existe en android)
        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(this, android.R.layout.simple_list_item_1, versionesAndroid );

        // vinculación
        lista.setAdapter(adaptadorVersionesAndroid);

        //Gestión del evento clic
        AdapterView.OnItemClickListener onItemClickListener = ;
        lista.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String versionAnd = versionesAndroid.get(i);
        Log.i("APP", "....-----version click:" + versionAnd);
    }
}