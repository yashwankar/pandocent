package com.kyrs.pandocent

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.health_layout.*
import kotlinx.android.synthetic.main.homepage.*

class health_activity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.health_layout)

        quiz.setOnClickListener(){
            val intent = Intent(this,analysis_activity::class.java)
            startActivity(intent)
        }
    }
    }

