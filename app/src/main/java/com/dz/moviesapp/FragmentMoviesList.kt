package com.dz.moviesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMoviesList : Fragment() {

    private var recycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val layoutManager = GridLayoutManager(activity, 2, GridLayoutManager.VERTICAL, false)
        recycler = view.findViewById(R.id.grid_recycler)
        recycler?.layoutManager = layoutManager
        recycler?.adapter = MovieAdapter()


        view.findViewById<TextView>(R.id.movies_list_tv).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesDetails())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        (recycler?.adapter as? MovieAdapter)?.apply {
            bindMovies(MoviesDataSource().getMovies())
        }
    }
}