package com.samples.unittesting.activityexample

import android.app.Activity

class MyActivity : Activity() {
    var count = 0


    public override fun onStart() {
        super.onStart()
        count++
    }

}
