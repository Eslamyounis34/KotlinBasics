package com.elarabygroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.elarabygroup.kotlinbasics.PriceActivity
import com.elarabygroup.kotlinbasics.R
import com.elarabygroup.kotlinbasics.databinding.ActivityCoffeBinding
import com.elarabygroup.kotlinbasics.databinding.ActivityPriceBinding
import com.elarabygroup.kotlinbasics.databinding.ActivityViewsBinding
import com.squareup.picasso.Picasso

class CoffeActivity : AppCompatActivity() {
    lateinit var binding: ActivityCoffeBinding
    var numOfCups = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_coffe)
        binding = ActivityCoffeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.with(applicationContext)
            .load("https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/newscms/2019_33/2203981/171026-better-coffee-boost-se-329p.jpg")
            .into(binding.imageView)
        binding.plus.setOnClickListener {

            sum()

            binding.numberofcups.text = numOfCups.toString()
        }
        binding.minus.setOnClickListener {
            if (numOfCups.equals(0)) {
                Toast.makeText(this, "Not valied", Toast.LENGTH_SHORT).show()
            } else {
                sub()
                binding.numberofcups.text = numOfCups.toString()
            }

        }
        binding.order.setOnClickListener {   var intent = Intent(this, PriceActivity::class.java)
            intent.putExtra("coffiecups", numOfCups.toString())
            startActivity(intent)}

    }

    fun sum() {
        numOfCups += 1
    }

    fun sub() {

        numOfCups -= 1
    }
}