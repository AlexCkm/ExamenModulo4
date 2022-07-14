package com.example.examenmodulocuatro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examenmodulocuatro.SharedPreferences.Companion.prefs
import com.example.examenmodulocuatro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        chesckUserValues()

    }
    fun initUI(){
        binding.btnCreate.setOnClickListener {
            accessSharedPreferences()
        }

    }
    fun chesckUserValues(){
        if(prefs.getEmail().isNotEmpty())
        if(prefs.getPassword().isNotEmpty()){
            goAccess()
        }
    }

    fun accessSharedPreferences() {
        if (binding.etEmail.text.toString().isNotEmpty())
            if (binding.etPassword.text.toString().isNotEmpty()){
                prefs.saveEmail(binding.etEmail.text.toString())
        prefs.savePassword(binding.etPassword.text.toString())
        goAccess()

        }else {
        Toast.makeText(this, "Rellene este parametro", Toast.LENGTH_LONG).show()
        }
    }

    private fun goAccess(){
        startActivity(Intent(this, NextActivity::class.java))
    }

}