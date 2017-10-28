package com.zbao.temptation.utils

import android.content.Context
import android.widget.Toast

/**
 * 吐司管理工具类
 * <p>
 * Created by magq on 2017/10/29.
 */

@JvmOverloads
fun showToast(context: Context, msg: String = "显示内容") {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}
