package com.kyrs.pandocent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.homepage.*

class dashboard() : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        setSupportActionBar(homepage_toolbar)
        val toggle = ActionBarDrawerToggle(
            this,
            side_drawer,
            homepage_toolbar,
            R.string.openNavDrawer,
            R.string.closeNavDrawer
        )
        side_drawer.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
        safe_mode.setOnClickListener {
            Toast.makeText(this, "You are SAFE", Toast.LENGTH_LONG).show()
        }
        textView7.setOnClickListener {
            Toast.makeText(this, "You are SAFE", Toast.LENGTH_LONG).show()
        }

        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:23.0775365,76.8490828")

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
// Make the Intent explicit by setting the Google Maps package
            mapIntent.setPackage("com.google.android.apps.maps")

// Attempt to start an activity that can handle the Intent
            startActivity(mapIntent)
        }
        rating.setOnClickListener {
            Toast.makeText(this, "Your current rating is 80", Toast.LENGTH_LONG).show()
        }
        health.setOnClickListener() {
            val intent = Intent(this, health_activity::class.java)
            startActivity(intent)
        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return false
    }

    override fun onBackPressed() {
        if (side_drawer.isDrawerOpen(GravityCompat.START)) {
            side_drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    fun openstats(view: View) {
        var uri = Uri.parse("https://www.covid19india.org/")
        startActivity(Intent(Intent.ACTION_VIEW, uri))

    }

    fun openfeeds(view: View) {
        var uri = Uri.parse("https://www.mohfw.gov.in/#latest-update")
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}