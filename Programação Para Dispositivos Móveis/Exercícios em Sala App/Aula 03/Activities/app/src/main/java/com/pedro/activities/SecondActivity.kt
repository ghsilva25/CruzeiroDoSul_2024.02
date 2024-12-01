package com.pedro.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.EdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EdgeToEdge.enable(this)
        setContentView(R.layout.activity_second)

        val buttonSortear: Button = findViewById(R.id.buttonSortear)
        val textViewModelo: TextView = findViewById(R.id.textViewModelo)
        val modelos = Modelos()

        buttonSortear.setOnClickListener {
            val modelosDeCarros = modelos.getModelosDeCarros()
            val aleatorio = Random.nextInt(modelosDeCarros.size)
            textViewModelo.text = modelosDeCarros[aleatorio]
        }
    }
}
