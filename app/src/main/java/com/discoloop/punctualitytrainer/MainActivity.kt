package com.discoloop.punctualitytrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = bottom_nav
        val navController = findNavController(R.id.fragment)//navHost Fragment
        bottomNavigationView.setupWithNavController(navController);
        supportActionBar?.hide() //hides top app bar
    }
}
