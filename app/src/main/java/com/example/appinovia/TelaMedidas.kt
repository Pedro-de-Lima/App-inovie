package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class TelaMedidas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_medidas)

        supportActionBar!!.hide()

        val botaoAddMedidas = findViewById<Button>(R.id.botaoAddMedidas)
        val editLinearLayout = findViewById<LinearLayout>(R.id.editTextLinearLayout)
        val botaoTirarFoto = findViewById<Button>(R.id.botaoTirarFoto)

        botaoAddMedidas.setOnClickListener {
            // Create EditText
            val editText = EditText(this)
            editText.setHint("Enter something")
            editText.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            editText.setPadding(20, 20, 20, 20)

            val editText2 = EditText(this)
            editText.setHint("Enter something")
            editText.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            editText.setPadding(20, 20, 20, 20)

            // Add EditText to LinearLayout
            editLinearLayout?.addView(editText)
            editLinearLayout?.addView(editText2)
        }

        botaoTirarFoto.setOnClickListener{
            tirarfoto()
        }
    }

    private fun tirarfoto(){
        val foto = Intent(this, TelaFotos::class.java)
        startActivity(foto)
    }
}
