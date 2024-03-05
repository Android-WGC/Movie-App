package br.com.wgc.movieapp.movie_popular_feature.data.mapper

import br.com.wgc.movieapp.core.data.remote.model.popular.MovieResult
import br.com.wgc.movieapp.core.domain.model.Movie
import br.com.wgc.movieapp.core.utils.toPostUrl

fun List<MovieResult>.toMovie() = this.map { movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath?.toPostUrl() ?: ""
    )
}