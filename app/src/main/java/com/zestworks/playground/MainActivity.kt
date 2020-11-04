package com.zestworks.playground

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    @Inject
    lateinit var hiString: String

    override fun onStart() {
        super.onStart()
        val mainComponent = DaggerMainComponent.builder().mainModule(MainModule()).build()
        mainComponent.inject(this)
        Log.d("Logging: ", hiString)
    }
}