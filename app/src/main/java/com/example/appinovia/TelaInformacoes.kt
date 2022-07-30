package com.example.appinovia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appinovia.databinding.ActivityTelaInformacoesBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TelaInformacoes : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInformacoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInformacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        configTablayout()

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
}