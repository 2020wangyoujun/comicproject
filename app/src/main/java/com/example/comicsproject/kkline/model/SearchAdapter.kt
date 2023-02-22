package com.example.comicsproject.kkline.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.R
import com.example.comicsproject.kkline.bean.ComicInfo

class SearchAdapter: RecyclerView.Adapter<SearchAdapter.MyViewHolder>() {
    var comicList:List<ComicInfo>? = null
    set(value) {
        field=value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kk_search_cell,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       comicList?.get(position)?.let {
           Glide.with(holder.itemView)
               .load(it.vertical_image_url)
               .placeholder(R.drawable.cell_placeholder_gray)
               .into(holder.coverImg)

           holder.title.text=it.title
           holder.author.text=it.author_name

           holder.itemView.setOnClickListener { view->
               val bundle= bundleOf("title" to it.title,"author" to it.author_name,
                   "population" to it.popularity.toString(),"likes" to it.favourite_count.toString(),"topic_id" to it.id)
               view.findNavController().navigate(R.id.action_searchFragment_to_chapterFragment,bundle)
           }
       }
    }

    override fun getItemCount(): Int {
        return comicList?.size?:0
    }

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        val coverImg = itemView.findViewById<ImageView>(R.id.cover_img)
        val title = itemView.findViewById<TextView>(R.id.title)
        val author = itemView.findViewById<TextView>(R.id.author)
    }
}