package com.example.myapplication

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface ApiUtil {

    @GET("shows")
    fun getShows(): LiveData<List<String>>
}