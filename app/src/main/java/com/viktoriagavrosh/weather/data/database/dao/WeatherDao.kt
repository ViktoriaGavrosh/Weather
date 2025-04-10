package com.viktoriagavrosh.weather.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.viktoriagavrosh.weather.data.database.model.DayDb
import com.viktoriagavrosh.weather.data.database.model.HourDb
import com.viktoriagavrosh.weather.data.database.model.WeatherDb

@Dao
interface WeatherDao {

    @Transaction
    @Query("SELECT * FROM days WHERE date = :date LIMIT 1")
    fun getWeatherByDate(date: String): LiveData<WeatherDb>

    @Query("DELETE FROM days")
    suspend fun clearAllDays()

    @Query("DELETE FROM hours")
    suspend fun clearAllHours()

    @Insert
    suspend fun insertAllDays(days: List<DayDb>)

    @Insert
    suspend fun insertAllHours(hours: List<HourDb>)
}
