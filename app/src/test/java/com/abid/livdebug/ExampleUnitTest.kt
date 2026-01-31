package com.abid.livdebug

import com.abid.livdebug.LivDebug.livDebug
import com.abid.livdebug.LivDebug.livError
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        livError("hellow")
    }
}