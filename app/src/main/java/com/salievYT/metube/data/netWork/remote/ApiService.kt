package com.salievYT.metube.data.netWork.remote

import com.myself223.metube.BuildConfig.API_KEY
import com.myself223.metube.BuildConfig.CHANEL_ID
import com.salievYT.metube.data.model.ItemPlayList
import com.salievYT.metube.data.model.PlaylistDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.Serializable

interface ApiService {

    @GET("playlists")
    fun getPlaylist(
        @Query("key") apiKey: String = API_KEY,
        @Query("part") part: String = PART,
        @Query("channelId") channelId: String = CHANEL_ID,
        @Query("maxResults") max: Int = MAX_RESULT
    ): Call<PlaylistDto<ItemPlayList>>

    companion object{
        const val PART = "snippet , contentDetails"
        const val MAX_RESULT = 50
    }
}
