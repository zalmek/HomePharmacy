package com.example.home_pharmacy.network


import retrofit2.http.GET
import retrofit2.http.Path


interface HomePharmacyAPI {
    @GET("uuid")
    suspend fun listRepos(@Path("user") user: String?): List<Any>
}