package com.example.comicsproject.kkline.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.R

class ComicViewerAdapter: RecyclerView.Adapter<ComicViewerAdapter.MyViewHolder>() {
    var imgUrlList:List<String> = ArrayList()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comics_viewer_cell,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        imgUrlList.get(position).let {
            Glide.with(holder.itemView)
                .load(it)
                .placeholder(R.drawable.cell_placeholder_gray)
                .into(holder.comicImg)
        }
    }

    override fun getItemCount(): Int {
        return imgUrlList.size
    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val comicImg=itemView.findViewById<ImageView>(R.id.comic_img)
    }
}