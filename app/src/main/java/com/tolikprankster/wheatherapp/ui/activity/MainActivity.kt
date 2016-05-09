package com.tolikprankster.wheatherapp.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.tolikprankster.wheatherapp.R
import com.tolikprankster.wheatherapp.adapter.ForecastAdapter
import com.tolikprankster.wheatherapp.extensions.applySchedulers
import com.tolikprankster.wheatherapp.model.CityForecastResponse
import com.tolikprankster.wheatherapp.model.ForeCast
import com.trello.rxlifecycle.ActivityEvent
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity() {

    private var mAdapter : ForecastAdapter? = null


    companion object{
        fun startActivity(context : Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_name)
        initList()

        mApi.getForecast("Kharkiv")
            .compose(bindUntilEvent<CityForecastResponse>(ActivityEvent.DESTROY))
                .compose(applySchedulers<CityForecastResponse>())
            .subscribe({
                mAdapter?.addItems(it.list!!)
            }, {
                it.printStackTrace()
            })

    }

    fun initList(){
        mAdapter = ForecastAdapter(ArrayList<ForeCast>())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter
    }
}
