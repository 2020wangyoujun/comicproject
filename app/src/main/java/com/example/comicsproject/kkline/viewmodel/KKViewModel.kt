package com.example.comicsproject.kkline.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.comicsproject.kkline.bean.chapter.ChapterData
import com.example.comicsproject.kkline.model.ChapterDataModel
import com.example.comicsproject.kkline.network.SearchClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class KKViewModel(application: Application) : AndroidViewModel(application) {

    val chapterList=MutableLiveData<ChapterData>()

    val imageUrlList=MutableLiveData<List<String>>()

    fun getChapterData(topic_id:String){
        ChapterDataModel.getChapterData(topic_id = topic_id.toString(), successCallBack =
        { response ->
            Log.e("viewModel","get chapter success")
            chapterList.value=response.data
        })
    }

    fun getImageUrl(chapter_id:String){
        SearchClient().getService().getComicImages(chapter_id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Log.e("viewModel","get images url success!")
                    imageUrlList.value=it.data.comic_info.images
                },
                {
                    it.printStackTrace()
                }
            )
    }
}