package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar!!.hide()

        val botaoLogin = findViewById<Button>(R.id.botaoLogin)

        botaoLogin.setOnClickListener{
            irParaTelaCarregamento()
        }

    }

    private fun irParaTelaCarregamento() {
        val editUsuario = findViewById<EditText>(R.id.editUsuario)
        val nomeDigitado = editUsuario.text.toString()
        val segundaTela = Intent(this, TelaPrincipal::class.java)

        intent.putExtra("NOME_DIGITADO", nomeDigitado)

        startActivity(segundaTela)
    }
}

private fun Intent.putExtra(name: Any) {

}
