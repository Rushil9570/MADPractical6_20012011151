package com.example.madpractical6_20012011151

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId ="8dL4zATe0mg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview=findViewById<WebView>(R.id.webview)
        val settings = mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")

        val button=findViewById<FloatingActionButton>(R.id.fbutton1)
        button.setOnClickListener {
            Intent(this, MainActivity::class.java).apply { startActivity(this) }
        }
    }
}