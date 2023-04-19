package com.example.customlistview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var mylist= mutableListOf<Model>()

        ///lets add images,title and description
        mylist.add(Model("Moon","This is a moon",R.drawable.img))
        mylist.add(Model("Clouds","These are clouds",R.drawable.img_1))
        mylist.add(Model("Blue sky","This is a blue sky",R.drawable.img_2))
        mylist.add(Model("Sunrise","This is  sunrise",R.drawable.img_3))
        mylist.add(Model("Wallpaper","This is a wallpaper",R.drawable.img_4))
        mylist.add(Model("Wallpaper","This is a wallpaper",R.drawable.img_6))

        listview.adapter=MyAdapter(this,R.layout.row,mylist)
    }
}