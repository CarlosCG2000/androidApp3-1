package es.upsa.curso_3_app_1.sintaxis

val flag = false

fun main(){

    funcionParametros("Pepe", 19)  // Se puede llamar a funciones de otros ficheros
    condicionIf()
}

fun condicionIf(){
    val name = "Gustavo"

    if(name.lowercase() == "gustavo" || flag)
        println("Verdadero")
     else if (name == "Maria")
        println("nop, es Maria")
    else
        println("Falso")
}
