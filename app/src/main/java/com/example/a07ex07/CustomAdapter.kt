package com.example.a07ex07

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: ArrayList<Estados>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val foto = view.findViewById<ImageView>(R.id.bandeira)
        val nome = view.findViewById<TextView>(R.id.nome)
        val capital = view.findViewById<TextView>(R.id.capital)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.foto.setImageResource(dataSet[position].foto)
        holder.nome.text = dataSet[position].nome
        holder.capital.text = dataSet[position].capital

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}
