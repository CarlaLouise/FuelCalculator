package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelcalculator.databinding.ActivityConsumoBinding
import com.example.fuelcalculator.databinding.ActivityDistanciaBinding

class ActivityDistancia : AppCompatActivity() {

    private lateinit var binding: ActivityDistanciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDistanciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text_distance = binding.tvDistance
        val botao_distance = binding.btnDistance

        botao_distance.setOnClickListener {
            val intent = Intent (this, ActivityResultado::class.java )
        }


    }
}