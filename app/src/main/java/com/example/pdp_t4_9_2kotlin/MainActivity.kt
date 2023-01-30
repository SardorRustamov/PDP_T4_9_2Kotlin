package com.example.pdp_t4_9_2kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var facebook:Button
    private lateinit var youtube:Button
    private lateinit var twitter:Button

    lateinit var lottie_android: View
    lateinit var lottie_youtube:View
    lateinit var lottie_twitter:View
    lateinit var lottie_facebook:View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fv()

        clickButton()
    }

    private fun fv() {
        facebook = findViewById<Button>(R.id.facebook_btn)
        youtube = findViewById<Button>(R.id.youtube_btn)
        twitter = findViewById<Button>(R.id.twitter_btn)
        lottie_android = findViewById<View>(R.id.lottie_android)
        lottie_twitter = findViewById<View>(R.id.lottie_twitter)
        lottie_facebook = findViewById<View>(R.id.lottie_facebook)
        lottie_youtube = findViewById<View>(R.id.lottie_youtube)
    }

    private fun clickButton() {
        facebook.setOnClickListener(View.OnClickListener { view: View? ->
            lottie_twitter.visibility = View.GONE
            lottie_android.visibility = View.GONE
            lottie_facebook.visibility = View.VISIBLE
            lottie_youtube.visibility = View.GONE
        })
        youtube.setOnClickListener(View.OnClickListener { view: View? ->
            lottie_twitter.visibility = View.GONE
            lottie_android.visibility = View.GONE
            lottie_facebook.visibility = View.GONE
            lottie_youtube.visibility = View.VISIBLE
        })
        twitter.setOnClickListener(View.OnClickListener { view: View? ->
            lottie_twitter.visibility = View.VISIBLE
            lottie_android.visibility = View.GONE
            lottie_facebook.visibility = View.GONE
            lottie_youtube.visibility = View.GONE
        })
    }

}