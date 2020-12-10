package com.lk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent = Intent(this,SubjectInfo::class.java)
    }

    fun jumpInfoCLick(view: View) {
        var intent = Intent(this,SubjectInfo::class.java)
        when(view.id){
            nineteen.id-> {
                intent.putExtra("num",19)

            }
            twenty.id -> {
                var intent = Intent()
                intent.putExtra("num",19)

            }
            }
        startActivity(intent)
        }
    }
}