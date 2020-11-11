package com.zestworks.playground

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule {

    @Provides
    @Singleton
    fun provideHi() = "Hi from main module"
}