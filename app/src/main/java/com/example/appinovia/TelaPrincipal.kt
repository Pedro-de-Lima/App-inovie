package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        supportActionBar!!.hide()

        val viewProxima = findViewById<View>(R.id.viewProxima)

        viewProxima.setOnClickListener{
            telaPreparacao()
        }

    }

    private fun telaPreparacao(){
        val telapreparacao = Intent(this, TelaPreparacao::class.java)
        startActivity(telapreparacao)
    }
}