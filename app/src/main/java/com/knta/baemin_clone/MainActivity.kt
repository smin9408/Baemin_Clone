package com.knta.baemin_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.knta.baemin_clone.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvents()
        setUpValues()

    }


    fun setUpEvents() {


    }

    fun setUpValues() {

        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

//        도전 과제 - 치킨 가게목록 추가 시에는, offScreenLimit = 3 설정 해줘야 정상 작동.


        mainTabLayout.setupWithViewPager( mainViewPager )

    }
}