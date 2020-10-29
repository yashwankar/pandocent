package com.kyrs.pandocent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.homepage.*

class dashboard() : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        setSupportActionBar(homepage_toolbar)
        val toggle= ActionBarDrawerToggle(this, side_drawer,homepage_toolbar, R.string.openNavDrawer, R.string.closeNavDrawer)
        side_drawer.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)

        health.setOnClickListener(){
            val intent = Intent(this,health_activity::class.java)
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
}