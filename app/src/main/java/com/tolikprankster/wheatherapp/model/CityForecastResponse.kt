package com.tolikprankster.wheatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CityForecastResponse (

    @SerializedName("city")
    @Expose
    var city: City? = null,

    @SerializedName("list")
    @Expose
    var list: List<ForeCast>? = null,

    @SerializedName("cod")
    @Expose
    var cod: String? = null,

    @SerializedName("message")
    @Expose
    var message: Double? = null,

    @SerializedName("cnt")
    @Expose
    var cnt: Int? = null
)
