package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityResults extends AppCompatActivity {
    TextView txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        txtresultado = findViewById(R.id.txtresult);

        /*Suma*/
        String txtnum1=getIntent().getStringExtra("num1");
        String txtnum2=getIntent().getStringExtra("num2");
        Double resultado;
        resultado=Double.parseDouble(txtnum1) + Double.parseDouble(txtnum2);
        txtresultado.setText(resultado.toString());

        }

    }

