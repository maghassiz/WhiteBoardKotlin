package com.magha.whiteboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvas = MyCanvasView(this)
        setContentView(R.layout.activity_main)

        masterView.addView(myCanvas)

        btDraw.setOnClickListener{
            myCanvas.drawCanvas()
        }

        btErase.setOnClickListener{
            myCanvas.eraseDraw()
        }
    }
}
