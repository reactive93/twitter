package com.example.twitter

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_home)

    }
}