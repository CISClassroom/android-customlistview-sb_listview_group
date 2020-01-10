package com.example.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customlistview.Adapter.StudentAdapter
import com.example.customlistview.Model.Students
import kotlinx.android.synthetic.main.activity_custom_list.*


class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var Students:Students =
            Students("Zak Sapthawee","603410203-8",R.drawable.zakprofile)

        var  students2 = mutableListOf<Students>()

        students2.add(Students)
        students2.add(Students("Aom Maneerat","603430321-0",R.drawable.studentzak))


        var  listView :ListView = findViewById(R.id.Listview)
        listView.adapter = StudentAdapter(this,R.layout.listitem_student,students2)

        Listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, position.toString(), Toast.LENGTH_SHORT).show()

            //Intent
            var profile = Intent(this,Profile_Activity::class.java)
            startActivity(profile)

        }

    }
}
