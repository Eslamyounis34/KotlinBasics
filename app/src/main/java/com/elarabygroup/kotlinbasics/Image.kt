package com.elarabygroup.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elarabygroup.kotlinbasics.databinding.ActivityMain2Binding
import com.squareup.picasso.Picasso

class Image : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //(R.layout.activity_image)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}