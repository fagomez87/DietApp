package com.tp3.proyectofinal.entity.user

import com.tp3.proyectofinal.entity.login.Credential

class User {
    var us1 : Credential = Credential("Usr", "Pass")

    var us2 : Credential = Credential("Usr2", "Pass2")
    var us3 : Credential = Credential("Usr3", "Pass3")

    val usuarios : List<Credential> = mutableListOf<Credential>(us1,us2,us3)

}