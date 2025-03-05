package es.upsa.curso_3_app_1.sintaxis

fun main(){
    inmutableList()
    //mutableList()
}

fun inmutableList() {
    // Inmutable list
    val readOnlyList : List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    // Itera sobre la lista
    println(readOnlyList.size)
    println(readOnlyList)
    println(readOnlyList[0])
    println(readOnlyList.last())
    println(readOnlyList.first())

//    Filtrar por condición: 'it' es el valor de cada elemento ($1 en Swift)
    val example = readOnlyList.filter { it.contains("a")  }
    println(example)

    //Iterar
    readOnlyList.forEach { weekDay -> println(weekDay) }
    // readOnlyList.forEach { println(it) }
}


fun mutableList() {
    // Lista Mutable
    val weekDays : MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    weekDays.add(3,"Carlos")
    println(weekDays)

    if(weekDays.isEmpty()) {
        //No voy a pintar nada porque no hay
    } else {
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()) {
        weekDays.forEach { println(it) }
    }

    weekDays.last()

    for(SUSCRIBETE in weekDays){
        // ...
    }

    weekDays.forEach {  }
}

