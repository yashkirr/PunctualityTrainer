package com.discoloop.punctualitytrainer

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = bottom_nav
        val navController = findNavController(R.id.fragment)//navHost Fragment
        bottomNavigationView.setupWithNavController(navController);
        supportActionBar?.hide() //hides top app bar
        val locationServiceIntent = Intent(this, LocationService::class.java)
        Thread(Runnable {
            startService(locationServiceIntent)
        })
    }
}
