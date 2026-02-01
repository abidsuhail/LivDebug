package com.abid.livdebug

import com.abid.livdebug.LiveDebug.liveError
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        liveError("hellow")
    }
}