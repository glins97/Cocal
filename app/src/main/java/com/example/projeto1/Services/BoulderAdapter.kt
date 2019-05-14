package com.example.projeto1.Services

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.projeto1.Activities.BoulderActivity
import com.example.projeto1.Boulder
import com.example.projeto1.R
import kotlinx.android.synthetic.main.boulder_ticket.view.*

class BoulderAdaptar: BaseAdapter {
    var boulders = ArrayList<Boulder>()
    var context: Context? = null
    constructor(context: Context, boulders: ArrayList<Boulder>):super(){
        this.boulders = boulders
        this.context = context
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val boulder = boulders[position]
        var inflator = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var myView = inflator.inflate(R.layout.boulder_ticket, null)
        myView.setOnClickListener{
            context!!.startActivity(Intent(context, BoulderActivity::class.java))
        }
        myView.name.text = boulder.name
        myView.sector.text = boulder.sector
        myView.grade.text = "v" + boulder.grade
        return myView
    }

    override fun getItem(position: Int): Any {
        return boulders[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return boulders.size
    }

}