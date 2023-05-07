package com.example.stockpredictionproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stockpredictionproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainNav.setOnItemSelectedListener{ item ->
            val transaction = supportFragmentManager.beginTransaction()
            when(item.itemId){
                R.id.home_nav -> transaction.replace(R.id.main_framelayout,SearchFragment())
                R.id.bookmark_nav -> transaction.replace(R.id.main_framelayout,BookmarkFragment())
                R.id.mypage_nav -> transaction.replace(R.id.main_framelayout,MyPageFragment())
            }
            transaction.commitAllowingStateLoss()
            true
        }


    }
}