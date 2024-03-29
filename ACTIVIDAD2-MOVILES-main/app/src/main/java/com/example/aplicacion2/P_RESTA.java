package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class P_RESTA extends AppCompatActivity {


    private static EditText valor1;
    private static EditText valor2;

    private static TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presta);

        valor1=findViewById(R.id.cuadrito1);
        valor2=findViewById(R.id.cuadrito2);
        resultado=findViewById(R.id.respuesta);
    }
    public void resta(View view){
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());

            Double resta= num1-num2;
            resultado.setText(resta+"");
        }
    }

    public void volver(View view){

        finishActivity();
    }

    private void finishActivity() {
        Intent c= new Intent(this,P_RESTA.class);
        finish();
    }

}