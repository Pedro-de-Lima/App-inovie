package com.example.appinovia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar!!.hide()

        val botaoLogin = findViewById<Button>(R.id.botaoLogin)

        botaoLogin.setOnClickListener{
            irParaTelaPrincipal()
        }

    }

    private fun irParaTelaPrincipal() {
        val segundaTela = Intent(this, MainActivity::class.java)
        startActivity(segundaTela)
    }
}