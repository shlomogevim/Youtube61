package com.sg.youtube61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import java.util.*

class MainActivity : AppCompatActivity() {

    private var youtubeVideos = Vector<youTubeVideos>()
    lateinit var      webView:WebView
    var currentVideoUrl=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView=findViewById(R.id.webView)
        webView.settings.javaScriptEnabled=true
        webView.webChromeClient=object :WebChromeClient(){

        }
        val piki1="https://www.youtube.com/embed/KyJ71G2UxTQ"

      //  currentVideoUrl="\"<iframe width=\\\"100%\\\" height=\\\"100%\\\" src=\\\"https://www\" +\n" +
      //          "                \".youtube.com/embed/y8Rr39jKFKU\\\" frameborder=\\\"0\\\" allowfullscreen>lt;/iframe>\")"
      //  currentVideoUrl="<iframe width=\"100%\" height=\"100%\" src=$piki1 frameborder=\"0\\\" allowfullscreen></iframe>\"
        webView.loadUrl(piki1)
        //webView.loadData(currentVideoUrl)






    }
}