package com.xiamo.xiaoquesang.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.xiamo.xiaoquesang.R
import com.xiamo.xiaoquesang.common.BaseActivity

class CommentActivity : BaseActivity() {
    override fun getLayoutId(): Int {
      return R.layout.activity_comment
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class QuickAdapter(datas:List<String>):BaseQuickAdapter<String,BaseViewHolder>(R.layout.activity_comment, datas){
        override fun convert(helper: BaseViewHolder, item: String?) {

        }
    }

}
