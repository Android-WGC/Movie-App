package br.com.wgc.movieapp.movie_popular_feature.di

import br.com.wgc.movieapp.core.data.remote.MovieService
import br.com.wgc.movieapp.movie_popular_feature.data.repository.MoviePopularRepositoryImpl
import br.com.wgc.movieapp.movie_popular_feature.data.source.MoviePopularRemoteDataSourceImpl
import br.com.wgc.movieapp.movie_popular_feature.domain.repository.MoviePopularRepository
import br.com.wgc.movieapp.movie_popular_feature.domain.source.MoviePopularRemoteDataSource
import br.com.wgc.movieapp.movie_popular_feature.domain.usecase.GetPopularMovieUseCase
import br.com.wgc.movieapp.movie_popular_feature.domain.usecase.GetPopularMovieUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviePopularFeatureModule {
    @Provides
    @Singleton
    fun providerMovieDataSource(
        service: MovieService,
    ): MoviePopularRemoteDataSource {
        return MoviePopularRemoteDataSourceImpl(
            service = service
        )
    }
    @Provides
    @Singleton
    fun provideMovieRepository(
        remoteDataSource: MoviePopularRemoteDataSource
    ): MoviePopularRepository {
        return MoviePopularRepositoryImpl(
            remoteDataSource = remoteDataSource
        )
    }

    @Provides
    @Singleton
    fun providerGetPopularMovieUseCase(
        repository: MoviePopularRepository
    ): GetPopularMovieUseCase {
        return GetPopularMovieUseCaseImpl(
            moviePopularRepository = repository
        )
    }
}