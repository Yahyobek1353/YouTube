package com.salievYT.metube.ui.fragment.playlist

import com.myself223.metube.databinding.FragmentHomeBinding
import com.salievYT.metube.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
    private val adapter : PlaylistAdapter by lazy {
        PlaylistAdapter()
    }
    private val viewModel: PlaylistViewModel by viewModel()


    override fun constructListeners() {

    }

    override fun initialize() {
        viewModel.getPlaylist()
        binding.recyclerHome.adapter = adapter
    }
    override fun launchObserver() {
        viewModel.liveData.observe(viewLifecycleOwner) {
            adapter.submitList(it.items)
        }
    }

}