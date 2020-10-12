package com.tp3.proyectofinal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tp3.proyectofinal.entity.food.Food
import com.tp3.proyectofinal.entity.user.User

@Database(entities = [User::class,Food::class], version = 1, exportSchema = false)
abstract class appDatabase : RoomDatabase() {
    abstract fun userDao() : userDao

    companion object {
        var INSTANCE : appDatabase? = null

        fun getAppDataBase(context: Context) : appDatabase? {
            if (INSTANCE == null) {
                synchronized(appDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        appDatabase::class.java,
                        "myDB"
                    ).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }
        fun destroyDataBase() {
            INSTANCE = null
        }
    }
}