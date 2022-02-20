package com.example.salary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onSaveButtonClick(view: View) {
        //Tomando informacion
        val name = findViewById<EditText>(R.id.name)
        val hours = findViewById<EditText>(R.id.hours)

        // intent para pasar datos

        val intent = Intent(this@MainActivity, data::class.java)
        intent.putExtra("Nombre", name.text.toString())
        intent.putExtra("Horas", hours.text.toString().toInt())

        startActivity(intent)


    }

}
