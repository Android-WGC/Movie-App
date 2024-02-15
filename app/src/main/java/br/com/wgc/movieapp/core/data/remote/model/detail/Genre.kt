package br.com.wgc.movieapp.core.data.remote.model.detail


import com.google.gson.annotations.SerializedName
data class Genre(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)