package com.samples.unittesting.activityexample

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyActivityTest {

    lateinit var SUT: MyActivity

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = MyActivity()
    }

    @Test
    @Throws(Exception::class)
    fun onStart_incrementsCountByOne() {
        SUT.onStart()
        val result: Int = SUT.count
        MatcherAssert.assertThat(result, CoreMatchers.`is`(1))
    }

}