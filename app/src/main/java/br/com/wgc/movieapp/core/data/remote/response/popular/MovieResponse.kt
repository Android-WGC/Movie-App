package br.com.wgc.movieapp.core.data.remote.response.popular


import br.com.wgc.movieapp.core.data.remote.model.popular.MovieResult
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)