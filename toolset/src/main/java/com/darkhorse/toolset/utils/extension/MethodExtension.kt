package com.darkhorse.toolset.utils.extension

import android.util.Log
import android.widget.Toast
import com.darkhorse.toolset.utils.AppManager

fun toast(msg: String) {
    Toast.makeText(AppManager.currentActivity(), msg, Toast.LENGTH_SHORT).show()
}

fun d(msg: String) {
    Log.d(AppManager.currentActivity().javaClass.name, msg)
}

fun e(msg: String) {
    Log.e(AppManager.currentActivity().javaClass.name, msg)
}

fun i(msg: String) {
    Log.i(AppManager.currentActivity().javaClass.name, msg)
}


fun v(msg: String) {
    Log.v(AppManager.currentActivity().javaClass.name, msg)
}

fun w(msg: String) {
    Log.w(AppManager.currentActivity().javaClass.name, msg)
}

