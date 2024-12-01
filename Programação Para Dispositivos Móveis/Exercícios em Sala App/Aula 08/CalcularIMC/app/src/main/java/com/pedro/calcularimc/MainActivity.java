package com.pedro.calcularimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textoPeso = findViewById(R.id.editTextPeso);
        EditText textoAltura = findViewById(R.id.editTextAltura);
        Button botaoCalcular = findViewById(R.id.buttonCalcular);
        TextView textResultado = findViewById(R.id.editTextResultado);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String campoPeso = textoPeso.getText().toString();
                String campoAltura = textoAltura.getText().toString();

                if (!campoPeso.isEmpty() && !campoAltura.isEmpty()) {
                    double peso = Double.parseDouble(campoPeso);
                    double altura = Double.parseDouble(campoAltura);
                    double imc = peso / (altura*altura);

                    if(imc < 18.5) textResultado.setText(String.format("Seu imc é: Peso Baixo"));
                    else if(imc >= 18.5 && imc <= 24.9) textResultado.setText(String.format("Seu imc é: Peso Normal"));
                    else if(imc >= 25.0 && imc <= 29.9) textResultado.setText(String.format("Seu imc é: Sobrepeso"));
                    else if(imc >= 30.0 && imc <= 34.9) textResultado.setText(String.format("Seu imc é: Obesidade I"));
                    else if(imc >= 35.0 && imc <= 39.9) textResultado.setText(String.format("Seu imc é: Obesidade II"));
                    else textResultado.setText(String.format("Seu imc é: Obesidade III"));

                } else {
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
