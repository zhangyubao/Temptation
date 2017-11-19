package com.zbao.temptation

import android.graphics.drawable.AnimationDrawable
import com.zbao.temptation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_flash.*

/**
 * Created by magq on 2017/10/28.
 */
class FlashActivity : BaseActivity() {


    override fun getLayout(): Int {
        return R.layout.activity_flash
    }

    override fun initView() {
        val animation = iv_calling.drawable as AnimationDrawable
        animation.isOneShot = false
        animation.start()
    }

    override fun initData(): Boolean {
        return true
    }
}