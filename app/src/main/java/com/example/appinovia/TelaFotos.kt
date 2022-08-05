package com.example.appinovia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TelaFotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_fotos)

        supportActionBar!!.hide()
    }
}