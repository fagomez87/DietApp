package com.tp3.proyectofinal.entity.food
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "cenas")
class Cena(idMenu : Int, nombreMenu : String, detalle : String, porcion : int , calorias : int, tipoComida : String, idImagen : int ) {

    @PrimaryKey
    @ColumnInfo(name = "idMenu")
    var idMenu : Int = idMenu

    @ColumnInfo(name = "nombreMenu")
    var nombreMenu : String = ""

    @ColumnInfo(name = "detalle")
    var detalle : String = ""

    @ColumnInfo(name = "porcion")
    var porcion : Int = porcion

    @ColumnInfo(name = "calorias")
    var calorias : Int = calorias

    @ColumnInfo(name = "tipoComida")
    var tipoComida : String = ""

    @ColumnInfo(name = "idImagen")
    var idImagen : Int = idImagen

    init {
        this.idMenu = idMenu
        this.nombreMenu = nombreMenu
        this.detalle = detalle
        this.porcion = porcion
        this.calorias = calorias
        this.tipoComida = tipoComida
        this.idImagen = idImagen
    }
}