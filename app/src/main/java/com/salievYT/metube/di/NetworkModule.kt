package com.salievYT.metube.di

import com.myself223.metube.BuildConfig.BASE_URL
import com.salievYT.metube.data.netWork.remote.ApiService
import com.salievYT.metube.data.netWork.repository.YoutubeRepository
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val netModule = module{
    single { provideApiService(provideRetrofit()) }

}

fun provideRetrofit() : Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideApiService(retrofit: Retrofit) : ApiService{
    return retrofit.create(ApiService::class.java)
}



