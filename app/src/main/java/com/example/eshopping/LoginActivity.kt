package com.example.eshopping

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var uname=findViewById<EditText>(R.id.uid)
        var pwd=findViewById<EditText>(R.id.upwd)
        var login=findViewById<Button>(R.id.btnlogin)
        var regi=findViewById<TextView>(R.id.txtreg)

        regi.setOnClickListener {
            var intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        login.setOnClickListener {
            if(uname.text.toString().equals("Admin")&&pwd.text.toString().equals("admin"))
            {
                var pref=getSharedPreferences("pref", Context.MODE_PRIVATE)
                var edit=pref.edit()
                edit.putString("name",uname.text.toString())
                edit.commit()
                var intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                Toast.makeText(this,"Invalid UserName or Password", Toast.LENGTH_LONG).show()
            }
        }

    }
}
