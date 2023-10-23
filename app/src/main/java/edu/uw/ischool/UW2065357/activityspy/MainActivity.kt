package edu.uw.ischool.UW2065357.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ActivityLifecycle", "onCreate event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Log the onDestroy event
        Log.i("ActivityLifecycle", "onDestroy event fired")
        Log.e("ActivityLifecycle", "Look at me... I am the Captain Now -- Captain Philips")
    }

    override fun onStart() {
        super.onStart()
        // Log the onStart event
        Log.i("ActivityLifecycle", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        // Log the onStop event
        Log.i("ActivityLifecycle", "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        // Log the onPause event
        Log.i("ActivityLifecycle", "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        // Log the onResume event
        Log.i("ActivityLifecycle", "onResume event fired")
    }
}