package com.example.comicsproject.kkline.bean

data class SearchResponse(val code:Int,
                          val message:String,
                          val request_id:String,
                          val total:Int,
                          val hits:List<ComicInfo>
                          )
