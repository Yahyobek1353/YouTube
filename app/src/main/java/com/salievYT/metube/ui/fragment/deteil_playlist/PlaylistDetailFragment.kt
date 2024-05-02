package com.salievYT.metube.ui.fragment.deteil_playlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.metube.R
import com.myself223.metube.databinding.FragmentPlaylistDetailBinding
import com.salievYT.metube.base.BaseFragment

class PlaylistDetailFragment : BaseFragment<FragmentPlaylistDetailBinding>() {
    override fun getViewBinding(): FragmentPlaylistDetailBinding = FragmentPlaylistDetailBinding.inflate(layoutInflater)

}