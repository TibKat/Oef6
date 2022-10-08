package com.example.oefstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.oefstarter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = findViewById<Button>(R.id.btnVerzenden)

        btn.setOnClickListener{

            val name = binding.etName.text.toString()
            val number = binding.etRnumber.text.toString()
            val email = binding.etEmail.text.toString()


            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name).toString()
                it.putExtra("EXTRA_NUMBER", number).toString()
                it.putExtra("EXTRA_EMAIL", email).toString()
                startActivity(it)
            }
        }
    }
}