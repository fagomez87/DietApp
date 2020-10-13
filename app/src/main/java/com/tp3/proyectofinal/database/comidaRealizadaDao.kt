package com.tp3.proyectofinal.database
import androidx.room.*
import com.tp3.proyectofinal.entity.food.ComidaRealizada

@Dao
interface comidaRealizadaDao {
    @Query("SELECT * FROM comidasRealizadas ORDER BY id")
    fun loadAllComidaRealizada(): MutableList<ComidaRealizada?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertComidaRealizada(comidaRealizada: ComidaRealizada?)

    @Update
    fun updateComidaRealizada(comidaRealizada: ComidaRealizada?)

    @Delete
    fun delete(comidaRealizada: ComidaRealizada?)

    @Query("SELECT * FROM comidasRealizadas WHERE id = :id")
    fun loadComidaRealizadaById(id: Int): ComidaRealizada?

}