package com.example.kevinchen.mymvpsample.Model

import android.content.Context
import android.util.Log
import com.example.kevinchen.mymvpsample.R

/**
 * create by kevin in 2018/12/10
 * MVP MyModel Interface
 * 資料儲存與處理
 * */
class MyModel {
    val TAG  = this@MyModel.javaClass.simpleName

    fun getMyModelLog(){
        Log.i(TAG,"getMyModelLog")
    }

    fun getMyStringText() :String{
        return "getMyStringText"
    }

    fun getStringFromRes(mContext: Context) :String{
        return mContext.getString(R.string.mvp_sample_text)
    }

    fun sendRequest() :String{
        return "sendRequest"
    }
}