package com.viktoriagavrosh.weather.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.viktoriagavrosh.weather.data.database.dao.WeatherDao
import com.viktoriagavrosh.weather.data.database.model.DayDb
import com.viktoriagavrosh.weather.data.database.model.HourDb

class WeatherDatabase internal constructor(
    private val database: AppDatabase
) {
    val weatherDao: WeatherDao
        get() = database.weatherDao()
}

/**
 * Database class with a singleton instance
 */
@Database(
    entities = [DayDb::class, HourDb::class],
    version = 1,
    exportSchema = false,
)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}

fun getDatabase(context: Context): WeatherDatabase {
    val database = Room.databaseBuilder(
        context = context,
        klass = AppDatabase::class.java,
        name = "weather"
    )
        .fallbackToDestructiveMigration()
        .build()
    return WeatherDatabase(database = database)
}
