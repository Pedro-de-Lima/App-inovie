package com.example.appinovia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaPreparacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_preparacao)

        supportActionBar!!.hide()
    }
}