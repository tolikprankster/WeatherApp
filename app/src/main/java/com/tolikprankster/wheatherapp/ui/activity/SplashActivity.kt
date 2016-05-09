package com.tolikprankster.wheatherapp.ui.activity


import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import com.tolikprankster.wheatherapp.R
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.textResource
import org.jetbrains.anko.textView

/**
 * Created by tolikprankster on 09.05.16.
 */
class SplashActivity : BaseActivity(){


    private val DELAY = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frameLayout {
            textView(){
                textResource = R.string.app_name
                gravity = Gravity.CENTER
            }
        }
        Handler().postDelayed({ MainActivity.startActivity(this)}, DELAY)
    }
}