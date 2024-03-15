package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class P_FIBONACCI extends AppCompatActivity {

    private static EditText valor1;


    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfibonacci);

        valor1=findViewById(R.id.cuadrito1);
        resultado=findViewById(R.id.respuesta);
    }

    public void fibo(View view){

        String numero = valor1.getText().toString();
        int num;


            num = Integer.parseInt(valor1.getText().toString());
            int resultadoFibonacci = fibonacci(num);
            resultado.setText(Integer.toString(resultadoFibonacci));


    }
    public static int fibonacci(int numero1) {
        if(numero1<=1){
            return numero1;
        } else{
            return fibonacci(numero1-1) + fibonacci(numero1-2);

        }
    }

    public void volver(View view){

        finishActivity();
    }

    private void finishActivity() {
        Intent c= new Intent(this, P_FIBONACCI.class);
        finish();
    }
}