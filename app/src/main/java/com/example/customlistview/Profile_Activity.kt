package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Profile_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_)
        //get data from activity
        val data = intent.getStringExtra("selecttedname")
        //val data = intent.getStringExtra("selecttedname")
        Toast.makeText(this,data, Toast.LENGTH_SHORT).show()
    }
}
