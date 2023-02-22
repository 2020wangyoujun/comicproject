package com.example.comicsproject.kkline.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.R
import com.example.comicsproject.kkline.model.ChapterDirectoryAdapter
import com.example.comicsproject.kkline.viewmodel.KKViewModel


class ComicDetailFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var titleBg: ImageView
    private lateinit var title: TextView
    private lateinit var author: TextView
    private lateinit var population: TextView
    private lateinit var likes: TextView
    private lateinit var updataDay: TextView
    private lateinit var updataStatus:TextView

    private lateinit var chapterDirectoryAdapter: ChapterDirectoryAdapter
    private lateinit var kkViewModel: KKViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.comic_detail, container, false)
        titleBg=view.findViewById(R.id.title_img)
        title=view.findViewById(R.id.title)
        author=view.findViewById(R.id.author)
        population=view.findViewById(R.id.population)
        likes=view.findViewById(R.id.likes)
        updataDay=view.findViewById(R.id.updata_day)
        updataStatus=view.findViewById(R.id.update_status)

        title.text=arguments?.getString("title")
        author.text=arguments?.getString("author")
        population.text=arguments?.getString("population")
        likes.text=arguments?.getString("likes")

        recyclerView=view.findViewById(R.id.chapter_directory_recycler)
        chapterDirectoryAdapter= ChapterDirectoryAdapter(30)
        recyclerView.apply {
            adapter=chapterDirectoryAdapter
//            layoutManager= GridLayoutManager(context,4)
            layoutManager=LinearLayoutManager(context)
        }
        kkViewModel=ViewModelProvider(requireActivity()).get(KKViewModel::class.java)
//
        kkViewModel.chapterList.observe(requireActivity()) {chapterData->
//            Log.e("data change",chapterData.toString())
            updataDay.text = chapterData.topic_info.update_day
            updataStatus.text = chapterData.topic_info.update_status
            Glide.with(titleBg)
                .load(chapterData.topic_info.vertical_image_url)
                .into(titleBg)
            chapterDirectoryAdapter.chapterList = chapterData.comics
        }
        kkViewModel.getChapterData(arguments?.getInt("topic_id").toString())
        return view
    }

}