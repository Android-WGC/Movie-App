package br.com.wgc.movieapp.movie_popular_feature.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wgc.movieapp.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviePopularRepository {
    suspend fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}