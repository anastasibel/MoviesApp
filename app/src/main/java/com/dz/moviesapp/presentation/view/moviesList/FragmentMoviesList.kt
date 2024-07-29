package com.dz.moviesapp.presentation.view.moviesList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dz.moviesapp.R
import com.dz.moviesapp.data.repository.MoviesRepositoryImpl
import com.dz.moviesapp.presentation.view.moviesDetails.FragmentMoviesDetails
import com.dz.moviesapp.presentation.viewModel.MovieViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class FragmentMoviesList : Fragment() {

    private val viewModel by viewModels<MovieViewModel>()
    private var recycler: RecyclerView? = null
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        adapter = MovieAdapter()

        val layoutManager = GridLayoutManager(activity, 2, GridLayoutManager.VERTICAL, false)
        recycler = view.findViewById(R.id.grid_recycler)
        recycler?.layoutManager = layoutManager
        recycler?.adapter = adapter

        view.findViewById<TextView>(R.id.movies_list_tv).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesDetails())
                .addToBackStack(null)
                .commit()
        }

        viewModel.movieList.onEach {
            adapter.bindMovies(it)
        }.launchIn(lifecycleScope)

    }

}