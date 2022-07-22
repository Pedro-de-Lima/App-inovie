package com.example.appinovia

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import  androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {PrincipalMinhaAgendaFragment()}
            1 -> {PrincipalAgendaClinicaFragment()}
            else -> { throw Resources.NotFoundException("posição não encontrada")}
        }
    }
}