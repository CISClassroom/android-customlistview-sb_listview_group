package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.customlistview.Adapter.Student_Adapter
import com.example.customlistview.Model.Student

class activity_custom_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var student: Student =
            Student("Mickey", "001", R.mipmap.ic_launcher)

        var students = mutableListOf<Student>()

        students.add(student)
        students.add((Student("Minie", "002", R.mipmap.ic_launcher)))

        var listView: ListView = findViewById(R.id.customlistview)
        listView.adapter = Student_Adapter(
            this,
            R.layout.listitem_student, students
        )

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, position.toString(),
                Toast.LENGTH_SHORT).show()

        }
    }

}
