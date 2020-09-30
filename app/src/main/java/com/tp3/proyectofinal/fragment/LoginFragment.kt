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
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.tp3.proyectofinal.R
import com.tp3.proyectofinal.entity.user.User


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
//    private var user: String? = null
//    private var password: String? = null
    var usuarios : MutableList<User> = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
//            esto serviría para pasarle a la home el usuario logueado
//            user = it.getString(ARG_PARAM1)
        }
    }

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
            if (validateLogin(username.text, password.text)) {
                view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            } else {
                Toast.makeText(context, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }
        }
        btnRegister.setOnClickListener{
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        return view
    }

    private fun validateLogin(usr: Editable, pass: Editable): Boolean {
        val user = User(usr.toString(), pass.toString())
        for (elem in usuarios)
            if (elem.name == user.name)
                if (elem.pass == user.pass)
                    return true
        return false

    }

    override fun onStart() {
        super.onStart()
        usuarios.add(User("usr1","pass1"))
        usuarios.add(User("usr2", "pass2"))
        usuarios.add(User("usr3", "pass3"))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}