package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.fuelcalculator.databinding.ActivityConsumoBinding
import com.example.fuelcalculator.databinding.ActivityMainBinding

class ActivityConsumo : AppCompatActivity() {

    private lateinit var binding: ActivityConsumoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityConsumoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text_consumo = binding.tvConsumo
        val botao_consumo = binding.btnConsumo

        botao_consumo.setOnClickListener{
            val intent = Intent ( this, ActivityDistancia::class.java)
            startActivity(intent)
        }
    }
}