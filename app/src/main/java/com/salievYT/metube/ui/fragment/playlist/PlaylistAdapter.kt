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

class PlaylistAdapter(playlistsFragment: PlaylistFragment, private val click: Click) : ListAdapter<PlaylistDto<ItemPlayList>, PlaylistAdapter.HomeViewHolder>(
    HomeDiffUtill()
) {
    class HomeViewHolder(private val binding: ItemHomeBinding) : ViewHolder(binding.root) {
        fun onBind(it: PlaylistDto<ItemPlayList>) {
            binding.textView.text = it.items?.get(0)?.snippet?.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val homeModel = getItem(position)
        holder.itemView.setOnClickListener {
            click.onClick(homeModel)
        }
        holder.onBind(homeModel)
    }

    class HomeDiffUtill : DiffUtil.ItemCallback<PlaylistDto<ItemPlayList>>() {
        override fun areItemsTheSame(
            oldItem: PlaylistDto<ItemPlayList>,
            newItem: PlaylistDto<ItemPlayList>
        ): Boolean {
            return oldItem == newItem

        }

        override fun areContentsTheSame(
            oldItem: PlaylistDto<ItemPlayList>,
            newItem: PlaylistDto<ItemPlayList>
        ): Boolean {
            return oldItem == newItem
        }
    }

    interface Click {
        fun onClick(model: PlaylistDto<ItemPlayList>)
    }
}