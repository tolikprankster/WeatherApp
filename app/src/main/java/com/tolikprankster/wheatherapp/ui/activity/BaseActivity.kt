package com.tolikprankster.wheatherapp.ui.activity

import android.os.Bundle
import com.tolikprankster.wheatherapp.WeatherApp
import com.tolikprankster.wheatherapp.web.Api
import com.trello.rxlifecycle.components.support.RxAppCompatActivity
import javax.inject.Inject

/**
 * Created by tolikprankster on 09.05.16.
 */
open class BaseActivity : RxAppCompatActivity(){

    @Inject
    protected lateinit var mApi : Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WeatherApp.appComponent.inject(this)
    }

}