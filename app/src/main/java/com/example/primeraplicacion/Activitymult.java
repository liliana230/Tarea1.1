package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activitymult extends AppCompatActivity {
     TextView txtresultado4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymult);

        txtresultado4 = findViewById(R.id.txtresultsm);

        String txtnum1=getIntent().getStringExtra("num1");
        String txtnum2=getIntent().getStringExtra("num2");
        Double resultado4;
        resultado4=Double.parseDouble(txtnum1) * Double.parseDouble(txtnum2);
        txtresultado4.setText(resultado4.toString());
    }
}