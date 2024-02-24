package br.com.wgc.movieapp.core.data.remote

import br.com.wgc.movieapp.core.data.remote.response.detail.MovieDetailResponse
import br.com.wgc.movieapp.core.data.remote.response.popular.MovieResponse
import br.com.wgc.movieapp.core.data.remote.response.search.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("page") page: Int,
    ): MovieResponse

    @GET("search/multi")
    suspend fun searchMovie(
        @Query("page") page: Int,
        @Query("query") query: String,
    ): SearchResponse

    @GET("movie/{movie_id}")
    suspend fun getMovie(
        @Path("movie_id") movieId: Int,
    ): MovieDetailResponse

    @GET("")
    suspend fun getMoviesAlternative(
        @Path("movie_id") movieId: Int,
        @Query("page") page: Int,
    ): MovieResponse
}