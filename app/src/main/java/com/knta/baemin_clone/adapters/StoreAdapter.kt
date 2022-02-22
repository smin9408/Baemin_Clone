package com.knta.baemin_clone.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.knta.baemin_clone.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}