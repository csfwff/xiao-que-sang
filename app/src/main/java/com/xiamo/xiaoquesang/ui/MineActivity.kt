package com.xiamo.xiaoquesang.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gyf.immersionbar.ktx.immersionBar
import com.xiamo.xiaoquesang.R
import com.xiamo.xiaoquesang.common.BaseActivity

class MineActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_mine
    }

    override fun initView() {
        immersionBar {
            statusBarColor(android.R.color.transparent)
            statusBarDarkFont(false)
            fitsSystemWindows(false)
            keyboardEnable(true)
            navigationBarColor(android.R.color.white)
        }
    }
}
