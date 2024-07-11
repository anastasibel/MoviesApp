package com.dz.moviesapp.data

import com.dz.moviesapp.R
import com.dz.moviesapp.domain.models.Actor

class ActorsDataSource {
    fun getActors(): List<Actor> {
        return listOf(
            Actor(R.string.robert_downey_jr, R.drawable.photo_1),
            Actor(R.string.chris_evans, R.drawable.photo_2),
            Actor(R.string.mark_ruffalo, R.drawable.photo_3),
            Actor(R.string.chris_hemsworth, R.drawable.photo_4),
        )
    }
}