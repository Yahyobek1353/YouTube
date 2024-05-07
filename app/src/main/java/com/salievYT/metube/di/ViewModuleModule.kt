package com.salievYT.metube.di

import com.salievYT.metube.ui.fragment.playlist.PlaylistViewModel
import org.koin.dsl.module

val uiModule = module {
    single { PlaylistViewModel(get()) }
}

