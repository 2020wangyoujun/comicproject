package com.example.comicsproject.line1.network

import io.reactivex.rxjava3.core.Flowable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface RetrofitNetwork {

    @Headers(
        "Host: mh5.zhyfkj.com:33443","Connection: keep-alive",
        "Upgrade-Insecure-Requests: 1",
        "User-Agent: Mozilla/5.0 (Linux; Android 8.1.0; Nexus 6P Build/OPM7.181205.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/107.0.5304.141 Mobile Safari/537.36 Html5Plus/1.0 (Immersed/24.0)",
        "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        "X-Requested-With: w2a.W2Amh5.zhyfkj.com",
        "Sec-Fetch-Site: none",
        "Sec-Fetch-Mode: navigate",
        "Sec-Fetch-User: ?1",
        "Sec-Fetch-Dest: document",
        "Accept-Encoding: deflate",
        "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7"
        )
    @GET
    fun getHtmlDataByUrl(@Url url:String):Flowable<ResponseBody>

}