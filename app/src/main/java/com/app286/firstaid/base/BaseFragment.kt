package com.app286.firstaid.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by zty
 *个人github地址：http://www.github.com/skyshenfu
 *日期：2017/11/10
 *版本：1.0.0
 *描述：
 */
abstract class BaseFragment: Fragment() {
    override fun onDestroy() {
        super.onDestroy()
    }
    abstract fun bindDestroy()

}