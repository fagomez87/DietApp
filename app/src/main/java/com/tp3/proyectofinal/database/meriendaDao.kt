package com.tp3.proyectofinal.database
import androidx.room.*
import com.tp3.proyectofinal.entity.food.Merienda

@Dao
interface meriendaDao {
    @Query("SELECT * FROM meriendas ORDER BY id")
    fun loadAllMerienda(): MutableList<Merienda?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMerienda(merienda: Merienda?)

    @Update
    fun updateMerienda(merienda: Merienda?)

    @Delete
    fun delete(merienda: Merienda?)

    @Query("SELECT * FROM meriendas WHERE id = :id")
    fun loadMeriendaById(id: Int): Merienda?


}