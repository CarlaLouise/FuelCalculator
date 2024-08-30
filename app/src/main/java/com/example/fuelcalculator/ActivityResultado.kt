package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelcalculator.databinding.ActivityResultadoBinding
import com.google.android.material.snackbar.Snackbar

class ActivityResultado : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preco = intent.getFloatExtra("KEY_PRECO", 0f)
        val consumo = intent.getFloatExtra("KEY_CONSUMO", 0f)
        val distancia = intent.getFloatExtra("KEY_DISTANCIA", 0f)

        if (preco <= 0 || consumo <= 0 || distancia <= 0) {
            Snackbar
                .make(
                    binding.root,
                    "Valores inválidos! Por favor, revise os dados inseridos.",
                    Snackbar.LENGTH_LONG)
                .show()
            return
        }


        val custoFinal = (distancia / consumo) * preco
        binding.tvValorFinal.text = "R$ %.2f".format(custoFinal)

        binding.tvResultPreco.text = "Preço: R$ %.2f".format(preco)
        binding.tvResultConsumo.text = "Consumo: %.2f Km/l".format(consumo)
        binding.tvResultKm.text = "Km: %.2f Km".format(distancia)

        binding.btnNewResult.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


