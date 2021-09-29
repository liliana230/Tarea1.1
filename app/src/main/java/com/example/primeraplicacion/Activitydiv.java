package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activitydiv extends AppCompatActivity {
    TextView txtresultado3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydiv);

        txtresultado3 = findViewById(R.id.txtresultd);

        String txtnum1=getIntent().getStringExtra("num1");
        String txtnum2=getIntent().getStringExtra("num2");
        Double resultado3;
        resultado3=Double.parseDouble(txtnum1) / Double.parseDouble(txtnum2);
        txtresultado3.setText(resultado3.toString());

    }
}