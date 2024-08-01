package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fuelcalculator.databinding.ActivityPrecoBinding
import com.google.android.material.textfield.TextInputEditText

class ActivityPreco : AppCompatActivity() {

    private lateinit var binding : ActivityPrecoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrecoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textPreco = binding.tvPreco
        val botaoPreco = binding.btnPreco

        botaoPreco.setOnClickListener{
            val preco = textPreco.text.toString()

            val intent = Intent(this, ActivityConsumo::class.java)
            startActivity(intent)
        }

    }
}
