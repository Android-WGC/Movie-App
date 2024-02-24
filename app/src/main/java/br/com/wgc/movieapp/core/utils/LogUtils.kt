package br.com.wgc.movieapp.core.utils

import timber.log.Timber

object LogUtils {

    fun logError(tag: String, msg: String) = Timber.tag(tag).e("ERROR -> $msg")
    fun logInfo(tag: String, msg: String) = Timber.tag(tag).i("ERROR -> $msg")

}