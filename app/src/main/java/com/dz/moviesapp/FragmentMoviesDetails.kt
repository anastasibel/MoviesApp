package com.dz.moviesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMoviesDetails : Fragment() {

    private var actorsRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        actorsRecycler = view.findViewById(R.id.actors_recycler)
        actorsRecycler?.layoutManager = layoutManager
        actorsRecycler?.adapter = ActorAdapter()
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        (actorsRecycler?.adapter as? ActorAdapter)?.apply {
            bindActors(ActorsDataSource().getActors())
        }
    }

}