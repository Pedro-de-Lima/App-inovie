package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TelaPreSessao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pre_sessao)

        supportActionBar!!.hide()

        val botaoVoltar = findViewById<ImageButton>(R.id.botaoVoltar)
        val viewAbdomenCosta = findViewById<View>(R.id.viewAbdomenCosta)

        viewAbdomenCosta.visibility = View.INVISIBLE

        viewAbdomenCosta.setOnClickListener {

            }

        botaoVoltar.setOnClickListener{
            voltar()
        }
    }

    fun visivel(){
        var viewAbdomenCosta = findViewById<View>(R.id.viewAbdomenCosta)
        if(viewAbdomenCosta.isClickable){
            viewAbdomenCosta.visibility = View.VISIBLE

        }

    }

    private fun voltar(){
        val voltar = Intent(this, TelaPassoaPasso::class.java)

        startActivity(voltar)
    }
}