package com.example.trevorstokvis.testapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.constraint_group_activity.*

class ConstraintGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_group_activity)

        group_1_button.setOnClickListener {
            group_1.visibility = View.VISIBLE
            group_2.visibility = View.INVISIBLE
            group_2.requestLayout()
            group_3.visibility = View.INVISIBLE
            group_3.requestLayout()
        }

        group_2_button.setOnClickListener {
            group_1.visibility = View.INVISIBLE
            group_2.visibility = View.VISIBLE
            group_2.requestLayout()
            group_3.visibility = View.INVISIBLE
            group_3.requestLayout()
        }

        group_3_button.setOnClickListener {
            group_1.visibility = View.INVISIBLE
            group_2.visibility = View.INVISIBLE
            group_2.requestLayout()
            group_3.visibility = View.VISIBLE
            group_3.requestLayout()
        }
    }
}