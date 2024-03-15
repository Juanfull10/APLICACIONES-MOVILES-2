package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class P_FACTORIAL extends AppCompatActivity {

    private static EditText valor1;


    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfactorial);

        valor1=findViewById(R.id.cuadrito1);
        resultado=findViewById(R.id.respuesta);
    }

    public void fact(View view){
        String numero = valor1.getText().toString();

        int num;



            num = Integer.parseInt(valor1.getText().toString());
            int resultadofactorial = factorial(num);
            resultado.setText(Integer.toString(resultadofactorial));


    }
    public static int factorial(int numero1) {
        int resultado = 0;

        if(numero1==0||numero1==1){
            return numero1;
        } else if(numero1>1) {
            resultado=numero1*factorial(numero1-1);
        }
        return resultado;
    }

    public void volver(View view){

        finishActivity();
    }

    private void finishActivity() {
        Intent c= new Intent(this, P_FACTORIAL.class);
        finish();
    }
}