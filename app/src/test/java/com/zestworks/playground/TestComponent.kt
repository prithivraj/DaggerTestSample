package com.zestworks.playground

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class])
interface TestComponent {
    fun inject(exampleUnitTest: ExampleUnitTest)
}