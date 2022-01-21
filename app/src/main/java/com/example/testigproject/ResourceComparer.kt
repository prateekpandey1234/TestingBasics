package com.example.testigproject

import android.content.Context

class ResourceComparer {
    fun compare(context: Context,Id:Int,string:String):Boolean {
        return context.getString(Id)==string
    }
}