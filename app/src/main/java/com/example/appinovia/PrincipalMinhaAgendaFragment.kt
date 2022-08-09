package com.example.appinovia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment


class PrincipalMinhaAgendaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_principal_minha_agenda, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listview = view.findViewById<ListView>(R.id.agenda)

        val horario = arrayOf("10h","11h","12h","13h","14h","15h","16h","17h","18h","19h","20h","21h","22h")


        //listview.setOnClickListener{adapterView, view, i, l -> Toast.makeText(this, "")}
    }

}