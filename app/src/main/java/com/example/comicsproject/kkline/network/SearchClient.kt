package com.example.comicsproject.kkline.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SearchClient {
    val urlString = "http://m.kuaikanmanhua.com/"
    fun getRetrofit():Retrofit{
       return Retrofit.Builder().baseUrl(urlString)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService():SearchNetwork{
        return getRetrofit().create(SearchNetwork::class.java)
    }


}