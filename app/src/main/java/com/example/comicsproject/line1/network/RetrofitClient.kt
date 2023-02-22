package com.example.comicsproject.line1.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory

class RetrofitClient {
    val urlString = "https://mh5.zhyfkj.com:33443/"
    fun getRetrofit():Retrofit{
       return Retrofit.Builder().baseUrl(urlString)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
    fun getService():RetrofitNetwork{
        return getRetrofit().create(RetrofitNetwork::class.java)
    }
}