package com.example.allinone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.allinone.MenuBar.MenuScreen
import com.example.allinone.alertdialogbox.alertdialogbox
import com.example.allinone.alertdialogbox.customalert

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val menu=findViewById<Button>(R.id.menu)
        val alertt=findViewById<Button>(R.id.alertt)
        val calert=findViewById<Button>(R.id.calert)
        menu.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MenuScreen::class.java))
        })
     alertt.setOnClickListener(View.OnClickListener {
         startActivity(Intent(this,alertdialogbox::class.java))
     })
        calert.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,customalert::class.java))
        })
    }
}