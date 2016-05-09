package com.tolikprankster.wheatherapp

import android.app.Application
import com.tolikprankster.wheatherapp.inject.AppComponent
import com.tolikprankster.wheatherapp.inject.AppModule
import com.tolikprankster.wheatherapp.inject.DaggerAppComponent
import com.tolikprankster.wheatherapp.inject.NetworkModule

/**
 * Created by tolikprankster on 09.05.16.
 */
class WeatherApp : Application(){

    companion object {
        lateinit var instance: Application
            private set
        lateinit var appComponent: AppComponent
            private set
    }



    override fun onCreate() {
        super.onCreate()
        val c : AutoCloseable
        instance = this
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()


    }
}