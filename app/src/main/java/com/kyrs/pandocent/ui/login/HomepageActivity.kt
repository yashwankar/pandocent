package com.kyrs.pandocent.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.kyrs.pandocent.R


class HomepageActivity() : AppCompatActivity() {


//    private var toolbar = findViewById<Toolbar>(R.id.homepage_toolbar)
//    private var navview = findViewById<NavigationView>(R.id.nav_view)
//    private var drawer = findViewById<DrawerLayout>(R.id.side_drawer)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)
    }
}