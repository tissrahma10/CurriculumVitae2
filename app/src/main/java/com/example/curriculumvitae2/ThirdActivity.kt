package com.example.curriculumvitae2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.TextView
const val LANGAGE = ""
const val HOBBIES = ""
const val ANDROID = ""
const val IOS = ""
const val  FLUTTER = ""
class ThirdActivity : AppCompatActivity() {
    private var arabic: CheckBox? = null
    private var frensh: CheckBox? = null
    private var english: CheckBox? = null
    private var music: CheckBox? = null
    private var sport: CheckBox? = null
    private var games: CheckBox? = null
    private var btnNext: Button? = null
    private var error1: TextView? = null
    private var error2: TextView? = null
    private var ios: SeekBar? = null
    private var flutter: SeekBar? = null
    private var androids : SeekBar? = null
    private var name : String? = ""
    private var age : String? = ""
    private var email : String? = ""

    private var langage = ""
    private var hobbies = ""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnNext = findViewById(R.id.button)
        arabic = findViewById(R.id.arabic)
        frensh = findViewById(R.id.frensh)
        english = findViewById(R.id.english)
        music = findViewById(R.id.music)
        sport = findViewById(R.id.sport)
        games = findViewById(R.id.games)
        error1 = findViewById(R.id.textView11)
        error2 = findViewById(R.id.textView12)
        flutter = findViewById(R.id.seekBar3)
        androids = findViewById(R.id.seekBar)
        ios = findViewById(R.id.seekBar2)
         name = intent.getStringExtra(FULLNAME).toString();
         age = intent.getStringExtra(AGE).toString();
         email = intent.getStringExtra(EMAIL).toString();
     if (arabic?.isChecked == true) {
         langage == "arabic "
        }
        if (frensh?.isChecked == true) {
            langage == "frensh "
        }
        if (english?.isChecked == true) {
            langage == "english "
        }
        if (sport?.isChecked == true) {
            hobbies == "sport "
        }
        if (games?.isChecked == true) {
            hobbies == "games"
        }
        if (music?.isChecked == true) {
            hobbies == "music "
        }

        btnNext!!.setOnClickListener {

            if (!arabic?.isChecked!! && !frensh?.isChecked!! && !english?.isChecked!!) {
                error1?.setText("you have to check at least one item ")
            }
            if (!music?.isChecked!! && !games?.isChecked!! && !sport?.isChecked!!) {
                error2?.setText("you have to check at least one item ")
            } else {
                val intent = Intent(this, FourthActivity::class.java).apply {
                    putExtra(FULLNAME, name)
                    putExtra(AGE, age)
                    putExtra(EMAIL, email)
                    putExtra(LANGAGE, langage)
                    putExtra(HOBBIES, hobbies)
                    putExtra(FLUTTER, flutter?.progress.toString())
                    putExtra(ANDROID,androids?.progress.toString())
                    putExtra(IOS, ios?.progress.toString())


                }
                startActivity(intent)

            }

        }

    }
}