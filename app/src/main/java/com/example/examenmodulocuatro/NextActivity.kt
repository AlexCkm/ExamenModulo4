package com.example.examenmodulocuatro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenmodulocuatro.SharedPreferences.Companion.prefs
import com.example.examenmodulocuatro.databinding.ActivityMainBinding
import com.example.examenmodulocuatro.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()

        }
    fun initUI(){
        binding.btnBack.setOnClickListener{
            onBackPressed()
        }
        binding.btnEnd.setOnClickListener{
            prefs.cleanData()
            onBackPressed()
        }
    }
}
