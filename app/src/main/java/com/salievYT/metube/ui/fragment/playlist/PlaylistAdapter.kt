package com.salievYT.metube.ui.fragment.playlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.myself223.metube.databinding.ItemHomeBinding
import com.salievYT.metube.data.model.ItemPlayList
import com.salievYT.metube.data.model.PlaylistDto

class PlaylistAdapter : ListAdapter<ItemPlayList, PlaylistAdapter.PlaylistViewHolder >(PlaylistDiffUtill()) {
    inner class PlaylistViewHolder(private val binding: ItemHomeBinding) : ViewHolder(binding.root) {
        fun onBind(it: ItemPlayList?) {
            Glide.with(binding.root).load("https:${it?.snippet?.thumbnails?.medium?.url}").into(binding.itemPlaylistImg)
            binding.textView.text = it?.snippet?.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context) ,parent , false ))
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val modelPlaylist = getItem(position)
        holder.onBind(modelPlaylist)
    }
}

class PlaylistDiffUtill : DiffUtil.ItemCallback<ItemPlayList>() {
    override fun areItemsTheSame(oldItem: ItemPlayList, newItem:ItemPlayList): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ItemPlayList, newItem: ItemPlayList): Boolean {
        return oldItem == newItem
    }

}
