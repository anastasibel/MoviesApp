package com.dz.moviesapp.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dz.moviesapp.data.api.RetrofitInstance
import com.dz.moviesapp.domain.model.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieViewModel(private val retrofitInstance: RetrofitInstance) : ViewModel() {

    private val _movieList = MutableStateFlow<List<Movie>>(emptyList())

    val movieList: StateFlow<List<Movie>> = _movieList.asStateFlow()

    init {
        viewModelScope.launch {
            _movieList.value = retrofitInstance.api.getList().docs
        }
    }

}