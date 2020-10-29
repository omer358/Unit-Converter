package com.example.unitconverter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UnitsAdapter : RecyclerView.Adapter<UnitsAdapter.UnitViewHolder>() {

    val items = listOfUnits()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.unit_list_item, parent, false)
        return UnitViewHolder(view)
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        val item = items[position]
        holder.unit.text = item.unit
        holder.icon.setImageResource(item.icon)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class UnitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val unit: TextView = itemView.findViewById(R.id.tv_unit)
        val icon: ImageView = itemView.findViewById(R.id.im_icon)

    }

}