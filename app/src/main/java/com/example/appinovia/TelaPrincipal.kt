package com.example.appinovia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appinovia.databinding.ActivityTelaPrincipalBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class TelaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        configTablayout()

        binding.viewProxima.setOnClickListener {
            proximaTela()
        }
    }

    private fun configTablayout(){
        val adapter = ViewPagerAdapter(this)
        binding.viewPrincipal.setAdapter(adapter)

        adapter.addFragment(PrincipalMinhaAgendaFragment(), "Minha Agenda")
        adapter.addFragment(PrincipalAgendaClinicaFragment(), "Agenda da Clinica")

        binding.viewPrincipal.setOffscreenPageLimit(adapter.itemCount)

        val mediator = TabLayoutMediator(
            binding.tabPrincipal, binding.viewPrincipal
        ){tab: TabLayout.Tab, position: Int -> tab.text = adapter.getTitle(position)}
        mediator.attach()
    }

    private fun proximaTela(){
        val proxima = Intent(this, TelaPreparacao::class.java)
        startActivity(proxima)
    }

}
