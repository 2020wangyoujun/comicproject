package com.example.comicsproject.kkline.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comicsproject.R
import com.example.comicsproject.kkline.model.SearchAdapter
import com.example.comicsproject.kkline.network.SearchClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class SearchFragment : Fragment() {
    private lateinit var recyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.main_content_line2, container, false)
        recyclerView=view.findViewById(R.id.recyclerView)
        val searchAdapter=SearchAdapter()
        recyclerView.apply {
            adapter=searchAdapter
            layoutManager=LinearLayoutManager(requireContext())
        }
        val searchButton=view.findViewById<TextView>(R.id.search_click_tv)
        val searchText=view.findViewById<TextView>(R.id.search_edit_text)
        searchButton.setOnClickListener {
            SearchClient().getService().searchComic("1","20",searchText.text.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        Log.e("hhh", "search success")
//                    Log.e("hhh",it.total.toString())
                        searchAdapter.comicList=it.hits
                    },
                    {
                        it.printStackTrace()
                    }
                )
        }
        return view
    }

}