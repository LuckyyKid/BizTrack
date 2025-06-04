package com.example.biztrack.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.biztrack.modele.produit

@Database(entities = [produit::class], version = 1, exportSchema = false)
abstract class BizDatabase : RoomDatabase() {

    abstract fun produitDao(): produitDao

    companion object {
        @Volatile
        private var INSTANCE: BizDatabase? = null

        fun getDatabase(context: Context): BizDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BizDatabase::class.java,
                    "biz_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}