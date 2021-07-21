package com.example.foodhandbook.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodhandbook.R
import com.example.foodhandbook.viewmodel.CategoryAdapter



class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CategoryAdapter.ViewHolder>?= null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = GridLayoutManager(this,3,RecyclerView.VERTICAL,false)


        var recyclerView : RecyclerView
        recyclerView = findViewById(R.id.recycelerView)



        recyclerView.layoutManager = layoutManager

        adapter = CategoryAdapter()
        recyclerView.adapter = adapter


    }



}