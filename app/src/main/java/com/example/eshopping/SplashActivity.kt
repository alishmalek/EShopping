package com.example.eshopping

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var pref=getSharedPreferences("pref", Context.MODE_PRIVATE)
        var user=pref.getString("name","Not Login")

        thread(start = true) {
            Thread.sleep(3000)
            if(user.equals("Not Login")) {
                var intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
