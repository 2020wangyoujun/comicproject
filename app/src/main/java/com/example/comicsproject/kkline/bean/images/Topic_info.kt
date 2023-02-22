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
data class Topic_info(
    var id:Int,
    var cover_image_url: String,
    var vertical_image_url: String,
    var square_image_url: String,
    var title: String,
    var description: String,
    var tags: List<String>,
    var user: User,
    var signing_status: String,
    var is_free :Boolean,
    var update_remind: String,
    var is_favourite :Boolean)
