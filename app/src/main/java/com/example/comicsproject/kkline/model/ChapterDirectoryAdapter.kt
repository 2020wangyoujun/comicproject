package com.example.comicsproject.kkline.model

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.comicsproject.R
import com.example.comicsproject.kkline.bean.chapter.ComicChapterInfo

class ChapterDirectoryAdapter(private val maxSize:Int): RecyclerView.Adapter<ChapterDirectoryAdapter.MyViewHolder>() {
    var chapterList:List<ComicChapterInfo>?=null
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chapter_directory_cell,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        resetViewHolder(holder)

        if(maxSize==-1 || position<maxSize-1){
            chapterList?.get(position)?.let {
                holder.chapterName.text=it.title

                holder.itemView.setOnClickListener { view->
                    val bundle= bundleOf("chapter_id" to it.id.toString())
                    val navController=view.findNavController()
                    if(maxSize==-1){
                        navController.navigate(R.id.action_directoryFragment_to_comicViewerFragment,bundle)
                    }else{
                        navController.navigate(R.id.action_chapterFragment_to_comicViewerFragment,bundle)
                    }
                }
            }
        }else if(position==maxSize-1){
            holder.chapterName.gravity=Gravity.CENTER
            holder.chapterName.text="..."
            holder.itemView.setOnClickListener { view->
                view.findNavController().navigate(R.id.action_chapterFragment_to_directoryFragment)
            }
        }
    }

    override fun getItemCount(): Int {
        if(maxSize==-1)
            return chapterList?.size?:0
        return (chapterList?.size?:0).let {
            if(it>maxSize) maxSize else it
        }
    }

    private fun resetViewHolder(holder:MyViewHolder){
        holder.chapterName.gravity=Gravity.NO_GRAVITY
        holder.itemView.setOnClickListener(null)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val chapterName = itemView.findViewById<TextView>(R.id.chapter_name)
    }
}