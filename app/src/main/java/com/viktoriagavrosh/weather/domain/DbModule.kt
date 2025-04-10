package com.viktoriagavrosh.weather.domain

import android.content.Context
import com.viktoriagavrosh.weather.data.database.WeatherDatabase
import com.viktoriagavrosh.weather.data.database.getDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object DbModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext
        context: Context
    ): WeatherDatabase {
        return getDatabase(context = context)
    }
}
