package com.pedro.conversortemperatura;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textoTemperatura = findViewById(R.id.editTextTemperatura);
        Button botaoConverterCelsius = findViewById(R.id.buttonConverterParaCelsius);
        Button botaoConverterFahrenheit = findViewById(R.id.buttonConverterParaFahrenheit);
        TextView textoResultado = findViewById(R.id.textViewResultado);

        botaoConverterCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String campoTemperaturaFahrenheit = textoTemperatura.getText().toString();

                if(campoTemperaturaFahrenheit.isEmpty())
                    Toast.makeText(getApplicationContext(), "Preencha o campo de temperatura",Toast.LENGTH_SHORT).show();
                else {
                    double temperatura = Double.parseDouble(campoTemperaturaFahrenheit);
                    double celsius = (temperatura-32)*5/9;
                    textoResultado.setText(String.format("Temperatura: %.2f",celsius));
                }
            }
        });

        botaoConverterFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String campoTemperaturaCelsius = textoTemperatura.getText().toString();

                if(campoTemperaturaCelsius.isEmpty())
                    Toast.makeText(getApplicationContext(), "Preencha o campo de temperatura",Toast.LENGTH_SHORT).show();
                else {
                    double temperatura = Double.parseDouble(campoTemperaturaCelsius);
                    double fahrenheit = (temperatura*9/5)+32;
                    textoResultado.setText(String.format("Temperatura: %.2f", fahrenheit));
                }
            }
        });
    }
}