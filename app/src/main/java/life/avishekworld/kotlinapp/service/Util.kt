package life.avishekworld.kotlinapp.service

import android.util.Log

class Util{

    companion object {
        val TAG = Util::class.java.simpleName
    }

    private fun log(msg:String){
        Log.d(TAG,msg)
    }
}