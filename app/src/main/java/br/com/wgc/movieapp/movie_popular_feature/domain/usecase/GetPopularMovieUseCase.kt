package br.com.wgc.movieapp.movie_popular_feature.domain.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wgc.movieapp.core.domain.model.Movie
import br.com.wgc.movieapp.movie_popular_feature.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPopularMovieUseCase {
    suspend operator fun invoke() : Flow<PagingData<Movie>>
}

class GetPopularMovieUseCaseImpl @Inject constructor(
    private val moviePopularRepository: MoviePopularRepository
): GetPopularMovieUseCase {
    override suspend fun invoke(): Flow<PagingData<Movie>> {
        return moviePopularRepository.getPopularMovies(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }
}