package com.app286.firstaid.fragments

import android.support.v4.app.Fragment
import com.app286.firstaid.base.BaseFragment
import com.app286.firstaid.base.BaseMvpModel
import com.app286.firstaid.mvpcontract.HomeFragmentPresenter
import com.app286.firstaid.mvpcontract.HomeFragmentView

/**
 * Created by zty
 *个人github地址：http://www.github.com/skyshenfu
 *日期：2017/11/10
 *版本：1.0.0
 *描述：
 */
class HomeFragment: BaseFragment(),HomeFragmentView{
    var presenter:HomeFragmentPresenter?=null
    override fun showProgress() {

    }

    override fun hideProgress() {
    }

    override fun showData(model: BaseMvpModel) {
    }

    override fun bindDestroy() {
        presenter!!.destroyMvpView()
    }


}