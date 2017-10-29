package com.zbao.temptation.utils

import android.content.Context
import android.widget.Toast
import com.zbao.temptation.TTApplication

/**
 * 吐司管理工具类
 * <p>
 * Created by zhangyubao on 2017/10/29.
 */

@JvmOverloads
fun showToast(context: Context, msg: String = "显示内容") {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}

fun showToast(msg: String = "显示内容") {
    Toast.makeText(TTApplication.getApplication(), msg, Toast.LENGTH_SHORT).show()
}
