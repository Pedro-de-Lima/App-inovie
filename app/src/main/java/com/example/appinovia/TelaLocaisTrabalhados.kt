package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaLocaisTrabalhados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_locais_trabalhados)

        supportActionBar!!.hide()

        val btContinuar = findViewById<Button>(R.id.btContinuar)

        btContinuar.setOnClickListener {
            telaMedidas()
        }
    }

    private fun telaMedidas(){
        val tela = Intent(this, TelaMedidas::class.java)
        startActivity(tela)
    }
}