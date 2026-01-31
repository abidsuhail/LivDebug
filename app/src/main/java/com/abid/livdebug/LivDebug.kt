package com.abid.livdebug

import android.util.Log

object LivDebug {

    /** Flag to check if LivDebug is initialized */
    private var isInitialized = false

    /** Should logs be sent in production? */
    private var enableProdLogs = false

    /**
     * Must be called to enable LivDebug
     * @param sendLogsInProd true if logs should work in production builds
     */
    fun init(sendLogsInProd: Boolean = false) {
        enableProdLogs = sendLogsInProd
        isInitialized = true
    }

    /**
     * @param msg log message
     * */
    fun Any.livDebug(msg: String) {
        if (!isInitialized) return  // do nothing if not initialized
        if (enableProdLogs) {
            Log.d("[${this::class.java.simpleName}]", msg)
        }
       // sendToServer(tag, msg, "ERROR")
    }

    /**
     * @param msg error message
     * */
    fun Any.livError(msg: String) {
        if (!isInitialized) return  // do nothing if not initialized
        Log.e("[${this::class.java.simpleName}]", msg)
        // sendToServer(tag, msg, "ERROR")
    }
}