package com.app286.firstaid.mvpcontract

import android.content.Context
import com.app286.firstaid.base.BaseMvpModel
import com.app286.firstaid.base.BaseMvpPresenter
import com.app286.firstaid.base.BaseMvpPresenterImpl
import com.app286.firstaid.base.BaseMvpView

/**
 * Created by zty
 *个人github地址：http://www.github.com/skyshenfu
 *日期：2017/11/10
 *版本：1.0.0
 *描述：
 */
class HomeFragmentModel:BaseMvpModel(){

}
interface HomeFragmentView:BaseMvpView{

}
class HomeFragmentPresenter(context:Context,view:HomeFragmentView): BaseMvpPresenterImpl<HomeFragmentView>(context,view){
    val HomeFragmentModel by lazy {
        HomeFragmentModel()
    }
    
}