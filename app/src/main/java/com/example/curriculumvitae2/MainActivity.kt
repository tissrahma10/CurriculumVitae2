package com.example.curriculumvitae2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable { // your code to start second activity. Will wait for 3 seconds before calling this method
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            finish()
        }, 3000)
    }
}

