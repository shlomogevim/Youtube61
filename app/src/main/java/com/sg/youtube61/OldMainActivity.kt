package com.sg.youtube61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class OldMainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var youtubeVideos = Vector<youTubeVideos>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  title = "KotlinApp"
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)*/
        /*youtubeVideos.add(youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/X7SiuQxhAjg\" frameborder=\"0\" allowfullscreen></iframe>"))*/

val piki33="https://www.facebook.com/wanderly.fernandes.7/videos/7509345516229"

            val piki1="https://www.youtube.com/embed/KyJ71G2UxTQ"
            val piki2="https://www.youtube.com/embed/ayjzgSwtzbY"

            val piki4="src=\"https://connect.facebook.net/he_IL/sdk.js#xfbml=1&version=v15.0&appId=368778390494650&autoLogAppEvents=1\" nonce=\"qzxqXEpT\"></script>"


          //<iframe width="885" height="498" src="https://www.youtube.com/embed/ayjzgSwtzbY" title="מוזיקה עדינה, מרגיעה את מערכת העצבים ומשמחת את הנשמה - מוזיקה מרפאת ללב ולכלי הדם" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

         val piki3="https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fwww.facebook.com%2Fwanderly.fernandes.7%2Fvideos%2F750934551622922%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>"
     //"<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fwww.facebook.com%2Fwanderly.fernandes.7%2Fvideos%2F750934551622922%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>"


        youtubeVideos.add(youTubeVideos
            ("<iframe width=\"100%\" height=\"100%\" src=$piki2 frameborder=\"0\" allowfullscreen></iframe>"))


       val  piki44="<iframe src=\"https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2Fwanderly.fernandes.7%2Fvideos%2F750934551622922%2F&width=500&show_text=false&appId=368778390494650&height=375\" width=\"500\" height=\"375\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>"
       val  piki45="<iframe src=\"https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2Fwanderly.fernandes.7%2Fvideos%2F750934551622922%2F&width=500&show_text=false&appId=368778390494650\" width=\"100%\" height=\"100%\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>"


        youtubeVideos.add(youTubeVideos(piki45))

     /*   youtubeVideos.add(youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>"))*/

        youtubeVideos.add(youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen>lt;/iframe>"))
        youtubeVideos.add(youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>"))
        youtubeVideos.add(youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>"))
      /*  val videoAdapter = OldVideoAdapter(youtubeVideos)
        recyclerView.adapter = videoAdapter*/
    }
}