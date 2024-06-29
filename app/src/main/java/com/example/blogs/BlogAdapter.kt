package com.example.blogs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var blogList: List<Blogs>):RecyclerView.Adapter<BlogsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_of_blogs,parent,false)
        return BlogsViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        var blogging =blogList[position]
        holder.tvHeading.text= blogging.heading
        holder.tvName.text=blogging.name
        holder.tvTitle.text=blogging.title
        holder.tvWord.text=blogging.word
        holder.tvButton.text=blogging.link
        holder.tvPublication.text=blogging.publication

    }
}

class BlogsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     var tvHeading= itemView.findViewById<TextView>(R.id.tvHeading)
    var tvName= itemView.findViewById<TextView>(R.id.tvName)
    var tvTitle= itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublication= itemView.findViewById<TextView>(R.id.tvPublication)
    var tvWord= itemView.findViewById<TextView>(R.id.tvWord)
    var tvButton= itemView.findViewById<TextView>(R.id.tvButton)
}
