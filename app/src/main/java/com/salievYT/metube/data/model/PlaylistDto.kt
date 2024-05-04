package com.salievYT.metube.data.model

import com.google.gson.annotations.SerializedName


data class PlaylistDto<T>(
    val kind : String? = null,
    @SerializedName("etag")
    val tag : String? = null,
    val nextPageToken : String? = null,
    val prevPageToken : String? = null,
    val pageInfo : PageInfoDto? = null,
    val items : List<T>? = null
)

data class ItemPlayList (
    val kind : String? = null,
    val etag : String? = null,
    val id : String? = null,
    val snippet : Snippet? = null,
    val contentDetails : String? = null,

)


data class Snippet (
    val publishedAt : String? = null,
    val channelId : String? = null,
    val title : String? = null,
    val description : String? = null,
    val thumbnails : Thumbnails? = null,

)

data class Thumbnails (
    val default : DefaultThumb? = null,
    val medium : Medium? = null,
)

data class Medium (
    val url : String? = null,
    val width: Int? = null,
    val height: Int? = null,
)

data class DefaultThumb (
    val url : String? = null,
    val width: Int? = null,
    val height: Int? = null,
)

