package es.upsa.a0_curso_3_app_en_1.app.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response:String,
    @SerializedName("result") val superheroes:List<SuperHeroItemResponse>
)

data class SuperHeroItemResponse(
    @SerializedName("id") val superheroId:String,
    @SerializedName("name") val name:String
)
