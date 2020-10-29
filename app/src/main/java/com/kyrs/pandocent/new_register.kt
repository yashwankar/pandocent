package com.kyrs.pandocent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase

class new_register : AppCompatActivity() {
    lateinit var fullname:EditText
    lateinit var username:EditText
//    lateinit var email:EditText
//    lateinit var phoneno:EditText
//    lateinit var pwd:EditText
    lateinit var gobtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_registration)
        fullname=findViewById(R.id.reg_full_name)
        username=findViewById(R.id.reg_username)
//        email=findViewById(R.id.reg_email)
//        phoneno=findViewById(R.id.reg_phone)
//        pwd=findViewById(R.id.reg_pwd)
//        gobtn=findViewById(R.id.reg_go)

        gobtn.setOnClickListener {
            update()
        }


    }

    private fun update() {
        val name=fullname.text.toString().trim()

        val ref = FirebaseDatabase.getInstance().getReference("users")
        val userid=ref.push().key
        val new_usr=users(fullname,username)
//        ref.child(new_usr).setValue(userid)


    }
}