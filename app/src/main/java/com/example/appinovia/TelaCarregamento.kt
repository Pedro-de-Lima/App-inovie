package com.example.appinovia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TelaCarregamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_carregamento)

        supportActionBar!!.hide()

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        val txtNomeDr = findViewById<TextView>(R.id.txtNomeDr)

        txtNomeDr.text = "Bem Vinda,${nomeDigitado}!"
    }
}