package com.tolikprankster.wheatherapp

import android.content.Context
import android.content.Intent
import android.os.Bundle

class MainActivity : BaseActivity() {

    companion object{
        fun startActivity(context : Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_name)
    }
}
