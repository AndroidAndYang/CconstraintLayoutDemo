package com.yjz.demo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 相对定位
        relative.setOnClickListener {
            start(RelativeActivity().javaClass)
        }
        // 角度定位
        angel.setOnClickListener {
            start(AngleActivity().javaClass)
        }
        // 边距和偏移
        margin.setOnClickListener {
            start(MarginActivity().javaClass)
        }
        // 尺寸约束
        size.setOnClickListener {
            start(SizeActivity().javaClass)
        }
        // 链
        chain.setOnClickListener {
            start(ChainActivity().javaClass)
        }
        // 辅助
        assist.setOnClickListener {
            start(AssistActivity().javaClass)
        }
    }

    private fun start(target : Class<Any>){
        val intent = Intent(this,target)
        startActivity(intent)
    }
}