package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentsAdapter: FragmentsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentsAdapter = FragmentsAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = fragmentsAdapter
        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        val titles = arrayOf("Inicio", "Carrito", "Favoritos")
        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, pos ->
            tab.text = titles[pos]
        }.attach()
    }
}