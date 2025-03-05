package es.upsa.curso_3_app_1.sintaxis

fun main() {
    var name: String = "Carlos"
    var name1: String = "Pedro"
    var name2: String = "Javier"
    var name3: String = "Eva"

    // Indice 0-7
    // Tamaño 8
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

//    println(weekDays[0])
//    println(weekDays.size)

    // Tamaños
    if (weekDays.size >= 8) {
//        println(weekDays[7])
    } else {
//        println("No hay mas valores en el array")
    }

    // Modificar valores
    weekDays[0] = "Feliz lunes"
//    println(weekDays[0])


    // Bucles para Arrays
    // 1. Iterar por indices
    for(position in weekDays.indices){
//       println(weekDays[position])
    }

    // 2. Iterar por indices y valor
    for((position, value) in weekDays.withIndex()){
//        println("La posición $position, contiene $value")
    }

    // 3. Iterar por valores
    for (day in weekDays){
        println("Hoy es $day")
    }

    weekDays.forEach { it }
}