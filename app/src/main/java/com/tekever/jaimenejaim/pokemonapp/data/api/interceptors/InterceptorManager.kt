package com.tekever.jaimenejaim.pokemonapp.data.api.interceptors

import com.tekever.jaimenejaim.pokemonapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor

object InterceptorManager {

    fun interceptor(): Interceptor {
        return Interceptor { chain: Interceptor.Chain ->
            val requestBuilder = chain.request().newBuilder()
            requestBuilder.header("Content-Type", "application/json")
            val request = requestBuilder.build()
            val response = chain.proceed(request)
            response
        }
    }

    fun httpLoggingInterceptor(): Interceptor {
        return if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        } else {
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE)
        }
    }
}