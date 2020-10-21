package com.tp3.proyectofinal.adapter.opciones

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.tp3.proyectofinal.R
import com.tp3.proyectofinal.entity.food.Food

class FoodListAdapter (private var foodList : MutableList<Food>, val onItemClick : (Int) -> Unit) : RecyclerView.Adapter<FoodListAdapter.FoodHolder>() {

    class FoodHolder (v: View) : RecyclerView.ViewHolder(v) {
        fun setName(name: String) {
            val txt : TextView = view.findViewById(R.id.txt_name_item)
            txt.text = name
        }

        fun getCardLayout() : CardView{
            return view.findViewById(R.id.card_package_item)
        }

        private var view : View = v
    }

    companion object {
        private val TAG = "FoodListAdapter"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comidas,parent,false)
        return (FoodHolder(view))
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        holder.setName(foodList[position].name)
        holder.getCardLayout().setOnClickListener{
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

}