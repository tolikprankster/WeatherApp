package com.tolikprankster.wheatherapp.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.tolikprankster.wheatherapp.model.ForeCast
import kotlinx.android.synthetic.main.item_forecast.view.*

/**
 * Created by tolikprankster on 09.05.16.
 */
class ForecastViewHolder(val view : View)  : RecyclerView.ViewHolder(view){

    fun bind(item: ForeCast) {
        itemView.tv_date.text = item.dtTxt
        itemView.tv_temperature.text = item.main?.temp.toString()
        itemView.tv_wind_speed.text = item.wind?.speed.toString()
    }
}