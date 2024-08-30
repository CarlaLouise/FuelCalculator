package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelcalculator.databinding.ActivityConsumoBinding
import com.google.android.material.snackbar.Snackbar

const val KEY_RESULT_PRECO = "ActivityConsumo.KEY_PRECO"

class ActivityConsumo : AppCompatActivity() {

    private lateinit var binding: ActivityConsumoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsumoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tieconsumo = binding.tieConsumo
        val btnconsumo = binding.btnConsumo

       btnconsumo.setOnClickListener {
            val consumoStr: String = tieconsumo.text.toString()

            if (consumoStr.isEmpty()) {
                Snackbar
                    .make(
                        tieconsumo,
                        "Por favor, insira o consumo do veiculo",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val consumo = consumoStr.toFloat()
                val preco = intent.getFloatExtra("KEY_PRECO", 0f)
                val intent = Intent(this, ActivityDistancia::class.java)
                intent.putExtra("KEY_PRECO", preco)
                intent.putExtra("KEY_CONSUMO", consumo)
                startActivity(intent)

            }
        }
    }
}