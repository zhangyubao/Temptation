package com.zbao.temptation.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import com.zbao.temptation.R

/**
 *
 * Activity基类
 *
 * Created by magq on 2017/10/28.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
        if (!initData()) {
            return
        }
        setContentView(getLayout())
        initView()
    }


    override fun onDestroy() {
        super.onDestroy()
        butterknife.Unbinder { }
    }


    /**
     * 添加布局
     */
    open abstract fun getLayout(): Int

    /**
     * 初始化布局View
     */
    open abstract fun initView()


    /**
     * 数据初始化
     */
    open abstract fun initData(): Boolean

}