package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaPreSessao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pre_sessao)

        supportActionBar!!.hide()

        val botaoVoltar = findViewById<ImageButton>(R.id.botaoVoltar)
        val txtCancelar = findViewById<TextView>(R.id.txtCancelarCorpo)
        val txtSelecao = findViewById<TextView>(R.id.txtSelecao)
        val btCosta = findViewById<Button>(R.id.btCosta)
        val btAbdomen = findViewById<Button>(R.id.btAbdomen)
        val btContinuar = findViewById<Button>(R.id.btContinuar)
        val viewAbdomen = findViewById<View>(R.id.viewAbdomen)
        val viewCosta = findViewById<View>(R.id.viewCosta)

        //btAbdomen.visibility = View.INVISIBLE

        botaoVoltar.setOnClickListener{
            voltar()
        }
        txtCancelar.setOnClickListener{
            cancelar()
        }

        btContinuar.setOnClickListener {
            continuar()
        }

        btAbdomen.setOnClickListener{
            viewAbdomen.visibility = View.VISIBLE
            txtSelecao.text = "Local selecionado: Abdomen"
            txtCancelar.visibility = View.GONE
            btContinuar.visibility = View.VISIBLE
        }

        btCosta.setOnClickListener{
            viewCosta.visibility = View.VISIBLE
            txtSelecao.text = "Local selecionado: Costa"
            txtCancelar.visibility = View.GONE
            btContinuar.visibility = View.VISIBLE
        }


    }

    /*fun visivel(){
        var viewAbdomenCosta = findViewById<View>(R.id.viewAbdomenCosta)
        if(viewAbdomenCosta.isClickable){
            viewAbdomenCosta.visibility = View.VISIBLE

        }

    }*/

    private fun voltar(){
        val voltar = Intent(this, TelaPassoaPasso::class.java)

        startActivity(voltar)
    }

    private fun cancelar(){
        val cancelar = Intent(this, TelaMedidas::class.java)

        startActivity(cancelar)
    }

    private fun continuar(){
        val telaMedidas = Intent(this, TelaMedidas::class.java)

        startActivity(telaMedidas)
    }
}