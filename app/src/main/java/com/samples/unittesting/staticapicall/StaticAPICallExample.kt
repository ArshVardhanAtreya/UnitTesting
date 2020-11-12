package com.samples.unittesting.staticapicall

import android.text.TextUtils

class AndroidUnitTestingProblems {
    fun callStaticAndroidApi(string: String?) {
        TextUtils.isEmpty(string)
    }
}
