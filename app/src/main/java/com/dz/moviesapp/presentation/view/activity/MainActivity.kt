package com.dz.moviesapp.presentation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dz.moviesapp.R
import com.dz.moviesapp.presentation.view.moviesList.FragmentMoviesList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesList())
                .commit()
    }
}