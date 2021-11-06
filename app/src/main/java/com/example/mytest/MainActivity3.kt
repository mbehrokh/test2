package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var tv_name= findViewById<TextView>(R.id.ac_main2_tv_name)

        var bundler: Bundle? = intent.extras

        tv_name.text = "سلام" + bundler!!.get("edt_name").toString() + "" + bundler!!.get("edt_name").toString() + "به سایت من خوش اومدین"
    }
}