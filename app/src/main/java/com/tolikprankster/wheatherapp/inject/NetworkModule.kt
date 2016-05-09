package com.tolikprankster.wheatherapp.inject

import com.tolikprankster.wheatherapp.BuildConfig
import com.tolikprankster.wheatherapp.Constants
import com.tolikprankster.wheatherapp.web.Api
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by tolikprankster on 10.05.16.
 */
@Module
class NetworkModule{

    val TIME_OUT_SEC = 60L

    @Provides
    @Singleton
    fun provideApi(client : OkHttpClient): Api {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build()
                .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideCLient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        okHttpClientBuilder.readTimeout(TIME_OUT_SEC, TimeUnit.SECONDS)
                .connectTimeout(TIME_OUT_SEC, TimeUnit.SECONDS)
                .addInterceptor {
                    var request : Request = it.request()
                    var url = request.url().newBuilder()
                            .addQueryParameter("mode","json")
                            .addQueryParameter("APPID", Constants.WHEATHER_APP_ID)
                            .build();
                    request = request.newBuilder().url(url).build();
                    it.proceed(request);

                }
        return okHttpClientBuilder.build()
    }
}