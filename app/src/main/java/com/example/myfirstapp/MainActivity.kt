package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        ///////////////////////////////////////////////////////////////
        //saveButton actions
        ///////////////////////////////////////////////////////////////
        startButton.setOnClickListener {
            if (movieTitle.text.toString().isEmpty()) {
                Toast.makeText(this, "Wpisz nazwę filmu", Toast.LENGTH_SHORT).show()
            }else{
                // Moving to next page
                val intent = Intent(this, QuizQuestionsActivity::class.java)
//                Passing username to next activity
                intent.putExtra(Constants.USER_NAME, movieTitle.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}