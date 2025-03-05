package es.upsa.curso_3_app_1.sintaxis
/**
 * Variables (var) y Constantes (val)
 * - Uso de 'camelCase'
 * - 'print' vs 'println'
 *  Funciones
 */

/** Atributos: para todas las funciones */
val nombre: String = "Daniel"

fun main() {  // Función especial 'main' que se ejecuta al inicio
    /** Variables Numéricas */
    val age: Int = 30
    // age = 34 Error de compilación porque es una constante
    val personas: Long = 3783937820938
    val peso: Float = 23.232932f // ojo acabar en 'f'
    val coord: Double = 338947.32948456

    /** Variables Alfanuméricas */
    val letra: Char = 'a'
    var frase: String = "Hola Mundo"
    val frase2 = "Adios Mundo"
    frase = "Hola Mundo desde Kotlin"

    /** Variables Boolean */
    var activo: Boolean = true

    /** Diferencia entre 'print' vs 'println' */
    print("Tiene $age años |")
    println(frase) // print con salto de linea
    println("Es activo $activo") // print con salto de linea
    println("Operación " + (peso - coord))

    val numString = "12"
    println("Suma " + (numString.toInt() + age))
    println("Concatenación " + numString.toInt() + age)

    /** Llamada a funciones */
    funcionPrueba()
    funcionParametros("Carlos Caño", 24)
    println ("Retorna: " + funcionRetorno(5, 23))
    println ("Retorna: " + funcionRetorno( ))
    println ("Retorna: " + funcionRetornoLinea( 8, 11))
}

/** Funciones */
// Función generica
fun funcionPrueba() {
    println(nombre) // declarada como atributo por eso se puede acceder
    // println(age) No es una atributo si no una variable del main, entonces no se conoce
}

fun funcionParametros(nombre: String, anios: Int) {
    println(nombre + " tiene " + anios + " años")
}

fun funcionRetorno(num:Int = 0,  num2:Int = 0): Int {
    return num + num2
}

fun funcionRetornoLinea(num:Int = 0,  num2:Int = 0) = num + num2

// ...Más adelante veremos expresiones Lambda

