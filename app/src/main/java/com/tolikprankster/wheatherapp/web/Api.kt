package com.tolikprankster.wheatherapp.web

import com.tolikprankster.wheatherapp.model.CityForecastResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by tolikprankster on 09.05.16.
 */
interface Api {

    companion object {
        val WEATHER_IMAGE_URL = "http://openweathermap.org/img/w/"
    }

    @GET("/data/2.5/forecast")
    fun getForecast(@Query("q") text : String) : Observable<CityForecastResponse>
}