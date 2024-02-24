package br.com.wgc.movieapp.core.utils

import br.com.wgc.movieapp.BuildConfig


fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"
fun String?.toBackdropUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"