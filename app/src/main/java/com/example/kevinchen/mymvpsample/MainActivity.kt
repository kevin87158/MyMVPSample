package com.example.kevinchen.mymvpsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kevinchen.mymvpsample.Model.MyModel
import com.example.kevinchen.mymvpsample.Presenter.MyPresenterImp
import com.example.kevinchen.mymvpsample.View.MyView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * create by kevin in 2018/12/10
 * MVP Sample .This sample is same with MyMVCSample but different construct
 * */

//於MainActivity實作MyView
//並在觸發時透過MyPresenter呼叫MyView的function
class MainActivity : AppCompatActivity(), MyView{
    val TAG  = this@MainActivity.javaClass.simpleName
    var myPresenterImp =  MyPresenterImp(this, MyModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(myPresenterImp== null){
            myPresenterImp = MyPresenterImp(this, MyModel())
        }

        myPresenterImp.getMyModelLog()
        myPresenterImp.getMyStringText()
        myPresenterImp.getStringFromRes(this)
        myPresenterImp.sendRequest()

    }


    //MyView
    override fun getMyModelLog() {
        Log.i(TAG,"getMyModelLog")
    }

    override fun getMyStringText(string: String) {
        Log.i(TAG,"getMyStringText: $string")
        msgTv.text  = string
    }

    override fun getStringFromRes(string: String) {
        Log.i(TAG,"getStringFromRes: $string")
        msgTv.text  = string
    }

    override fun sendRequest(string: String) {
        Log.i(TAG,"sendRequest: $string")
        msgTv.text  = string
    }

}
