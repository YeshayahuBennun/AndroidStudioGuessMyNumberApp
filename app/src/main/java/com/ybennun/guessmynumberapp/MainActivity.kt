package com.ybennun.guessmynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question_text_view.text = String.format(resources.getString(R.string.str_question), number)


    }

    fun clickDownwardArrow(view: View) {
        //TODO
    }

    fun clickSuccess(view: View) {
        //TODO
    }

    fun clickUpwardArrow(view: View) {
        //TODO
    }

    fun clickResetButton(view: View) {
        //TODO
    }
}