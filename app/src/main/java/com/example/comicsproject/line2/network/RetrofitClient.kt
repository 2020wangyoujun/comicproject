package com.example.comicsproject.line2.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    val urlString = "https://api.pingcc.cn/comic/"
    fun getRetrofit():Retrofit{
       return Retrofit.Builder().baseUrl(urlString)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService():RetrofitNetwork{
        return getRetrofit().create(RetrofitNetwork::class.java)
    }
}