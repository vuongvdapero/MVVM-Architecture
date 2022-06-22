package com.example.loginnavigationmvvm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_list)

        val emailShow : TextView = findViewById(R.id.txtEmailShow)
        val passwordShow : TextView = findViewById(R.id.txtPasswordShow)
        val bundle = intent.extras
        if (bundle != null){
            val email = bundle.getString("email")
            val password = bundle.getString("password")
            emailShow.text = email
            passwordShow.text = password
        }
    }
}