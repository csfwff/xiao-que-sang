package com.xiamo.xiaoquesang.common.widget

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.xiamo.xiaoquesang.R
import kotlinx.android.synthetic.main.widget_title_bar.view.*

class TitleBar:RelativeLayout{

    private var mOnBackClickListener :OnBackClickListener?=null
    private var mOnRightClickListener :OnRightClickListener?=null

    @JvmOverloads constructor(
        context: Context,
        attrs:AttributeSet?=null,
        defStyleAttr:Int = 0
    ):super(context, attrs,defStyleAttr){
        attrs.let{
            val typedArray = context.obtainStyledAttributes(it,R.styleable.TitleBar)
            val title = typedArray.getString(R.styleable.TitleBar_title)
            val isBackShow = typedArray.getBoolean(R.styleable.TitleBar_isBackShow,true)
            val isRightShow = typedArray.getBoolean(R.styleable.TitleBar_isRightShow,false)
            val backSrc = typedArray.getDrawable(R.styleable.TitleBar_backImg)
            val rightSrc = typedArray.getDrawable(R.styleable.TitleBar_rightImg)
            typedArray.recycle()

            titleTv.text = title
            backImg.visibility = if (isBackShow) View.VISIBLE else View.INVISIBLE
            rightImg.visibility = if (isRightShow) View.VISIBLE else View.INVISIBLE

            backImg.setImageDrawable(backSrc)
            rightImg.setImageDrawable(rightSrc)


            backImg.setOnClickListener {
                if(mOnBackClickListener==null){
                    (context as Activity).finish()
                }else{
                    mOnBackClickListener!!.onBackClick()
                }
            }

            rightImg.setOnClickListener {
                if(mOnRightClickListener!=null){
                    mOnRightClickListener!!.onRightClick()
                }
            }
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

    fun setOnRightClickListener( listener: OnRightClickListener){
        if(mOnRightClickListener==null) mOnRightClickListener = listener
    }

    interface OnRightClickListener{
        fun onRightClick()
    }
}