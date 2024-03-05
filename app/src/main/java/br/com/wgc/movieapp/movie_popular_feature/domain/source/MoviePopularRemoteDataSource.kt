package br.com.wgc.movieapp.movie_popular_feature.domain.source

import br.com.wgc.movieapp.core.data.remote.response.popular.MovieResponse
import br.com.wgc.movieapp.core.paging.MoviePagingSource

interface MoviePopularRemoteDataSource {

    fun getPopularMoviePagingSource() : MoviePagingSource
    suspend fun getPopularMovies(page : Int): MovieResponse
}