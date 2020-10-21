package com.tp3.proyectofinal.database
import androidx.room.*
import com.tp3.proyectofinal.entity.food.Cena

interface cenaDao {

    @Query("SELECT * FROM cenas ORDER BY id")
    fun loadAllCena(): MutableList<Cena?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCena(cena: Cena?)

    @Update
    fun updateCena(cena: Cena?)

    @Delete
    fun delete(cena: Cena?)

    @Query("SELECT * FROM cenas WHERE id = :id")
    fun loadCenaById(id: Int): Cena?
}