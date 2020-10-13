package com.tp3.proyectofinal.database
import androidx.room.*
import com.tp3.proyectofinal.entity.food.Deayuno

@Dao
interface desayunoDao {
    @Query("SELECT * FROM desayunos ORDER BY id")
    fun loadAllDesayuno(): MutableList<Desayuno?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDesayuno(desayuno: Desayuno?)

    @Update
    fun updateDesayuno(desayuno: Desayuno?)

    @Delete
    fun delete(desayuno: Desayuno?)

    @Query("SELECT * FROM desayunos WHERE id = :id")
    fun loadDesayunoById(id: Int): Desayuno?

}