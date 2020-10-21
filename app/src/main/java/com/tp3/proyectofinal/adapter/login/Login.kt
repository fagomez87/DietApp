package com.tp3.proyectofinal.adapter.login

import com.tp3.proyectofinal.database.userDao
import com.tp3.proyectofinal.entity.user.User

class Login (user: String) : userDao{
    override fun loadAllPersons(): MutableList<User?>? {
        TODO("Not yet implemented")
    }

    override fun insertPerson(user: User?) {
        TODO("Not yet implemented")
    }

    override fun updatePerson(user: User?) {
        TODO("Not yet implemented")
    }

    override fun delete(user: User?) {
        TODO("Not yet implemented")
    }

    override fun loadPersonById(id: Int): User? {
        TODO("Not yet implemented")
    }

    override fun loadPersonByName(name: String): User? {
        TODO("Not yet implemented")
        var user : User?

        return user
    }

}