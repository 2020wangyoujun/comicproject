package com.example.comicsproject.kkline.bean.chapter

data class ChapterTopicInfo(
    val id:Int,
    val title:String,
    val description:String,
    val discover_image_url:String,
    val cover_image_url:String,
    val vertical_image_url:String,
    val male_cover_image_url:String,
    val male_vertical_image_url:String,
    val comics_count:Int,
    val status:String,
    val update_status:String,
    val update_status_code:Int,
    val created_at:Long,
    val updated_at:Long,
    val update_remind:String,
    val update_day:String,
    val label_id:Int,
    val order:Int,
    )
