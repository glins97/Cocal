package com.example.projeto1

import android.content.Context
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.boulder_ticket.view.*
import kotlinx.android.synthetic.main.fragment_project_boulders.view.*
import com.example.projeto1.Services.BoulderAdaptar

class ProjectBouldersFragment : Fragment() {
    var boulders = ArrayList<Boulder>()
    lateinit var bouldersAdapter: BoulderAdaptar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_all_boulders, container, false)
        for (i in 1..50){
            boulders.add(Boulder("Teto de Vidro", "Casa da Cobra", 1))
        }

        bouldersAdapter = BoulderAdaptar(activity!!, boulders)
        view.boulders_lv.adapter = bouldersAdapter
        return view
    }

}
