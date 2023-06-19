package com.example.myapplication.service

import androidx.lifecycle.LiveData
import com.example.myapplication.model.Show
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET("shows")
    suspend fun getShows(): List<Show>

    companion object {
        var apiService: ApiService ?= null
        var BASE_URL = "https://api.tvmaze.com/"


        fun getInstance(): ApiService{
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}