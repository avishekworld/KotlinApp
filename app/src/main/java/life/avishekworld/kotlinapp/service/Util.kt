package life.avishekworld.kotlinapp.service

import android.util.Log

class Util{
    val TAG = "Util"

    fun doSomeWork(){
        val name = "avishek"
        log("name is  $name")

        var list = 1..20
        var evenList = list.filter { it % 2 == 0 }

        evenList.forEach { x-> log(x.toString()) }
    }

    private fun log(msg:String){
        Log.d(TAG,msg)
    }
}