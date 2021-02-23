package com.site_valley.locationexample

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set Listener
        findViewById<MaterialButton>(R.id.refresh).setOnClickListener {
            updateLocation()
        }

        //Get Location for first create
        updateLocation()
    }

    private fun updateLocation() {
        if (LocationTrack(this).canGetLocation) {
            findViewById<EditText>(R.id.latti).setText(LocationTrack(this).getLatitude().toString())
            findViewById<EditText>(R.id.longi).setText(LocationTrack(this).getLongitude().toString())
        }
    }
}