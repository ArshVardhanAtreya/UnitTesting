package com.samples.unittesting.fundamentals

import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class StringReverserTest {

    lateinit var SUT: StringReverser

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = StringReverser()
    }

    @Test
    @Throws(Exception::class)
    fun reverse_emptyString_emptyStringReturned() {
        val result = SUT!!.reverse("")
        assertThat(result, CoreMatchers.`is`(""))
    }

    @Test
    @Throws(Exception::class)
    fun reverse_singleCharacter_sameStringReturned() {
        val result = SUT!!.reverse("a")
        assertThat(result, CoreMatchers.`is`("a"))
    }

    @Test
    @Throws(Exception::class)
    fun reverse_longString_reversedStringReturned() {
        val result = SUT!!.reverse("Arsh Vardhan")
        assertThat(
            result,
            CoreMatchers.`is`("nahdraV hsrA")
        )
    }

}