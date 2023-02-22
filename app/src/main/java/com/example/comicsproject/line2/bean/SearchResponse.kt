package com.example.comicsproject.line2.bean

data class SearchResponse( val msg:String,
val code:Int,
val count:Int,
val data:List<ComicInfo>)
