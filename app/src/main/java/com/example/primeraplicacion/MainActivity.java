package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 =(EditText) findViewById(R.id.txtnum1);
        txtnum2 =(EditText) findViewById(R.id.txtnum2);

        Button btnsuma = findViewById(R.id.btnsuma);
        Button btnresta = findViewById(R.id.btnresta);
        Button btndivision = findViewById(R.id.btndivision);
        Button btnmultiplicar = findViewById(R.id.btnmultiplicar);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color;
                View contenedor = view.getRootView();
                color= Color.parseColor("#F8BBD0");
                contenedor.setBackgroundColor(color);


                Intent intent= new Intent(getApplicationContext(), ActivityResults.class);
                intent.putExtra("num1", txtnum1.getText().toString());
                intent.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent);
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color;
                View contenedor = view.getRootView();
                color= Color.parseColor("#90CAF9");
                contenedor.setBackgroundColor(color);

                Intent intent2= new Intent(getApplicationContext(), Activityresta.class);
                intent2.putExtra("num1", txtnum1.getText().toString());
                intent2.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent2);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color;
                View contenedor = view.getRootView();
                color= Color.parseColor("#F3E5F5");
                contenedor.setBackgroundColor(color);

                Intent intent3= new Intent(getApplicationContext(), Activitydiv.class);
                intent3.putExtra("num1", txtnum1.getText().toString());
                intent3.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent3);
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color;
                View contenedor = view.getRootView();
                color= Color.parseColor("#B2DFDB");
                contenedor.setBackgroundColor(color);

                Intent intent4= new Intent(getApplicationContext(), Activitymult.class);
                intent4.putExtra("num1", txtnum1.getText().toString());
                intent4.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent4);
            }
        });
    }
}