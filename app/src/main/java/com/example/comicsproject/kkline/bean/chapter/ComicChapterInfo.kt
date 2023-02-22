package com.example.comicsproject.kkline.bean.chapter



data class ComicChapterInfo(
    val id:Int,
    val title:String,
    val cover_image_url:String,
    val no_word_cover_image_url:String,
    val storyboard_cnt:Int,
    val serial_no:Int,
    val status:String,
    val zoomable:Int,
    val comic_type:Int,
    val created_at:Long,
    val updated_at:Long,
    val comic_property:Int,
    val likes_count:Long,
    val image_count:Int,
    val show_storyboard:Boolean,
    val has_read:Boolean,
    val read_count:Int,
    val pay_info: ChapterPayInfo,
    val is_liked:Boolean,
    val is_show_new:Boolean,
                            )

