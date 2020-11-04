package com.zestworks.playground

import dagger.Module
import dagger.Provides

@Module
class TestModule {
    @Provides
    fun provideTestHi() = "Hi, from test module"
}