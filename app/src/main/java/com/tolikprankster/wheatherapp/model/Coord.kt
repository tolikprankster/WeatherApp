package com.tolikprankster.wheatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("org.jsonschema2pojo")
data class Coord (


    @SerializedName("lon")
    @Expose
    var lon: Double? = null,

    @SerializedName("lat")
    @Expose
    var lat: Double? = null

)
