package com.example.comicsproject.kkline.model


import com.example.comicsproject.kkline.bean.chapter.ChapterResponse
import com.example.comicsproject.kkline.network.ChapterClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class ChapterDataModel {
    companion object{
        fun getChapterData(topic_id:String,sort:String="1",sort_action:String="1",successCallBack:(response:ChapterResponse)->Unit){
            ChapterClient().getService().getComicChapters(topic_id,sort,sort_action)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    successCallBack
                ) {
                    it.printStackTrace()
                }
        }
    }
}