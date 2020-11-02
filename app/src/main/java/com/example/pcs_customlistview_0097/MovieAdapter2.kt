package com.example.pcs_customlistview_0097

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MovieAdapter2(context: Context, resource: Int, objects: ArrayList<Movie2>) :
        ArrayAdapter<Movie2>(context, resource, objects) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var title = getItem(position)?.title
        var year = getItem(position)?.year


        val inflater = LayoutInflater.from(context)
        @Suppress("NAME_SHADOWING") var convertView = inflater.inflate(R.layout.item_row, parent, false)

        var txtTitle:TextView = convertView.findViewById(R.id.txtTitle)
        var txtYear:TextView = convertView.findViewById(R.id.txtYear)

        txtTitle.text = title
        txtYear.text = year

        return convertView

    }
}
