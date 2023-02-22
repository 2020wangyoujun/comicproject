package com.example.comicsproject.kkline.network

import com.example.comicsproject.kkline.bean.chapter.ChapterResponse
import com.example.comicsproject.kkline.bean.home.HomePageResponse
import io.reactivex.rxjava3.core.Flowable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ChapterNetwork {

    @GET("v2/topic/topic_catalogue/list")
    fun getComicChapters(@Query("topic_id") topic_id:String,@Query("sort") sort:String,@Query("sort_action") sort_action:String):Flowable<ChapterResponse>


//    https://api.kkmh.com/v2/topic/discovery_v2/list?
    //    tab_id=131&
    //    since=0&
    //    size=10&
    //    cold_boot=1
    //    &gender=0
    //    &recommend_type=&
    //    extra_info=%7B%7D&
    //    refresh_times=1

    @Headers(
        "cookie: Expires=Tue, 10-Jan-2023 17:35:40 GMT;Max-Age=86400;kk_s_t=1673365511166;Domain=.kkmh.com;Path=/",
        "x-device: A:222cdf624ba7c1ec",
        "user-agent: Kuaikan/7.34.0/734000(Android;8.1.0;Nexus 6P;kuaikan17;WIFI;2392*1440)",
        "muid: c9091a1445095cd97e1dc947d85021b8",
        "kkdid: A20230110013809458411621967818804",
        "package-id: com.kuaikan.comic",
        "lower-flow: No",
        "kkflowtype: NotFree",
        "accept-encoding: deflate",
        "app-info: eyJLS0RJRCI6IkEyMDIzMDExMDAxMzgwOTQ1ODQxMTYyMTk2NzgxODgwNCIsImFlZ2lzX2FwcF9pZCI6IjEwMDAwMDE0MDQiLCJhbmRyb2lkX2lkIjoiMjIyY2RmNjI0YmE3YzFlYyIsImFwcF9zZWNyZXRfc2lnbiI6ImNiNjkxYjRjOTgyNTExYWY3MTcyZDk5N2NlMTY3OGYxIiwiYmQiOiJIdWF3ZWkiLCJjYSI6MCwiY3QiOjIwLCJkZXZ0IjoxLCJkcGkiOjU2MCwiZ2VuZGVyIjowLCJoZWlnaHQiOjIzOTIsImltZWkiOiI4Njc5ODIwMjE5NzU3ODUiLCJra19jX3QiOjE2NzMzNjU1MTM0NjksImtrX3NfdCI6MTY3MzM2NTUxMTE2NiwibWFjIjoiZGM6ZDk6MTY6ZmM6Zjc6YTgiLCJtb2RlbCI6Ik5leHVzIDZQIiwib2FpZCI6IiIsIm92IjoiOC4xLjAiLCJ1c2VyX2dyb3VwIjoibm9ybWFsIiwidmlzaXRvcl9zaWduIjoiN2JjN2U5MTM5NDMwYTNlMGI4YzFlNWY2YmJhZTZmZGYiLCJ3aWR0aCI6MTQ0MH0="
    )

    @GET("v2/topic/discovery_v2/list")
    fun getHomePageData(@Query("tab_id") tab_id:String="131",
                        @Query("since") since:String="0",
                        @Query("size") size:String="10",
                        @Query("cold_boot") cold_boot:String="1",
                        @Query("gender") gender:String="0",
                        @Query("recommend_type=") recommend_type:String="",
                        @Query("extra_info=") extra_info:String="{}",
                        @Query("refresh_times") refresh_times:String="1"):Flowable<HomePageResponse>
}