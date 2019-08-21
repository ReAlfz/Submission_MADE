package com.realfz.submission

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterGame(val list : ArrayList<Gem>) : RecyclerView.Adapter<AdapterGame.ListViewHolder>() {

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.nama)
        var tvFrom : TextView = itemView.findViewById(R.id.froms)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_photo )
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup, i: Int): ListViewHolder {
        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.game, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, from, photo) = list[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvFrom.text = from
    }
}