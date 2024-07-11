package com.dz.moviesapp.presentation.view.moviesList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dz.moviesapp.R
import com.dz.moviesapp.domain.models.Movie

class MovieAdapter() :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movieList = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.onBind(movieList[position])
    }

    fun bindMovies(newMovies: List<Movie>) {
        movieList = newMovies
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTV: TextView = itemView.findViewById(R.id.movie_name_tv)
        private val timingTV: TextView = itemView.findViewById(R.id.timing_tv)
        private val imageIV: ImageView = itemView.findViewById(R.id.poster)
        private val genresTV: TextView = itemView.findViewById(R.id.tag_tv)
        private val reviewsTV: TextView = itemView.findViewById(R.id.reviews_tv)
        private val pgTV: TextView = itemView.findViewById(R.id.pg_tv)
        private val likeIV: ImageView = itemView.findViewById(R.id.like)
        private val star1TV: ImageView = itemView.findViewById(R.id.star1)
        private val star2TV: ImageView = itemView.findViewById(R.id.star2)
        private val star3TV: ImageView = itemView.findViewById(R.id.star3)
        private val star4TV: ImageView = itemView.findViewById(R.id.star4)
        private val star5TV: ImageView = itemView.findViewById(R.id.star5)

        fun onBind(movie: Movie) {
            nameTV.text = movie.name
            val timingText = "${movie.timing} MIN"
            timingTV.text = timingText
            imageIV.setImageResource(movie.image)
            genresTV.text = movie.genres.toString()
            val reviewsText = "${movie.reviews} REVIEWS"
            reviewsTV.text = reviewsText
            val pgText = "${movie.parentalGuidance}+"
            pgTV.text = pgText
            likeIV.setImageResource(if (movie.isLiked) R.drawable.red_like_icon else R.drawable.like_icon)
            star1TV.setImageResource(if (movie.rating >= 1) R.drawable.star_icon else R.drawable.star_icon_gray)
            star2TV.setImageResource(if (movie.rating >= 3) R.drawable.star_icon else R.drawable.star_icon_gray)
            star3TV.setImageResource(if (movie.rating >= 5) R.drawable.star_icon else R.drawable.star_icon_gray)
            star4TV.setImageResource(if (movie.rating >= 7) R.drawable.star_icon else R.drawable.star_icon_gray)
            star5TV.setImageResource(if (movie.rating >= 9) R.drawable.star_icon else R.drawable.star_icon_gray)
        }
    }
}