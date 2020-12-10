package com.lk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubjectInfo : AppCompatActivity() {

    var num:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_info)
        var bundle=intent.extras
        num= bundle?.getInt("num")!!
//        要实现携带参数跳转
        getSubjectTitle();
    }

    fun getSubjectTitle():String{
        when(num){
            19->title="给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。\n示例：给定一个链表: 1->2->3->4->5, 和 n = 2.当删除了倒数第二个节点后，链表变为 1->2->3->5.\n说明：给定的 n 保证是有效的。"

        }
        return ""
    }
}