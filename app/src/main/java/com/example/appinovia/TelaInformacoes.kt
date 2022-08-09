package com.example.appinovia

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.appinovia.databinding.ActivityTelaInformacoesBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TelaInformacoes : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInformacoesBinding

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInformacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val btVoltar = findViewById<ImageButton>(R.id.btvoltarInformacoes)

        configTablayout()

        btVoltar.setOnClickListener{
            voluntary()
        }

    }

    private fun configTablayout(){
        val adapter = ViewPagerAdapter(this)
        binding.viewImformacao.setAdapter(adapter)

        adapter.addFragment(ClienteProfissionalFragment(), "Cliente e Profissional")
        adapter.addFragment(UltimaSessaoFragment(), "Ultima Sessão")

        binding.viewImformacao.setOffscreenPageLimit(adapter.itemCount)

        val mediator = TabLayoutMediator(
            binding.tabInformcao, binding.viewImformacao
        ){ tab: TabLayout.Tab, position: Int -> tab.text = adapter.getTitle(position)}
        mediator.attach()
    }

    private fun voluntary(){
        val informacoes = Intent(this, TelaPreparacao::class.java)

        startActivity(informacoes)
    }
}