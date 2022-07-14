package com.example.examenmodulocuatro

import android.content.Context

class Prefs(val context: Context) {
    val DATABASE = "MyDB"
    val EMAIL = "EMAIL"
    val PASSWORD = "PASSWORD"
    val storage = context.getSharedPreferences(DATABASE,
        Context.MODE_PRIVATE)

    fun saveEmail(email:String){
        storage.edit().putString(EMAIL, email).apply()
    }

    fun savePassword(password:String){
        storage.edit().putString(PASSWORD, password).apply()
    }

    fun getEmail():String{
        return storage.getString(EMAIL, "")!!
    }

    fun getPassword():String{
        return storage.getString(PASSWORD, "")!!
    }
    fun cleanData(){
        storage.edit().clear().apply()
    }
}
