package com.tp3.proyectofinal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.tp3.proyectofinal.R
import com.tp3.proyectofinal.entity.user.User

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    // Access a Cloud Firestore instance from your Activity
    val db = Firebase.firestore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val nombre = view.findViewById<TextView>(R.id.nameTxt)
        val user = view.findViewById<TextView>(R.id.userTxt)
        val mail = view.findViewById<TextView>(R.id.mailTxt)
        val pass = view.findViewById<TextView>(R.id.passTxt)
        val nac = view.findViewById<TextView>(R.id.dateBirth)
        val btnRegister = view.findViewById<Button>(R.id.regBtn)
        btnRegister.setOnClickListener{
            registerUser(nombre.toString(),user.toString(),mail.toString(),pass.toString(),nac.toString())
            view.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        return view
    }

    private fun registerUser(nombre: String, user: String, mail: String, pass: String, fnac: String) {
        db.collection("users")

    }

}