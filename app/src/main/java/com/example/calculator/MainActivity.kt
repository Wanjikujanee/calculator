package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etNumber: EditText
    lateinit var etNumber2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmi)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract= findViewById(R.id.btnSubstract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)
        tvResult= findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val number = etNumber.text.toString()
            val numberDecimal = etNumber2.text.toString()
            if (number.isBlank()) {
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etNumber2.setError("NumberDecimal is required")
                return@setOnClickListener
            }
            addition(number.toInt(), numberDecimal.toInt())

        }
        btnSubtract.setOnClickListener {
            val number = etNumber.text.toString()
            val numberDecimal = etNumber2.text.toString()
            if (number.isBlank()) {
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etNumber2.setError("NumberDecimal is required")
                return@setOnClickListener
            }
            subtraction(number.toInt(),numberDecimal.toInt())
        }
        btnMultiply.setOnClickListener {
            val number = etNumber.text.toString()
            val numberDecimal = etNumber2.text.toString()
            if (number.isBlank()) {
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etNumber2.setError("NumberDecimal is required")
                return@setOnClickListener
            }
            multiplication(number.toInt(),numberDecimal.toInt())
        }

        btnModulus.setOnClickListener {
            val number = etNumber.text.toString()
            val numberDecimal = etNumber2.text.toString()
            if (number.isBlank()) {
                etNumber.setError("Number  is required")
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etNumber2.setError("NumberDecimal is required")
                return@setOnClickListener
            }
            modulus(number.toInt(),numberDecimal.toInt())
        }
    }

    fun addition(number: Int, numberDecimal: Int) {
        var add = number + numberDecimal
        tvResult.text = add.toString()

    }

    fun subtraction(number: Int, numberDecimal: Int) {
        var sub = number - numberDecimal
        tvResult.text = sub.toString()
    }

    fun multiplication(number:Int, numberDecimal:Int){
        var multiply=number*numberDecimal
        tvResult.text=multiply.toString()
    }

    fun modulus(number:Int, numberDecimal:Int){
        var remainder=number%numberDecimal
        tvResult.text=remainder.toString()
    }
}

