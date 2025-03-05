package es.upsa.curso_3_app_1.sintaxis

fun main(){
    var name:String? = null

    println(name?.length)

    println(name?.length ?: "name is null") // elvis operator si da el valor no es nulo se devuelve sino

    // println(name!!.length)
}