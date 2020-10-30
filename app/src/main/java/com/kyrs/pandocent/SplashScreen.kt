package com.kyrs.pandocent

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import com.kyrs.pandocent.ui.login.LoginActivity
import kotlinx.android.synthetic.main.splash_screen.*

class SplashScreen() : AppCompatActivity() {
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.splash_screen)
//
        val topAnim = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val bottomAnim = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        splash_logo.startAnimation(topAnim)
        splash_name.startAnimation(bottomAnim)
        splash_moto.startAnimation(bottomAnim)

        val SPLASH_TIME_OUT:Long=10000
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }

}