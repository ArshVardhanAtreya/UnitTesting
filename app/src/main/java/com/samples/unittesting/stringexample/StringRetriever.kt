package com.samples.unittesting.stringexample

import android.content.Context

class StringRetriever(private val mContext: Context) {
    fun getString(id: Int): String {
        return mContext.getString(id)
    }

}