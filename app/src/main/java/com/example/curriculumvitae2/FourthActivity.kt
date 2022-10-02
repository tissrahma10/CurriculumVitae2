package com.example.curriculumvitae2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class FourthActivity : AppCompatActivity() {
    private var txtv1: TextView? = null
    private var txtv2: TextView? = null
    private var txtv3: TextView? = null
    private var txtv4: TextView? = null
    private var txtv5: TextView? = null
    private var txtv6: TextView? = null
    private var txtv7: TextView? = null
    private var txtv8: TextView? = null
    private var txtv9: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        txtv1 = findViewById(R.id.textView13)
        txtv2 = findViewById(R.id.textView14)
        txtv3 = findViewById(R.id.textView15)
        txtv4 = findViewById(R.id.textView16)
        txtv5 = findViewById(R.id.textView17)
        txtv6 = findViewById(R.id.textView18)
        txtv7 = findViewById(R.id.textView19)
        txtv8 = findViewById(R.id.textView20)
        txtv9 = findViewById(R.id.textView21)
       var  name = intent.getStringExtra(FULLNAME).toString();
      var   age = intent.getStringExtra(AGE).toString();
       var  email= intent.getStringExtra(EMAIL).toString();
      var   hobbies = intent.getStringExtra(HOBBIES).toString();
       var  langage = intent.getStringExtra(LANGAGE).toString();
        var ios = intent.getStringExtra(IOS).toString();
        var  flutter = intent.getStringExtra(FLUTTER).toString();
        var  andoid= intent.getStringExtra(ANDROID).toString();
        txtv1?.setText("NAME:  "+name)
        txtv2?.setText("Age:  "+age)
        txtv3?.setText("email :  "+email)
        txtv4?.setText("hobbies :  "+hobbies)
        txtv5?.setText("langages :   "+langage)
        txtv6?.setText("your skill's level in Flutter :      "+ flutter)
        txtv7?.setText("your skill's level in android  :      "+ andoid)
        txtv8?.setText("your skill's level in Ios :      "+ ios)



    }
}