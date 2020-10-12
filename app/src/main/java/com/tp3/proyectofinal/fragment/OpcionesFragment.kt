package com.tp3.proyectofinal.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

import com.tp3.proyectofinal.R
import com.tp3.proyectofinal.entity.food.Food
import com.tp3.proyectofinal.adapter.opciones.FoodListAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [OpcionesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OpcionesFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var comidas : MutableList<Food> = ArrayList<Food>()
    private lateinit var listFood : RecyclerView
    lateinit var v : View
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var foodListAdapter: FoodListAdapter


//    override fun onCreate(savedInstanceState: Bundle?) {
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_opciones, container, false)

        listFood = v.findViewById(R.id.desayuno)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()

        comidas.add(Food("Comida1","Carnes",173,"asda","asdasdas"))
        comidas.add(Food("Comida2","Carnes",173,"asda","asdasdas"))
        comidas.add(Food("Comida3","Carnes",173,"asda","asdasdas"))
        comidas.add(Food("Comida4","Carnes",173,"asda","asdasdas"))
        comidas.add(Food("Comida5","Carnes",173,"asda","asdasdas"))

        setupRecyclerView()
    }

    fun onItemClick (position : Int ) {
        Snackbar.make(v,position.toString(), Snackbar.LENGTH_SHORT).show()
    }

    fun setupRecyclerView () {
        listFood.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        listFood.layoutManager = linearLayoutManager

        foodListAdapter = FoodListAdapter(comidas) { position -> onItemClick(position)}

        listFood.adapter = foodListAdapter

    }
}