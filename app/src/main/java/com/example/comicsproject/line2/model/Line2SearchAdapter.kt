package com.example.comicsproject.line2.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.R
import com.example.comicsproject.line2.bean.ComicInfo

class Line2SearchAdapter: RecyclerView.Adapter<Line2SearchAdapter.MyViewHolder>() {

    var itemList:List<ComicInfo>?=null
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.line2_search_cell,parent,false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        itemList?.get(position)?.let {
            Glide.with(holder.itemView)
                .load(it.cover)
                .placeholder(R.drawable.cell_placeholder_gray)
                .into(holder.imageView)
            holder.title.text = it.title
            holder.author.text = it.author
        }
    }

    override fun getItemCount(): Int {
        return itemList?.size?:0
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView=itemView.findViewById<ImageView>(R.id.cover)
        val title=itemView.findViewById<TextView>(R.id.title)
        val author=itemView.findViewById<TextView>(R.id.author)
    }
}