package com.example.allinone.alertdialogbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.allinone.R

class alertdialogbox : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alertdialogbox)
        val alert=findViewById<Button>(R.id.alert)
        alert.setOnClickListener {  
        val dialog=AlertDialog.Builder(this)

        dialog.setTitle("Delete files")
        dialog.setMessage("Do you really want to delete these files")
        dialog.setIcon(R.drawable.baseline_delete_forever_24)

        dialog.setPositiveButton("Yes"){dialogInterface,which ->
              Toast.makeText(this,"yes Deleted",Toast.LENGTH_SHORT).show()
        }
        dialog.setNegativeButton("No"){dialogInterface,which ->
            Toast.makeText(this,"Not Delete",Toast.LENGTH_SHORT).show()
        }
        dialog.setNeutralButton("Cancel"){dialogInterface,which ->
            Toast.makeText(this,"Cancelled",Toast.LENGTH_SHORT).show()

        }
        val alertDialog:AlertDialog=dialog.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
  }
}