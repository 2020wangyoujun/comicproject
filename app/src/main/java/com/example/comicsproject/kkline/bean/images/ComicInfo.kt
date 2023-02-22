/**
 * Copyright 2023 bejson.com
 */
package com.example.comicsproject.kkline.bean.images

/**
 * Auto-generated: 2023-01-18 19:27:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
data class ComicInfo(val id:Int,
    val title: String,
    val cover_image_url: String,
    val images: List<String>,
    val comic_images: List<ComicImages>,
    val is_pay_comic :Boolean,
    val need_vip :Boolean,
    val is_ip_block :Boolean,
    val is_sensitive :Boolean,
    val is_published :Boolean,
    val locked :Boolean,
    val locked_code:Int,
    val liked :Boolean,
    val likes_count: String,
    val likes_count_number:Int,
    val created_at: String,
    val is_danmu_hidden :Boolean,
    val is_free :Boolean,
    val is_vip_exclusive :Boolean)
