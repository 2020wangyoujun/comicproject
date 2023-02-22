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
import com.example.comicsproject.kkline.bean.home.recommend.Banner_children

class HomeRecommendAdapter: RecyclerView.Adapter<HomeRecommendAdapter.MyViewHolder>() {
    var bannerChildren:MutableList<Banner_children> = ArrayList()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.home_recycler_cell,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       bannerChildren.get(position).let { bannerChildren ->
           holder.comicTitle.text=bannerChildren.title
           holder.comicIntro.text=bannerChildren.sub_title
           Glide.with(holder.itemView)
               .load(bannerChildren.image)
               .placeholder(R.drawable.cell_placeholder_gray)
               .into(holder.coverImg)

           holder.itemView.setOnClickListener { view->
               val bundle= bundleOf("title" to bannerChildren.title,"topic_id" to bannerChildren.id)
               view.findNavController().navigate(R.id.action_homeFragment_to_chapterFragment,bundle)
           }
       }
    }

    override fun getItemCount(): Int {
        return bannerChildren.size
    }

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val coverImg=itemView.findViewById<ImageView>(R.id.cover_img)
        val comicTitle=itemView.findViewById<TextView>(R.id.comic_name)
        val comicIntro=itemView.findViewById<TextView>(R.id.comic_intro)
    }
}