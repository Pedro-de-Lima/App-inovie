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

        val txtCancelar = findViewById<TextView>(R.id.txtCancelar)
        val botaoAvancar = findViewById<Button>(R.id.botaoAvancar)

        txtCancelar.setOnClickListener{
            cancelar()
        }

        botaoAvancar.setOnClickListener{
            botaoIniciar()
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

}


