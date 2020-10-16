package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var editText: EditText? = null

    var editText1: EditText? = null

    var textView: TextView? = null

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edit_text)
        editText1 = findViewById(R.id.edit_text1)
        textView = findViewById(R.id.text_view)
        button = findViewById(R.id.button)
        calculate()

    }

    private fun calculate() {
        button?.setOnClickListener() {
            var num: Int = editText?.text.toString().toInt()
            var num2: Int = editText1?.text.toString().toInt()
            var result = num+num2
            textView?.text = "$result"
        }
    }





}

