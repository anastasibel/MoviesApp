package com.dz.moviesapp.presentation.view.moviesList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.dz.moviesapp.R
import com.dz.moviesapp.domain.model.Movie

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
        notifyDataSetChanged()
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTV: TextView = itemView.findViewById(R.id.movie_name_tv)
        private val timingTV: TextView = itemView.findViewById(R.id.timing_tv)
        private val imageIV: ImageView = itemView.findViewById(R.id.poster)
        private val genresTV: TextView = itemView.findViewById(R.id.tag_tv)
        private val reviewsTV: TextView = itemView.findViewById(R.id.reviews_tv)
        private val pgTV: TextView = itemView.findViewById(R.id.pg_tv)
        private val star1TV: ImageView = itemView.findViewById(R.id.star1)
        private val star2TV: ImageView = itemView.findViewById(R.id.star2)
        private val star3TV: ImageView = itemView.findViewById(R.id.star3)
        private val star4TV: ImageView = itemView.findViewById(R.id.star4)
        private val star5TV: ImageView = itemView.findViewById(R.id.star5)

        fun onBind(movie: Movie) {
            val nameText = movie.name ?: (movie.enName ?: movie.alternativeName)
            nameTV.text = nameText
            val timing = movie.movieLength
            val timingText = if (timing != null) "$timing MIN" else null
            timingTV.text = timingText
            imageIV.load(movie.poster?.url)
            val genresText = if (movie.genres != null) movie.genres.map { it.name }.toString().trim('[', ']') else null
            genresTV.text = genresText
            val reviews = movie.votes?.imdb
            val reviewsText = if (reviews != null) "$reviews REVIEWS" else null
            reviewsTV.text = reviewsText
            val pg = movie.ageRating
            val pgText = if (pg != null) "$pg+" else null
            pgTV.text = pgText
            pgTV.visibility = if (pgText == null) View.INVISIBLE else View.VISIBLE
            if (movie.rating?.imdb != null) {
                star1TV.setImageResource(if (movie.rating.imdb >= 1) R.drawable.star_icon else R.drawable.star_icon_gray)
                star2TV.setImageResource(if (movie.rating.imdb >= 3) R.drawable.star_icon else R.drawable.star_icon_gray)
                star3TV.setImageResource(if (movie.rating.imdb >= 5) R.drawable.star_icon else R.drawable.star_icon_gray)
                star4TV.setImageResource(if (movie.rating.imdb >= 7) R.drawable.star_icon else R.drawable.star_icon_gray)
                star5TV.setImageResource(if (movie.rating.imdb >= 9) R.drawable.star_icon else R.drawable.star_icon_gray)
            }
        }
    }
}