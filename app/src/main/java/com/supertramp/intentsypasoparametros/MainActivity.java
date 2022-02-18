package com.supertramp.intentsypasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View btnLogin;
    EditText txtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(this);

        txtEmail = findViewById(R.id.editTextTextNombre);

    }




    @Override
    public void onClick(View view) {

        String email = txtEmail.getText().toString();

        if(!email.isEmpty()){
            Intent intentLogin = new Intent(MainActivity.this, HomeActivity.class);
            intentLogin.putExtra("valorEmail", email);
            startActivity(intentLogin);
        }else{

            txtEmail.setError("Complete el campo escriba algo");
        }

    }





}