package com.tp3.proyectofinal.entity.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "users")
class User(id : Int, name : String, mail : String, user : String, pass : String, nacimiento : String){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int = id

    @ColumnInfo(name = "name")
    var name : String = ""

    @ColumnInfo(name = "mail")
    var mail : String = ""

    @ColumnInfo(name = "user")
    var user : String = ""

    @ColumnInfo(name = "pass")
    var pass : String = ""

    @ColumnInfo(name = "fnac")
    var nacimiento : String

    init {
        this.name = name
        this.mail = mail
        this.user = user
        this.pass = pass
        this.nacimiento = nacimiento
    }

    constructor() : this(0,"","","","","")

}
