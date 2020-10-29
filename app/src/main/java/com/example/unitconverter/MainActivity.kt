package com.example.unitconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val recyclerView = dataBinding.rvUnitList
        val manager = GridLayoutManager(applicationContext, 3)
        recyclerView.layoutManager = manager
        recyclerView.adapter = UnitsAdapter()
    }
}