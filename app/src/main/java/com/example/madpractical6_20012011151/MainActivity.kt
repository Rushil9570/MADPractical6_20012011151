package com.example.madpractical6_20012011151

import android.content.Intent
import android.media.MediaController2
import android.net.Uri
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController = MediaController(this)
        val uri: Uri= Uri.parse("android.resource://"+ packageName + "/"+R.raw.thestoryoflight)
        val video1=findViewById<VideoView>(R.id.videoview)
        video1.setMediaController(mediaController)
        mediaController.setAnchorView(video1)
        video1.setVideoURI(uri)
        video1.requestFocus()
        video1.start()

        val button=findViewById<FloatingActionButton>(R.id.fbutton)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply{ startActivity(this) }
        }
    }

}