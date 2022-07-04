package com.elarabygroup.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.elarabygroup.kotlinbasics.databinding.ActivityMain2Binding
import com.squareup.picasso.Picasso

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //  Picasso.with(applicationContext).load("https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/aTSA5zMWlVFTYBIZxTCMbLkfOtb.jpg").into(binding.imageView);


        var x = intent.extras!!.getString("pass")
        binding.textview5.setOnClickListener {
            Toast.makeText(this,x,Toast.LENGTH_SHORT).show()
        }


    }


}


//var bundle=intent.extras!!.getString("myname")
//binding.textview5.setOnClickListener {
//    Toast.makeText(this,bundle.toString(),Toast.LENGTH_SHORT).show()
//}