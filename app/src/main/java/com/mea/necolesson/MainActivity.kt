package com.mea.necolesson


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.mea.necolesson.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
lateinit var bgClass : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bgClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bgClass.root)



        bgClass.button.setOnClickListener{
            val A = bgClass.editTextNumber.text.toString().toInt() //zp
            val B = bgClass.editTextNumber2.text.toString().toInt() // chasov
            val C = bgClass.editTextNumber3.text.toString().toInt() // dney otrabtano
            val D = 60

            var a1s = A / C
            var a2s = a1s / B
            var a3s = a2s / D
            var a4s = a3s / D

            bgClass.textView3.text = a1s.toString()
            bgClass.textView4.text = a2s.toString()
            bgClass.textView5.text = a3s.toString()
            bgClass.textView6.text = a4s.toString()




        }


    }






}


