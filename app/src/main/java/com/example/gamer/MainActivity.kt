package com.example.gamer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.login)
        val btn = findViewById<View>(R.id.buttongoogle)
        val btn1 = findViewById<View>(R.id.buttonfacebook)
        //val btn2 = findViewById<View>(R.id.policy)


        btn.setOnClickListener {
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }
        btn1.setOnClickListener {
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }

}
}


class register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registre)

        val btn2 = findViewById<View>(R.id.policy)


        btn2.setOnClickListener {
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }


    }
}