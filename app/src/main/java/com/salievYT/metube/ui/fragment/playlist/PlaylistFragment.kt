package com.salievYT.metube.ui.fragment.playlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myself223.metube.R
import com.myself223.metube.databinding.FragmentHomeBinding
import com.myself223.metube.databinding.FragmentPlaylistDetailBinding
import com.salievYT.metube.base.BaseFragment

class PlaylistFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun initialize() {

    }

}