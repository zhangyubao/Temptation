package com.zbao.temptation

import com.zbao.temptation.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun initData(): Boolean {
        return true
    }

    override fun getLayout(): Int {
      return R.layout.activity_main
    }

    override fun initView() {

    }


}
