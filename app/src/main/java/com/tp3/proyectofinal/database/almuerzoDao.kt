package com.tp3.proyectofinal.database
import androidx.room.*
import com.tp3.proyectofinal.entity.food.Almuerzo

@Dao
interface almuerzoDao {
    @Query("SELECT * FROM almuerzos ORDER BY id")
    fun loadAllAlmuerzo(): MutableList<Almuerzo?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAlmuerzo(almuerzo: Almuerzo?)

    @Update
    fun updateAlmuerzo(almuerzo: Almuerzo?)

    @Delete
    fun delete(almuerzo: Almuerzo?)

    @Query("SELECT * FROM almuerzos WHERE id = :id")
    fun loadAlmuerzoById(id: Int): Almuerzo?


}