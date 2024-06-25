package com.example.walletintegradora.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.walletintegradora.data.response.UserSchema

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = [UserSchema::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun userDao(): UserSchema

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getDataBase(context: Context): AppDataBase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "base_dato"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}