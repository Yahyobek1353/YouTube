package com.salievYT.metube.ui.other

import android.app.Application
import com.salievYT.metube.di.netModule
import com.salievYT.metube.di.repoModule
import com.salievYT.metube.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(netModule , repoModule , uiModule)
        }
    }
}