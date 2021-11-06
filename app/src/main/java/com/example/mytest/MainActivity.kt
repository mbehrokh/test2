package com.example.mytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt_name=findViewById<EditText>(R.id.ac_main_edt_name)
        var edt_family=findViewById<EditText>(R.id.ac_main_edt_family)
        var btn_confirm=findViewById<Button>(R.id.ac_main_btn_confirm)

        btn_confirm.setOnClickListener{

            var intent: Intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("edt_name",edt_name.text.toString())
            intent.putExtra("edt_family",edt_family.text.toString())
            finish()
            startActivity(intent)

        }





}
}