package com.example.comicsproject.kkline.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ChapterClient {
    val urlString = "https://api.kkmh.com/"
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(urlString)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService():ChapterNetwork{
        return getRetrofit().create(ChapterNetwork::class.java)
    }
}