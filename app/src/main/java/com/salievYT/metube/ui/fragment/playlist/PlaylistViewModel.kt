package com.salievYT.metube.ui.fragment.playlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salievYT.metube.data.model.ItemPlayList
import com.salievYT.metube.data.model.PlaylistDto
import com.salievYT.metube.data.netWork.repository.YoutubeRepository
import javax.inject.Inject

class PlaylistViewModel (
    private val repository: YoutubeRepository
)   : ViewModel(){


    private var _liveData = MutableLiveData<PlaylistDto<ItemPlayList>>()
    val liveData get() = _liveData

    fun getPlaylist(){
        _liveData = repository.getPlayList() as MutableLiveData<PlaylistDto<ItemPlayList>>
    }
}