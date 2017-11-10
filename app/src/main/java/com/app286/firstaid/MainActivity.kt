package com.app286.firstaid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.app286.firstaid.base.BaseActivity
import com.app286.firstaid.base.BaseMvpModel
import com.app286.firstaid.mvpcontract.MainModel
import com.app286.firstaid.mvpcontract.MainPresenter
import com.app286.firstaid.mvpcontract.MainView
import com.app286.firstaid.utils.ProgressUtils

class MainActivity : BaseActivity() ,MainView,View.OnClickListener{
    override fun textchange() {
        textView!!.setText(R.string.app_name)
    }
    var button: Button?=null
    var rxPostButton: Button?=null
    var rxReceiveButton: Button?=null
    var netButton: Button?=null
    var textView: TextView?=null
    var presenter:MainPresenter?=null
    var progressUtils:ProgressUtils?=null

    override fun onClick(v: View?) {
        when (v!!.id){
            R.id.button_change->presenter!!.loadData()
            R.id.button_rxbuspost->presenter!!.testRxbusPost()
            R.id.button_rxbusreceive->presenter!!.testRxbusReceive()
            R.id.button_net->presenter!!.testNetRequest()
        }

    }

    override fun bindDestroy() {
        presenter!!.destroyMvpView()
    }

    override fun showProgress() {
        progressUtils!!.progressShow()
    }

    override fun hideProgress() {
        progressUtils!!.progressDismiss()
    }

    override fun showData(model: BaseMvpModel) {
        textView!!.setText("内容"+(model as MainModel).numberStr)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.button_change)
        rxPostButton=findViewById(R.id.button_rxbuspost)
        rxReceiveButton=findViewById(R.id.button_rxbusreceive)
        netButton=findViewById(R.id.button_net)
        textView= findViewById(R.id.textview)
        button!!.setOnClickListener(this)
        rxPostButton!!.setOnClickListener(this)
        rxReceiveButton!!.setOnClickListener(this)
        netButton!!.setOnClickListener(this)

        progressUtils= ProgressUtils(this)
        presenter=MainPresenter(this,this)
    }
}
