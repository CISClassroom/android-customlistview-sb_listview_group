package com.example.customlistview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.example.customlistview.Model.Students
import com.example.customlistview.R

public class StudentAdapter (var mCtx: Context,
                             var resource:Int,
                             var items:List<Students>)
    : ArrayAdapter<Students>(mCtx,resource,items){
    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup): View {
        val layout:LayoutInflater = LayoutInflater.from(mCtx)

        val v: View = layout.inflate(resource,null)
        val icon: ImageView = v.findViewById(R.id.imageView)
        val name: TextView = v.findViewById(R.id.textView5)
        val id: TextView = v.findViewById(R.id.textView6)

        val students:Students = items[position]

        name.text = students.name
        id.text = students.id
        icon.setImageDrawable(mCtx.getDrawable(students.icon))
        return v

    }
}

//var => change value
//val => final