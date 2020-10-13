package com.tp3.proyectofinal.entity.food
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "comidasRealizadas")
class ComidaRealizada (idUsuario : Int, nombreUsuario : String, idMenu : Int, nombreMenu : String , diaRealizada : date , diaSemana : date, idImagen : int ) {

    @PrimaryKey
    @ColumnInfo(name = "idUsuario")
    var idUsuario : Int = idUsuario

    @ColumnInfo(name = "nombreUsuario")
    var nombreUsuario : String = ""

    @ColumnInfo(name = "idMenu")
    var idMenu : Int = idMenu

    @ColumnInfo(name = "nombreMenu")
    var nombreMenu : String = ""

    @ColumnInfo(name = "diaRealizada")
    var diaRealizada : date = diaRealizada

    @ColumnInfo(name = "diaSemana")
    var diaSemana : date = diaRealizada

    @ColumnInfo(name = "idImagen")
    var idImagen : Int = idImagen

    init {
        this.idUsuario = idUsuario
        this.nombreUsuario = nombreUsuario
        this.idMenu = idMenu
        this.nombreMenu = nombreMenu
        this.diaRealizada = diaRealizada
        this.diaSemana = diaSemana
        this.idImagen = idImagen
    }
}