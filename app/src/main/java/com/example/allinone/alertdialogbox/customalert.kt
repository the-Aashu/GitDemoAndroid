package com.example.allinone.alertdialogbox

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.allinone.R

class customalert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customalert)

        val abtn=findViewById<Button>(R.id.abtn1)
        val abtnn=findViewById<Button>(R.id.abtn2)
        val abtnnn=findViewById<Button>(R.id.abtn3)

         abtn.setOnClickListener {
             SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                 .setTitleText("Success SweetAlert")
                 .setContentText("this is this is succes sweetalert box")
                 .show()
         }
        abtnn.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Erron SweetALertBox")
                .setContentText("this is error sweet alert box")
                .show()
        }
        abtnnn.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.PROGRESS_TYPE)
                .setTitleText("Progress sweetAlertBox")
                .setContentText("this is the progress sweetalert box")
        }
    }
}