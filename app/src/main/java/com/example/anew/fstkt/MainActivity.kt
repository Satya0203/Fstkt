package com.example.anew.fstkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1:Button=findViewById(R.id.b1)
        val et1:EditText=findViewById(R.id.et1)
        val tv1:TextView=findViewById(R.id.tv1)

        b1.setOnClickListener(View.OnClickListener {
            tv1.setText(et1.text.toString())
        })
    }
}
