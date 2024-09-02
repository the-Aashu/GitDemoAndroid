package com.example.allinone.MenuBar

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.allinone.R

class MenuScreen : AppCompatActivity() {
    val customMenu= CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_screen)

        val showPopUp=findViewById<Button>(R.id.menubtn)


        showPopUp.setOnClickListener {
            customMenu.customMenu(this,it)
        }
    }
}