package br.com.wgc.movieapp.movie_popular_feature.data.source

import br.com.wgc.movieapp.core.data.remote.MovieService
import br.com.wgc.movieapp.core.data.remote.response.popular.MovieResponse
import br.com.wgc.movieapp.core.paging.MoviePagingSource
import br.com.wgc.movieapp.movie_popular_feature.domain.source.MoviePopularRemoteDataSource
import javax.inject.Inject

class MoviePopularRemoteDataSourceImpl @Inject constructor(
    private val service: MovieService
) : MoviePopularRemoteDataSource {
    override fun getPopularMoviePagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovie(page = page)
    }
}