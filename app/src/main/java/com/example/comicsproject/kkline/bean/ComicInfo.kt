package com.example.comicsproject.kkline.bean

data class ComicInfo(val id:Int,
                     val topic_id:Int,
                     val title:String,
                     val vertical_image_url:String,
                     val cover_image_url:String,
                     val is_favourite:Boolean,
                     val favourite:Boolean,
                     val category:List<String>,
                     val likes_count:Long,
                     val comments_count:Long,
                     val favourite_count:Long,
                     val comics_count:Int,
                     val first_comic_publish_time:String,
                     val author_name:String,
                     val popularity:Long,
                     val latest_comic_title:String,
                     val is_free:Boolean,
                    )

