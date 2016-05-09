package com.tolikprankster.wheatherapp.inject

import com.tolikprankster.wheatherapp.ui.activity.BaseActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tolikprankster on 09.05.16.
 */
@Singleton
@Component (modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {

    fun inject(activity : BaseActivity)
}