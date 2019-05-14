package com.example.projeto1.Activities

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.View
import com.example.projeto1.R
import com.example.projeto1.Services.dp

import kotlinx.android.synthetic.main.activity_boulder.*
import kotlinx.android.synthetic.main.content_boulder.*

class BoulderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boulder)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val params = infoLayout.layoutParams
        params.height = displayMetrics.heightPixels - 24.dp
        infoLayout.layoutParams = params


        backBtn.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        return super.onCreateView(name, context, attrs)
    }

}
