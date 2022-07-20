package com.example.appinovia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar!!.hide()

        val botaoLogin = findViewById<Button>(R.id.botaoLogin)
        val editUsuario = findViewById<EditText>(R.id.editUsuario)


        botaoLogin.setOnClickListener{

            val nomeDigitado = editUsuario.text.toString()

            intent.putExtra("NOME_DIGITADO", nomeDigitado)

            irParaTelaCarregamento()
        }

    }

    private fun irParaTelaCarregamento() {

        val segundaTela = Intent(this, TelaCarregamento::class.java)

        startActivity(segundaTela)
    }
}

private fun Intent.putExtra(name: Any) {

}
