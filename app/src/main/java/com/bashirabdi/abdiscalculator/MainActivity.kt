package com.bashirabdi.abdiscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            //numbers
        tvOne.setOnClickListener{appendOnExpression("1",true) }
        tvTwo.setOnClickListener{appendOnExpression("2", true) }
        tvThree.setOnClickListener{appendOnExpression("3",true) }
        tvFour.setOnClickListener{appendOnExpression("4", true) }
        tvFive.setOnClickListener{appendOnExpression("5",true) }
        tvSix.setOnClickListener{appendOnExpression("6", true) }
        tvSeven.setOnClickListener{appendOnExpression("7",true) }
        tvEight.setOnClickListener{appendOnExpression("8", true) }
        tvNine.setOnClickListener{appendOnExpression("9",true) }
        tvZero.setOnClickListener{appendOnExpression("0",true) }
        tvDot.setOnClickListener{appendOnExpression(".",true) }

        //operations

         tvPlus.setOnClickListener {appendOnExpression("+",false) }
         tvMinus.setOnClickListener {appendOnExpression("-",false) }
         tvMul.setOnClickListener {appendOnExpression("*",false) }
         tvDivide.setOnClickListener {appendOnExpression("/",false) }
         tvOpen.setOnClickListener {appendOnExpression("(",false) }
         tvClose.setOnClickListener {appendOnExpression(")",false) }

         tvClear.setOnClickListener {
             tvExpression.text= ""
             tvResult.text = ""
         }


        tvBack.setOnClickListener{

            val string = tvExpression.toString()

            if(string.isNotEmpty())
            {
                tvExpression.text=string.substring(0,string.length-1)
            }
            tvResult.text =""
        }

        tvEqual.setOnClickListener {

            try {
                val expression = (tvExpression.text)



            }catch (e:Exception)
            {

                Log.d("Exception", "Message" +e.message)
            }
        }
    }

    fun appendOnExpression(string:String, onClear :Boolean)
    {

        if(onClear)
        {
            tvResult.text = " "
            tvExpression.append(string)
        }
         else {
            tvExpression.append(tvResult.text)
            tvExpression.append(string)
            tvResult.text = " "
        }
    }
}
