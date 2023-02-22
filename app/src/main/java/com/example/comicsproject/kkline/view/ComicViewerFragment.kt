package com.example.comicsproject.kkline.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comicsproject.R
import com.example.comicsproject.kkline.model.ComicViewerAdapter
import com.example.comicsproject.kkline.viewmodel.KKViewModel

class ComicViewerFragment:Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var comicViewerAdapter: ComicViewerAdapter
    private lateinit var kkViewModel: KKViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.comics_viewer, container, false)
        recyclerView=view.findViewById(R.id.comics_viewer_recycler)
        comicViewerAdapter= ComicViewerAdapter()
        recyclerView.apply {
            adapter=comicViewerAdapter
            layoutManager=LinearLayoutManager(requireContext())
        }
        kkViewModel=ViewModelProvider(requireActivity()).get(KKViewModel::class.java)

        kkViewModel.imageUrlList.observe(requireActivity()){
            comicViewerAdapter.imgUrlList=it
        }
        kkViewModel.getImageUrl(arguments?.getString("chapter_id").toString())
        return view
    }
}