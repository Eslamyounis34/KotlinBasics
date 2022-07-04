package com.elarabygroup.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.elarabygroup.kotlinbasics.databinding.ActivityMain2Binding
import com.elarabygroup.kotlinbasics.databinding.ActivityViewsBinding
import com.squareup.picasso.Picasso

class ViewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_views)
        binding = ActivityViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Picasso.with(applicationContext).load("https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/aTSA5zMWlVFTYBIZxTCMbLkfOtb.jpg").into(binding.imageView3)
        binding.button2.setOnClickListener {
//            var b =Intent(this,MainActivity2::class.java)
//            b.putExtra("pass","12345")
//            startActivity(b)



          val result=  sum(5,7)
            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()

        }

    }

    fun sum(num1 :Int,num2:Int):Int{
        val sum= num1+num2

        return sum
    }

    fun sum(name1 :String,name2:String):String{
        val sum= name1+name2

        return sum
    }
}





























//binding.button2.setOnClickListener {
//    val intent=Intent(this,MainActivity2::class.java)
//    intent.putExtra("myname","alaa")
//    startActivity(intent)
//}



