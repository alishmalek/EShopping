package com.example.eshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var reg=findViewById<TextView>(R.id.txtreg)

        reg.setOnClickListener {
            var intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
