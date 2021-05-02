package com.tekever.jaimenejaim.pokemonapp.data.di

import com.tekever.jaimenejaim.pokemonapp.data.api.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.tekever.jaimenejaim.pokemonapp.data.api.interceptors.InterceptorManager
import com.tekever.jaimenejaim.pokemonapp.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun providerRetrofitApi(): Api = Retrofit.Builder()
        .baseUrl(BuildConfig.URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(
            OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(InterceptorManager.interceptor())
                .addInterceptor(InterceptorManager.httpLoggingInterceptor())
                .build())
        .build()
        .create(Api::class.java)

}