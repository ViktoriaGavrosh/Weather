package com.viktoriagavrosh.weather.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hours")
data class HourDb(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "time") val time: String,
    @ColumnInfo(name = "temp_c") val tempC: String,
    @ColumnInfo(name = "temp_f") val tempF: String,
    @ColumnInfo(name = "text") val weatherText: String,
    @ColumnInfo(name = "icon") val icon: String,
)
