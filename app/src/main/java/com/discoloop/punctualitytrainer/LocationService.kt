package com.discoloop.punctualitytrainer

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.location.Geocoder
import android.location.Location
import android.os.IBinder
import android.util.Log
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import kotlin.math.log

class LocationService : Service() {


    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var geocoder: Geocoder
    private lateinit var currentUserLocation: Location



    @SuppressLint("MissingPermission")//TODO Remove suppression
    override fun onCreate() {
        super.onCreate()
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        fusedLocationClient.lastLocation.addOnSuccessListener { location : Location ->
            currentUserLocation = location
        }
        geocoder = Geocoder(this)
    }
    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getLocationName(){
        geocoder.getFromLocation(currentUserLocation.latitude, currentUserLocation.longitude,2)
    }
}