package com.tolikprankster.wheatherapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("org.jsonschema2pojo")
data class Wind (

    @SerializedName("speed")
    @Expose
    var speed: Double? = null,

    @SerializedName("deg")
    @Expose
    var deg: Double? = null

)
