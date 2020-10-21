package com.tp3.proyectofinal.fragment

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.tp3.proyectofinal.R
import com.tp3.proyectofinal.adapter.login.Login
import com.tp3.proyectofinal.database.userDao
import com.tp3.proyectofinal.entity.user.User
import java.sql.Date


class LoginFragment : Fragment() {
//    var usuarios : MutableList<User> = ArrayList<User>()

    private lateinit var adapter : Login

    // Access a Cloud Firestore instance from your Activity
    val db = Firebase.firestore


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val btnRegister = view.findViewById<Button>(R.id.btnRegister)
        val username = view.findViewById(R.id.userTxt) as EditText
        val password = view.findViewById(R.id.passTxt) as EditText
        btnLogin.setOnClickListener {
            /*if (validateLogin(username.text, password.text)) {
                view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            } else {
                Toast.makeText(context, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }*/
        }
        btnRegister.setOnClickListener{
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        return view
    }

/*    private fun validateLogin(usr: Editable, pass: Editable): Boolean {
        var valid = false

        for (elem in usuarios)
            if (elem.name == usr.toString())
                if (elem.pass == pass.toString())
                    valid = true
        return valid

    }*/

    override fun onStart() {
        super.onStart()

        var usr = User(1,"prb0", "prb0@gmail.com", "prb0", "prb0","aasda")
        db.collection("users").document(usr.name).set(usr)

//        usuarios.add(User(2,"prb1", "prb1@gmail.com", "prb1", "prb1", Date(537062400000)))
//        usuarios.add(User(3,"prb2", "prb2@gmail.com", "prb2", "prb2", Date(397353600000)))
    }

}