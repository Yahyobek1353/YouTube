package com.salievYT.metube.ui.fragment.playlist

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.myself223.metube.R
import com.myself223.metube.databinding.FragmentHomeBinding
import com.salievYT.metube.base.BaseFragment
import com.salievYT.metube.data.model.ItemPlayList
import com.salievYT.metube.data.model.PlaylistDto
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistsFragment : BaseFragment<FragmentHomeBinding>(), PlaylistAdapter.Click {
    private lateinit var adapter: PlaylistAdapter
    private val viewModel: PlaylistViewModel by viewModel()
    private var playlists = 10

    override fun initialize() {
        adapter = PlaylistAdapter(this, this)
        binding.recyclerHome.adapter = adapter

    }

    override fun launchObserver() {
        viewModel.getPlaylist()
        viewModel.getPlaylist().observe(viewLifecycleOwner) { resourse ->
            adapter.submitList(resourse.items?.get(0)?.snippet.title)
        }
    }

    override fun getViewBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }





    override fun onClick(model: PlaylistDto<ItemPlayList>) {
        findNavController().navigate(R.id.videoFragment)
    }
}