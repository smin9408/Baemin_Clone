package com.knta.baemin_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.knta.baemin_clone.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setUpEvents()
        setValues()
    }

    fun setUpEvents(){

    }

    fun setValues(){

    }

}