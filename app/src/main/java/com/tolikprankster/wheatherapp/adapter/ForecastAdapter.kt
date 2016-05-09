package com.tolikprankster.wheatherapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tolikprankster.wheatherapp.R
import com.tolikprankster.wheatherapp.model.ForeCast
import com.tolikprankster.wheatherapp.ui.viewholder.ForecastViewHolder
import java.util.*

/**
 * Created by tolikprankster on 09.05.16.
 */
class ForecastAdapter(var forecast: MutableList<ForeCast> = ArrayList()) : RecyclerView.Adapter<ForecastViewHolder>() {

    var mLayoutInflater : LayoutInflater? = null

    override fun getItemCount(): Int = forecast.size


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ForecastViewHolder? {
        if(mLayoutInflater === null) {
            mLayoutInflater = LayoutInflater.from(parent!!.context);
        }
        return ForecastViewHolder(mLayoutInflater!!.inflate(R.layout.item_forecast, parent, false))
    }

    override fun onBindViewHolder(holder: ForecastViewHolder?, position: Int) {
        holder!!.bind(forecast[position])
    }

    fun addItems(items : List<ForeCast>){
        forecast.addAll(items)
        notifyDataSetChanged()
    }
}