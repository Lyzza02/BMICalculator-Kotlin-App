package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculationBMI(v: View?){
        val btn = findViewById<Button>(R.id.btn)
        val height = findViewById<TextView>(R.id.height)
        val weight = findViewById<TextView>(R.id.weight)
        var result = findViewById<TextView>(R.id.result)

        val h = (height.text).toString().toFloat() /100
        val w = weight.text.toString().toFloat()
        val res = w/(h*h)
        result.text = "%.2f".format(res)
    }
}