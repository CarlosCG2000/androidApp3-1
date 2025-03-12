package es.upsa.a0_curso_3_app_en_1.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    //'suspend' para que sea  una corrutina
    @GET("/api/ab9e879023c702cc77af432687850fc2/search/{name}")
    suspend fun getSuperheroes( @Path("name") superheroName:String ):Response<SuperHeroDataResponse>
}