package com.example.oefstarter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oefstarter.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("EXTRA_NAME").toString()
        val number = intent.getStringExtra("EXTRA_NUMBER").toString()
        val email = intent.getStringExtra("EXTRA_EMAIL").toString()

        binding.tvName.text = name
        binding.tvNumber.text= number
        binding.tvEmail.text = email

        val btnBack = binding.btnBack
        val btnConfirm = binding.btnConfirm

        btnBack.setOnClickListener{
            finish()
        }

        btnConfirm.setOnClickListener{
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }

        }






    }
}


