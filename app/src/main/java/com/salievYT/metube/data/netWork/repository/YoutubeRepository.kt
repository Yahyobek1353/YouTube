package com.salievYT.metube.data.netWork.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.salievYT.metube.data.model.ItemPlayList
import com.salievYT.metube.data.model.PlaylistDto
import com.salievYT.metube.data.netWork.remote.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class YoutubeRepository(private val apiService: ApiService) {
     fun getPlayList(): LiveData<PlaylistDto<ItemPlayList>>{
        val liveData = MutableLiveData<PlaylistDto<ItemPlayList>>()
        apiService.getPlaylist().enqueue(object  : Callback<PlaylistDto<ItemPlayList>>{
            override fun onResponse(
                call: Call<PlaylistDto<ItemPlayList>>,
                response: Response<PlaylistDto<ItemPlayList>>
            ) {
                if (response.isSuccessful){
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<PlaylistDto<ItemPlayList>>, t: Throwable) {

            }

        })
        return liveData
    }
}