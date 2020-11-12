package com.samples.unittesting.staticapicall

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AndroidUnitTestingProblemsTest {

    lateinit var SUT: AndroidUnitTestingProblems

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = AndroidUnitTestingProblems()
    }

    @Test
    @Throws(Exception::class)
    fun testStaticApiCall() {
        SUT.callStaticAndroidApi("")
        MatcherAssert.assertThat(true, CoreMatchers.`is`(true))
    }

}