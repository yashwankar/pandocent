package com.kyrs.pandocent

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.kyrs.pandocent.R
import kotlinx.android.synthetic.main.homepage.*


class HomepageActivity() : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        setSupportActionBar(homepage_toolbar)
        val toggle= ActionBarDrawerToggle(this, side_drawer,homepage_toolbar, R.string.openNavDrawer, R.string.closeNavDrawer)
        side_drawer.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)

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