package br.com.wgc.movieapp.core.data.remote

import br.com.wgc.movieapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ParamsInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = addRequestParams(request)
        val newRequest = request.newBuilder().url(url).build()
        return chain.proceed(newRequest)
    }

    private fun addRequestParams(request: Request) = request.url.newBuilder()
        .addQueryParameter(API_KEY_PARAMS, BuildConfig.API_KEY)
        .addQueryParameter(LANGUAGE_PARAMS, LANGUAGE_VALUE)
        .build()

    companion object {
        const val API_KEY_PARAMS = "api_key"
        const val LANGUAGE_PARAMS = "language"
        const val LANGUAGE_VALUE = "pt-BR"
    }
}