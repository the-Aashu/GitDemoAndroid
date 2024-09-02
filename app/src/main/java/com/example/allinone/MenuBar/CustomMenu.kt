package com.example.allinone.MenuBar

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.allinone.R

class CustomMenu {
    fun customMenu(context: Context,view:View){
       val pop=PopupMenu(context,view)
        pop.inflate(R.menu.menu)

       pop.setOnMenuItemClickListener {
           when(it!!.itemId){
               R.id.edit -> {
                   Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
                   true
               }
               R.id.delete ->{
                   Toast.makeText(context,"Delete",Toast.LENGTH_SHORT).show()
                   true
               }
               else ->false
           }
       }



    try{
        val fieldMpopup=PopupMenu::class.java.getDeclaredField("mPopup")
        fieldMpopup.isAccessible=true
        val mPopup=fieldMpopup.get(pop)
        mPopup.javaClass
            .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
            .invoke(mPopup,true)
    }catch(_:Exception){

    }finally {
        pop.show()
    }
}}