package com.kyrs.pandocent

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.kyrs.pandocent.R
import kotlinx.android.synthetic.main.homepage.*


class HomepageActivity() : AppCompatActivity() {


    //    private var toolbar = findViewById<Toolbar>(R.id.homepage_toolbar)
//    private var navview = findViewById<NavigationView>(R.id.nav_view)
//    private var drawer = findViewById<DrawerLayout>(R.id.side_drawer)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        setSupportActionBar(homepage_toolbar)
        val toggle= ActionBarDrawerToggle(this, side_drawer, R.string.openNavDrawer, R.string.closeNavDrawer)
        side_drawer.addDrawerListener(toggle)
        toggle.syncState()

    }
}