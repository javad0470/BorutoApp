package com.example.borutoapp.data.remote

import com.example.borutoapp.domain.model.ApiResponse
import com.example.borutoapp.util.Constants.BASE_URL
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1,
    ): ApiResponse

    @GET("/boruto/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String,
    ): ApiResponse

/*    private val client = HttpClient {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 15_000
            connectTimeoutMillis = 15_000
        }
    }

    suspend fun getAllHeroes(
        page: Int = 1,
    ): ApiResponse = client
        .get("$BASE_URL/boruto/heroes") {
            parameter("page", page)
        }*/
}