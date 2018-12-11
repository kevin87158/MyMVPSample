package com.example.kevinchen.mymvpsample.Presenter

import android.content.Context
import android.util.Log
import com.example.kevinchen.mymvpsample.Model.MyModel
import com.example.kevinchen.mymvpsample.View.MyView


/**
 * create by kevin in 2018/12/10
 * MyPresenterImp 實作 MyPresenter
 * 宣告fun，並透過View fun傳遞model參數並於Activity實作
 * */

class MyPresenterImp(myView:MyView,myModel:MyModel){
    val TAG  = this@MyPresenterImp.javaClass.simpleName
    var myView  = myView
    var myModel = myModel

    fun getMyModelLog(){
        myModel.getMyModelLog()
    }

    fun getMyStringText(){
        myView.getMyStringText(myModel.getMyStringText())
    }

    fun getStringFromRes(mContext:Context){
        myView.getStringFromRes(myModel.getStringFromRes(mContext))
    }

    fun sendRequest(){
        myView.sendRequest(myModel.sendRequest())
    }

}
