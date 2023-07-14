package com.hitema.movieapp.network

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.hitema.movieapp.R

const val M_TITLE = "extra_movie_title"

class MovieCardActivity : AppCompatActivity() {

    private lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_movie)

        title = findViewById(R.id.item_title)

        val extras = intent.extras

        if (extras != null) {
            populateDetails(extras)
        } else {
            finish()
        }
    }

    private fun populateDetails(extras: Bundle) {

        title.text = extras.getString(M_TITLE, "")
    }
}
