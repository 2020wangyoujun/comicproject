package com.example.comicsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.kkline.model.ChapterDirectoryAdapter
import com.example.comicsproject.kkline.model.SearchAdapter
import com.example.comicsproject.kkline.network.ChapterClient
import com.example.comicsproject.kkline.network.SearchClient

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        SearchClient().getService().getComicImages("50646")
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(
//                {
//                    Log.e("hhh",it.data.comic_info.images.get(0))
//                },
//                {
//                    it.printStackTrace()
//                }
//            )
//        recyclerView=findViewById(R.id.chapter_directory_recycler)
//        val searchAdapter= ChapterDirectoryAdapter(12)
//        recyclerView.apply {
//            adapter=searchAdapter
//            layoutManager=GridLayoutManager(context,4)
//        }
//        titleImg=findViewById(R.id.title_img)
//        title=findViewById(R.id.title)
//        author=findViewById(R.id.author)
//        poputation=findViewById(R.id.population)
//        likes=findViewById(R.id.likes)
//        updataDay=findViewById(R.id.updata_day)
//        RetrofitClient().getService().getHtmlDataByUrl("https://api.pingcc.cn/comic/search/title/校园/1/10")
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(
//                {
//                    Log.e("hhh","success")
//                    line2SearchAdapter.itemList=it.data
//                },
//                {
//                    it.printStackTrace()
//                }
//            )



//        val searchButton=findViewById<TextView>(R.id.search_click_tv)
//        val searchText=findViewById<TextView>(R.id.search_edit_text)
//        searchButton.setOnClickListener {
//            SearchClient().getService().searchComic("1","20",searchText.text.toString())
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                    {
//                        Log.e("hhh", "success")
////                    Log.e("hhh",it.total.toString())
//                        searchAdapter.comicList=it.hits
//                    },
//                    {
//                        it.printStackTrace()
//                    }
//                )
//        }

        //    tab_id=131&
        //    since=0&
        //    size=10&
        //    cold_boot=1
        //    &gender=0
        //    refresh_times=1
//        ChapterClient().getService().getHomePageData()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(
//                {
//                    Log.e("get a title",it.data.info_list.get(0).banner_list.get(0).title)
//                },
//                {
//                    it.printStackTrace()
//                }
//            )

    }
}