package com.salievYT.metube.ui.fragment.video

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.metube.R
import com.myself223.metube.databinding.FragmentVideoBinding
import com.salievYT.metube.base.BaseFragment

class VideoFragment : BaseFragment<FragmentVideoBinding>() {
    override fun getViewBinding(): FragmentVideoBinding = FragmentVideoBinding.inflate(layoutInflater)

}