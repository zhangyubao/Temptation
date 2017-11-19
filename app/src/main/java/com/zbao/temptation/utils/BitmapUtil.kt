package com.zbao.temptation.utils

import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.support.annotation.RequiresApi

/**
 * Created by ZhangYuBao on 2017/11/18.
 */
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun blurBitmap(context: Context, bitmap: Bitmap): Bitmap {
    val outBitmap = Bitmap.createBitmap(getScreenWidth(context), getScreenHeight(context), Bitmap.Config.ARGB_8888)
    val rs = RenderScript.create(context)
    val blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs))
    val allIn = Allocation.createFromBitmap(rs, bitmap)
    val allOut = Allocation.createFromBitmap(rs, outBitmap)
    //设定模糊度(注：Radius最大只能设置25.f)
    blurScript.setRadius(15f)
    blurScript.setInput(allIn)
    blurScript.forEach(allOut)
    allOut.copyTo(outBitmap)
    rs.destroy()
    return outBitmap
}