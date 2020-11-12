package com.samples.unittesting.stringexample

import android.content.Context
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class StringRetrieverTest {

    companion object {
        const val ID = 10
        const val STRING = "string"
    }

    @Mock
    lateinit var mContextMock: Context
    lateinit var SUT: StringRetriever

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = StringRetriever(mContextMock)
    }

    @Test
    @Throws(Exception::class)
    fun getString_correctParameterPassedToContext() {
        SUT.getString(ID)
        verify(mContextMock).getString(ID)
    }

    @Test
    @Throws(Exception::class)
    fun getString_correctResultReturned() {
        `when`(mContextMock.getString(ID)).thenReturn(STRING)
        val result = SUT.getString(ID)
        assertThat(result, CoreMatchers.`is`(STRING))
    }
}

