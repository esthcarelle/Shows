package com.example.myapplication.viewModel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.Show
import com.example.myapplication.service.ApiService
import kotlinx.coroutines.launch

class ShowViewModel : ViewModel() {
    var showList : List<Show> = mutableListOf<Show>()

    init {
        getShows()
    }

    private fun getShows() {
        viewModelScope.
            launch {
                var apiService = ApiService.getInstance()

                showList = apiService.getShows()
                Log.e(TAG, "getShows: "+showList)
            }
        }
}