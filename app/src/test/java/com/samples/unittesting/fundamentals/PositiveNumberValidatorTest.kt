package com.samples.unittesting.fundamentals

import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {

    lateinit var SUT: PositiveNumberValidator

    @Before
    fun setup() {
        SUT = PositiveNumberValidator()
    }

    @Test
    fun test1() {
        val result = SUT.isPositive(-1)
        assertThat(
            result,
            CoreMatchers.`is`(false)
        )
    }

    @Test
    fun test2() {
        val result = SUT.isPositive(0)
        assertThat(
            result,
            CoreMatchers.`is`(false)
        )
    }

    @Test
    fun test3() {
        val result = SUT.isPositive(1)
        assertThat(result, CoreMatchers.`is`(true))
    }

}