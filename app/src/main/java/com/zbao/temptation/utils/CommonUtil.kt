package com.zbao.temptation.utils

import android.content.Context
import org.jetbrains.anko.windowManager


/**
 * Created by magq on 2017/11/18.
 */

/**
 * 获取屏幕宽度
 */
fun getScreenWidth(context: Context): Int {
    return context.windowManager.defaultDisplay.width
}

/**
 * 获取屏幕高度
 */
fun getScreenHeight(context: Context): Int {
    return context.windowManager.defaultDisplay.height
}