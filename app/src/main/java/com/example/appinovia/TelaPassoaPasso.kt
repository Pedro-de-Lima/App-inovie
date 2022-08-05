package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaPassoaPasso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_passoa_passo)

        supportActionBar!!.hide()

        val botaoIniciar = findViewById<Button>(R.id.botaoIniciar)
        val txtCancelar = findViewById<TextView>(R.id.txtCancelarCorpo)

        botaoIniciar.setOnClickListener{
            IrTelaPreSessao()
        }
        txtCancelar.setOnClickListener{
            Cancelar()
        }
    }

    private fun IrTelaPreSessao(){
        val telaPreSessao = Intent(this, TelaPreSessao::class.java)
        startActivity(telaPreSessao)
    }

    private fun Cancelar(){
        val cancelar = Intent(this, TelaPreparacao::class.java)
        startActivity(cancelar)
    }

}