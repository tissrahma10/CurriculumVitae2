package com.example.curriculumvitae2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
const val FULLNAME = ""
const val AGE = ""
const val EMAIL = ""
class SecondActivity : AppCompatActivity() {
    private var txtFullName: TextInputLayout? = null
    private var txtAge: TextInputLayout? = null
    private var txtEmail: TextInputLayout? = null
    private var btnNext: Button? = null
    private var error1: TextView? = null
    private var error2: TextView? = null
    private var error3: TextView? = null
    private var male: CheckBox? = null
    private var Female: CheckBox? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txtFullName = findViewById(R.id.outlinedTextField)
        txtAge = findViewById(R.id.outlinedTextField1)
        txtEmail = findViewById(R.id.outlinedTextField2)
        btnNext = findViewById(R.id.button3)
        error1 = findViewById(R.id.textView2)
        error2 = findViewById(R.id.textView3)
        error3 = findViewById(R.id.textView5)


        btnNext!!.setOnClickListener {

            if (txtAge?.editText?.text!!.isEmpty()) {
                error2?.setText("must not be empty")
                txtAge?.error = "dsghbf"
                error3?.setText("")
                error1?.setText("")
            }
            if (txtFullName?.editText?.text!!.isEmpty()) {
                error1?.setText("must not be empty")
                txtFullName?.error = "dsghbf"
                error2?.setText("")
                error3?.setText("")
            }
            if (txtEmail?.editText?.text!!.isEmpty()) {
                error3?.setText("must not be empty")
                txtEmail?.error = "dsghbf"
                error1?.setText("")
                error2?.setText("")
            } else {
              val intent =   Intent(this, ThirdActivity::class.java).apply {
                    putExtra(FULLNAME, txtFullName?.editText?.text!!.toString())
                    putExtra(AGE, txtAge?.editText?.text!!.toString())
                    putExtra(EMAIL, txtEmail?.editText?.text!!.toString())
                }
                startActivity(intent)
            }
        }
    }
}





