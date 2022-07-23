package com.example.appinovia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaPassoaPasso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_passoa_passo)

        supportActionBar!!.hide()
    }
}