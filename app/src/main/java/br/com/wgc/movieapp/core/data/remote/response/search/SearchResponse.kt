package br.com.wgc.movieapp.core.data.remote.response.search

import br.com.wgc.movieapp.core.data.remote.model.search.SearchResult
import com.google.gson.annotations.SerializedName


data class SearchResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<SearchResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)