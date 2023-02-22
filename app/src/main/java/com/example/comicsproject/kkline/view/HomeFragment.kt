package com.example.comicsproject.kkline.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comicsproject.R
import com.example.comicsproject.kkline.bean.home.Banner_list
import com.example.comicsproject.kkline.model.HomeRecommendAdapter
import com.example.comicsproject.kkline.model.banner.BannerAdapter
import com.example.comicsproject.kkline.network.ChapterClient
import com.youth.banner.Banner
import com.youth.banner.indicator.CircleIndicator
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class HomeFragment :Fragment(){
    private lateinit var banner: Banner<Banner_list, BannerAdapter>
    private lateinit var recommendTitle:TextView
    private lateinit var recommendRecyclerView:RecyclerView
    private lateinit var ivSearch:ImageView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.home_page,container,false)
        banner = view.findViewById(R.id.banner)
        recommendTitle=view.findViewById(R.id.recommend_title)
        recommendRecyclerView=view.findViewById(R.id.recycler_recommend)
        val homeRecommendAdapter=HomeRecommendAdapter()
        recommendRecyclerView.apply {
            adapter=homeRecommendAdapter
            layoutManager=GridLayoutManager(context,3)
        }

        ChapterClient().getService().getHomePageData("159")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Log.e("get a title",it.data.info_list.get(2).banner_list.get(0).banner_children.get(0).title)
                    banner.setAdapter(
                        BannerAdapter(
                            it.data.info_list.get(0).banner_list
                        )
                    )
                        .addBannerLifecycleObserver(requireActivity())//添加生命周期观察者
                        .setIndicator(CircleIndicator(context))

                    recommendTitle.text=it.data.info_list.get(2).banner_list.get(0).title
                    homeRecommendAdapter.bannerChildren=it.data.info_list.get(2).banner_list.get(0).banner_children
                },
                {
                    it.printStackTrace()
                }
            )

        ivSearch=view.findViewById(R.id.iv_search)
        ivSearch.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
        }
        return view
    }
}