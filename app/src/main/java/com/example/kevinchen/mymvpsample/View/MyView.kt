package com.example.kevinchen.mymvpsample.View

/**
 * create by kevin in 2018/12/10
 * MVP MyView Interface
 * */

interface MyView {
    fun getMyModelLog()
    fun getMyStringText(string:String)
    fun getStringFromRes(string:String)
    fun sendRequest(string:String)
}