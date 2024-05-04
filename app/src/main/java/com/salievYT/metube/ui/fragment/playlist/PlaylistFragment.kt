package com.salievYT.metube.ui.fragment.playlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.myself223.metube.R
import com.myself223.metube.databinding.FragmentHomeBinding
import com.myself223.metube.databinding.FragmentPlaylistDetailBinding
import com.salievYT.metube.base.BaseFragment

class PlaylistFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
    private val adapter : PlaylistAdapter by lazy {
        PlaylistAdapter()
    }
    private val viewModel: PlaylistViewModel by lazy { ViewModelProvider(requireActivity())[PlaylistViewModel::class.java] }


    override fun constructListeners() {

    }

    override fun initialize() {
        binding.recyclerHome.adapter = adapter
        viewModel.getPlaylist()
    }
    override fun launchObserver() {
        viewModel.liveData.observe(requireActivity()) {
            viewModel.getPlaylist()
            adapter.submitList(it.items)

        }
    }

}