package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaPreparacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_preparacao)

        supportActionBar!!.hide()

        val txtCancelar = findViewById<TextView>(R.id.txtCancelarCorpo)
        val botaoAvancar = findViewById<Button>(R.id.botaoAvancar)
        val txtInformacao = findViewById<TextView>(R.id.txtInformacao)

        txtCancelar.setOnClickListener{
            cancelar()
        }

        botaoAvancar.setOnClickListener{
            botaoIniciar()
        }

        txtInformacao.setOnClickListener{
            maisInformacoes()
        }

    }

    private fun cancelar(){
        val cancelar = Intent(this, TelaPrincipal::class.java)
        startActivity(cancelar)
    }

    private fun botaoIniciar(){
        val avancar = Intent(this,TelaPassoaPasso::class.java)
        startActivity(avancar)
    }

    private fun maisInformacoes(){
        val informacoes = Intent(this, TelaInformacoes::class.java)
        startActivity(informacoes)
    }

}


