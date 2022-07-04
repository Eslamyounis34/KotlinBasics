package com.elarabygroup.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button =findViewById<Button>(R.id.button)
        val textview1 =findViewById<TextView>(R.id.textview1)
        val textview2 =findViewById<TextView>(R.id.textview2)

        button.setOnClickListener {
            Toast.makeText(this,"Done",Toast.LENGTH_LONG).show()
        }

        textview1.setOnClickListener {
            Toast.makeText(this,"Done from textview",Toast.LENGTH_LONG).show()

        }

        textview2.setOnClickListener {
            Toast.makeText(this,"Done from textview2",Toast.LENGTH_LONG).show()

        }
    }
}