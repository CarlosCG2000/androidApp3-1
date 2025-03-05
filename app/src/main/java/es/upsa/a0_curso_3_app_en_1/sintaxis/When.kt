package es.upsa.curso_3_app_1.sintaxis

fun main () {
    getIfMonth(3)
    getWhenMonth(10)
    getWhenTrimester(5)
    getWhenTypeValue("Jjhbk")
    var semestre = getWhenSemestreReturn(3)
    var semestre2 = getWhenSemestreDIrecto(5)
    println(semestre)
    println(semestre2)
}

fun getIfMonth(month: Int){
    if (month == 1) println("Enero")
    else if (month == 2) println("Febrero")
    else if (month == 3) println("Marzo")
    else if (month == 4) println("abril")
    else if (month == 5) println("mayo")
    else if (month == 6) println("junio")
    else if (month == 7) println("julio")
    else if (month == 8) println("agosto")
    else if (month == 9) println("septiembre")
    else if (month == 10) println("octubre")
    else if (month == 11) println("noviembre")
    else if (month == 12) println("diciembre")
    else println("no es un mes valido")
}

fun getWhenMonth(month:Int) {
    when(month) {
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> {
            println("diciembre")
            println("es el ultimo mes del año")
        }
        else -> println("no es un mes valido")
    }
}

fun getWhenTrimester(month:Int) {
    when(month){
        in 1..3 -> println("primer trimestre")
        in 4..6 -> println("segundo trimestre")
        in 7..9 -> println("tercer trimestre")
        in 10..12 -> println("cuarto trimestre")
        else -> println("no es un mes valido")
    }
}

fun getWhenTypeValue(value: Any) {
    when (value){
        is Int -> println("es un entero")
        is String -> println("es un string")
        is Boolean -> println("es un booleano")
        else -> println("no es un tipo valido")
    }
}

fun getWhenSemestreReturn(month:Int):String {
    val semestre = when(month){
        in 1..3 -> ("primer trimestre")
        in 4..6 -> ("segundo trimestre")
        in 7..9 -> ("tercer trimestre")
        in 10..12 -> ("cuarto trimestre")
        else -> ("no es un mes valido")
    }
    return semestre
}

fun getWhenSemestreDIrecto(month:Int) =
    when(month) {
        in 1..3 -> ("primer trimestre")
        in 4..6 -> ("segundo trimestre")
        in 7..9 -> ("tercer trimestre")
        in 10..12 -> ("cuarto trimestre")
        else -> ("no es un mes valido")
    }
