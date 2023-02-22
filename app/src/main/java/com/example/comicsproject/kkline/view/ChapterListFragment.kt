package com.example.comicsproject.kkline.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comicsproject.R
import com.example.comicsproject.kkline.model.ChapterDirectoryAdapter
import com.example.comicsproject.kkline.viewmodel.KKViewModel

class ChapterListFragment:Fragment() {
    private lateinit var recyclerView:RecyclerView
    private lateinit var updataStatus: TextView

    private lateinit var kkViewModel: KKViewModel
    private lateinit var chapterAdapter:ChapterDirectoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.chapter_directory_layout, container, false)
        recyclerView=view.findViewById(R.id.chapter_directory_recycler)
        updataStatus=view.findViewById(R.id.update_status)

        chapterAdapter= ChapterDirectoryAdapter(-1)
        recyclerView.apply {
            adapter=chapterAdapter
            layoutManager=GridLayoutManager(requireContext(),4)
        }
        kkViewModel=ViewModelProvider(requireActivity()).get(KKViewModel::class.java)
        kkViewModel.chapterList.observe(requireActivity()){ data->
            chapterAdapter.chapterList=data.comics
            updataStatus.text = data.topic_info.update_status
        }
        return view
    }
}