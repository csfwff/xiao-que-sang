package com.xiamo.xiaoquesang.ui

import android.view.View
import com.xiamo.xiaoquesang.R
import com.xiamo.xiaoquesang.common.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : BaseActivity() , View.OnClickListener{
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        submitImg.setOnClickListener(this)
        headImg.setOnClickListener(this)
        commentLl.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.submitImg ->startActivity<SubmitActivity>()
            R.id.headImg ->startActivity<MineActivity>()
            R.id.commentLl->startActivity<CommentActivity>()
        }
    }
}
