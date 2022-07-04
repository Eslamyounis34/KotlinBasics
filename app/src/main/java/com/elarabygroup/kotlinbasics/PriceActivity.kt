package com.elarabygroup.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elarabygroup.kotlinbasics.databinding.ActivityCoffeBinding
import com.elarabygroup.kotlinbasics.databinding.ActivityPriceBinding
import com.squareup.picasso.Picasso

class PriceActivity : AppCompatActivity() {
    lateinit var binding: ActivityPriceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPriceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //  setContentView(R.layout.activity_price)
        Picasso.with(applicationContext)
            .load("https://image.shutterstock.com/image-vector/money-bag-flat-illustration-dollars-600w-1927192892.jpg")
            .into(binding.money)
        var numberOfcups =intent.extras!!.getString("coffiecups")
        var price =numberOfcups!!.toInt()*5
        binding.price.text=price.toString()

    }
}