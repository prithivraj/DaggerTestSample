package com.zestworks.playground

import org.junit.Test

import org.junit.Assert.*
import javax.inject.Inject

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Inject
    lateinit var hiString: String

    @Test
    fun addition_isCorrect() {
        val testComponent = DaggerTestComponent.builder().testModule(TestModule()).build()
        testComponent.inject(this)
        println("Printing from test $hiString")
        assertEquals(4, 2 + 2)
    }
}