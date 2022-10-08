package com.example.oefstarter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oefstarter.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvBevestigd.text = "Proficiat! Je bent ingeschreven!"

        val btnVideo = binding.btnVideoParty


        btnVideo.setOnClickListener(){

            val uri = Uri.parse("http://www.youtube.com/watch?v=XAYvvU-zjoc")
            val it = Intent(Intent.ACTION_VIEW, uri)
            startActivity(it)
        }


    }
}