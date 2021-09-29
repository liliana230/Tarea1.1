package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activityresta extends AppCompatActivity {

    TextView txtresultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityresta);

        txtresultado2 = findViewById(R.id.txtresults);

        String txtnum1=getIntent().getStringExtra("num1");
        String txtnum2=getIntent().getStringExtra("num2");
        Double resultado2;
        resultado2=Double.parseDouble(txtnum1) - Double.parseDouble(txtnum2);
        txtresultado2.setText(resultado2.toString());


    }
}