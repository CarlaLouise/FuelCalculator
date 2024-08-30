package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelcalculator.databinding.ActivityDistanciaBinding
import com.google.android.material.snackbar.Snackbar

class ActivityDistancia : AppCompatActivity() {

    private lateinit var binding: ActivityDistanciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDistanciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tiedistance = binding.tieDistance
        val btndistance = binding.btnDistance

      btndistance.setOnClickListener {
            val distanciaStr: String = tiedistance.text.toString()

            if (distanciaStr.isEmpty()){
                Snackbar
                    .make(
                        tiedistance,
                        "Por favor, insira a distancia.",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val distancia = distanciaStr.toFloat()
                val preco = intent.getFloatExtra("KEY_PRECO", 0f)
                val consumo = intent.getFloatExtra("KEY_CONSUMO", 0f)
                val intent = Intent (this, ActivityResultado::class.java )
                intent.putExtra("KEY_PRECO", preco)
                intent.putExtra("KEY_CONSUMO", consumo)
                intent.putExtra("KEY_DISTANCIA", distancia)
                startActivity(intent)

            }
        }
    }
}