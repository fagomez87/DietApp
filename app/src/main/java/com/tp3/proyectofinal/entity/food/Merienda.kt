package com.tp3.proyectofinal.entity.food
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meriendas")
class Merienda (idMenu : Int, nombreMenu : String, detalle : String, porcion : Int , calorias : Int, tipoComida : String, idImagen : Int ){

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