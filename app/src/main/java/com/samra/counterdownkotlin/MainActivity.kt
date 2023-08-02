package com.samra.counterdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text :TextView = findViewById(R.id.text)
        object : CountDownTimer(10000 , 1000){
            override fun onTick(p0: Long) {
                text.text= "Left:${p0/1000}"
            }
            override fun onFinish() {
                text.text= "Left: 0"
            }
        }.start()
    }


}