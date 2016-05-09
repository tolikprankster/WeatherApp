package com.tolikprankster.wheatherapp.extensions

import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 * Created by tolikprankster on 10.05.16.
 */

fun <T> applySchedulers() = Observable.Transformer<T, T> {
    it.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}


