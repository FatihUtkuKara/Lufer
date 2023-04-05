package com.example.lufer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun addButton(view: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this,IncomeActivity::class.java)
        startActivity(intent)
    }

    fun subtractButton(view: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,ExpenseActivity::class.java)
        startActivity(intent)
    }
}