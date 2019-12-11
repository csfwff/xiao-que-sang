package com.xiamo.xiaoquesang.common.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.xiamo.xiaoquesang.R

class TitleBar:RelativeLayout{

    private var mOnBackClickListener :OnBackClickListener?=null

    @JvmOverloads constructor(
        context: Context,
        attrs:AttributeSet?=null,
        defStyleAttr:Int = 0
    ):super(context, attrs,defStyleAttr){
        attrs.let{

        }
    }

    init {
        LayoutInflater.from(context).inflate(R.layout.widget_title_bar,this,true)
    }

    fun setOnBackclickListener( listener: OnBackClickListener){
        if(mOnBackClickListener==null) mOnBackClickListener = listener
    }

    interface OnBackClickListener{
        fun onBackClick()
    }
}