package com.viktoriagavrosh.weather.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "days")
data class DayDb(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "temp_c") val tempC: String,
    @ColumnInfo(name = "temp_f") val tempF: String,
    @ColumnInfo(name = "text") val weatherText: String,
    @ColumnInfo(name = "icon") val icon: String,
    @ColumnInfo(name = "wind_mph") val windMph: String,
    @ColumnInfo(name = "wind_kph") val windKph: String,
    @ColumnInfo(name = "precip_mm") val precipMm: String,
    @ColumnInfo(name = "precip_in") val precipIn: String,
    @ColumnInfo(name = "feelslike_c") val feelsLikeC: String? = null,
    @ColumnInfo(name = "feelslike_f") val feelsLikeF: String? = null,
)
