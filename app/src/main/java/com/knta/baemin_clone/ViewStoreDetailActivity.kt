package com.knta.baemin_clone

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import com.knta.baemin_clone.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setUpEvents()
        setValues()
    }

    fun setUpEvents() {

//        권한 관련 변수를, 화면이 만들어질 때 한 번만 세팅.
        val pl = object : PermissionListener {
            override fun onPermissionGranted() {

            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                Toast.makeText(this@ViewStoreDetailActivity, "통화 권한이 없습니다", Toast.LENGTH_SHORT)
                    .show()
            }

        }

        btnCall.setOnClickListener {

//            클릭될 때마다 만든 변수를 사용만 하는 걸로.
            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
        }

    }

    fun setValues() {

        Glide.with(this).load(mStoreData.logoImageURL).into(imgLogo)

        txtStoreName.text = mStoreData.name

        txtStoreNumber.text = mStoreData.phoneNum

        ratingBar.rating = mStoreData.rating.toFloat()

        txtRating.text = "(${mStoreData.rating})"
    }

}