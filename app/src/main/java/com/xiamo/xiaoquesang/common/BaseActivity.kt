package com.xiamo.xiaoquesang.common

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ktx.immersionBar

abstract class BaseActivity :AppCompatActivity(){
    protected var preferences: SharedPreferences? = null
    protected var editor: SharedPreferences.Editor? = null
    private var mInputMethodManager: InputMethodManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())


        preferences = getSharedPreferences(Preference, Context.MODE_PRIVATE)
        editor = preferences!!.edit()
        immersionBar {
            statusBarColor(android.R.color.white)
            statusBarDarkFont(true)
            fitsSystemWindows(true)
            keyboardEnable(true)
            navigationBarColor(android.R.color.white)
        }

        initView()
    }

    protected abstract fun getLayoutId():Int
    protected abstract fun initView()
    public fun hideKeyBoard(){
        val localView = currentFocus
        if (this.mInputMethodManager == null) {
            this.mInputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        }
        if (localView != null) {
            this.mInputMethodManager?.hideSoftInputFromWindow(localView.windowToken, 2)
        }

    }

}