package com.example.fuelcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelcalculator.databinding.ActivityPrecoBinding
import com.google.android.material.snackbar.Snackbar


class ActivityPreco : AppCompatActivity() {

    private lateinit var binding: ActivityPrecoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrecoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tiepreco = binding.tiePreco
        val btnpreco = binding.btnPreco

        btnpreco.setOnClickListener {
            val precoStr: String = tiepreco.text.toString()
            if (precoStr.isEmpty()) {
                Snackbar
                    .make(
                        tiepreco,
                    "Por favor, insira o preço do combustível",
                    Snackbar.LENGTH_LONG
                )
                .show()
            } else {
                val preco = precoStr.toFloat()
                val intent = Intent(this, ActivityConsumo::class.java)
                intent.putExtra("KEY_PRECO",preco)
                startActivity(intent)
            }
        }
    }
}
