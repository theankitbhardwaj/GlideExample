package com.bhardwaj.glideexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageUrl = "https://media0.giphy.com/media/" +
                "3oEdva9BUHPIs2SkGk/"+
                "giphy.gif?cid=ecf05e473e7b3fac437824642b480c2dae61bdd649509736&rid=giphy.gif"

        val imageView: ImageView = findViewById(R.id.imageView)

        Glide.with(this)
                .load(imageUrl)
                .into(imageView)

    }
}
