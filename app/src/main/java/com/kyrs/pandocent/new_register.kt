package com.kyrs.pandocent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.kyrs.pandocent.ui.login.LoginActivity
import kotlinx.android.synthetic.main.new_registration.*

class new_register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_registration)
        reg_go.setOnClickListener {
            writeNewUser()
            finish()
        }
    }

    private fun writeNewUser() {

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("users")
        var usrID = reg_username.editText?.text.toString()
        if (usrID=="")
        {
            usrID="blank"
        }
        myRef.child(usrID).child("fullname").setValue(reg_full_name.editText?.text.toString())
        myRef.child(usrID).child("username").setValue(reg_username.editText?.text.toString())
        myRef.child(usrID).child("email").setValue(reg_email.editText?.text.toString())
        myRef.child(usrID).child("phone").setValue(reg_phone.editText?.text.toString())
        myRef.child(usrID).child("pwd").setValue(reg_pwd.editText?.text.toString())
        startActivity(Intent(this,LoginActivity::class.java))
    }
}


