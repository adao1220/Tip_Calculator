package com.example.tipcalculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Calculate_btn.setOnClickListener { handleClick() }
    }
    private fun handleClick(){
        try {
            val enteredText = Amount_input.editableText.toString()

            val getTotal = when(radioGroup.checkedRadioButtonId){
                R.id.Tip1 -> GetTotal.T1
                R.id.Tip2 -> GetTotal.T2
                R.id.Tip3 -> GetTotal.T3
                else -> throw Exception()
            }

            val enteredValue = enteredText.toDouble()

            val tip_results = GetTip(enteredValue, getTotal)
            val Total_results = CalcSum(enteredValue, getTotal)

            Total_tip.text = "Your calculated tip is $"+ tip_results.toString() + " and your total is $"+ Total_results.toString()
        }catch(e:Exception){
            Total_tip.text = "Error"


        }
    }
}