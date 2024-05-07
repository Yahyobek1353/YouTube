package com.salievYT.metube.di

import com.salievYT.metube.data.netWork.repository.YoutubeRepository
import org.koin.dsl.module

val repoModule = module {
    single{ YoutubeRepository(get()) }
}