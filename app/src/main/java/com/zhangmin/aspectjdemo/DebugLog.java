package com.zhangmin.aspectjdemo;

import android.util.Log;

/**
 * @author: ZhangMin
 * @date: 2017/5/11 13:58
 * @desc:
 */
public class DebugLog {

    private DebugLog() {}

    /**
     * Send a debug log message
     *
     * @param tag Source of a log message.
     * @param message The message you would like logged.
     */
    public static void log(String tag, String message) {
        Log.d(tag, message);
    }
}