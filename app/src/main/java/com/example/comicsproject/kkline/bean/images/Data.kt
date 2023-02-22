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
data class Data(val comic_info: ComicInfo,
                val topic_info: Topic_info,
                val previous_comic_id:Int,
                val next_comic_info: NextComicInfo,
                val recommend_topics: List<RecommendTopics>,
                val source: String,
                val share_info: ShareInfo,
                val logged_in :Boolean,
                val comic_auth: String)
