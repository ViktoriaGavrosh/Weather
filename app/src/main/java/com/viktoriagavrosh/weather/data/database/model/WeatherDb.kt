package com.viktoriagavrosh.weather.data.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class WeatherDb(
    @Embedded val day: DayDb,
    @Relation(
        parentColumn = "date",
        entityColumn = "date"
    ) val hours: List<HourDb>
)
