package com.example.buddyup

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.WindowInsets
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Hide system bars for fullscreen experience
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.decorView.setOnApplyWindowInsetsListener { v, insets ->
            val systemBars = insets.getInsets(WindowInsets.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Play video
        val videoView: VideoView = findViewById(R.id.splashVideoView)
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.splash_video)
        videoView.setVideoURI(videoUri)

        videoView.setOnCompletionListener {
            // Navigate to the next activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        videoView.start()
    }
}
