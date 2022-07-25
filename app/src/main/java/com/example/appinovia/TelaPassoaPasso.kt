package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaPassoaPasso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_passoa_passo)

        supportActionBar!!.hide()

        val botaoIniciar = findViewById<Button>(R.id.botaoIniciar)

        botaoIniciar.setOnClickListener{
            IrTelaPreSessao()
        }
    }

    private fun IrTelaPreSessao(){
        val telaPreSessao = Intent(this, TelaPreSessao::class.java)
        startActivity(telaPreSessao)
    }

}