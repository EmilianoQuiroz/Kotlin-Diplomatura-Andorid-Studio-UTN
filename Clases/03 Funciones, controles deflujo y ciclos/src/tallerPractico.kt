//---TALLER PRACTICO---//
fun main() {
//FUNCIONES
/*
El identificador de una funcion sigue las mismas reglas que los
identificadores de las variables:
-No puede empezar con un numero
-No puede ser una palabra reservada
-No puede tener espacios
-No puede llevar _, @, *, !, -, +
-Se escriben en cammel case
-En principio las funciones las vamos a declarar FUERA del main
-Las declaramos por fuera, pero las invocamos por DENTRO del main
*/
    //---EJERCICIO---//
    /*
        1. Escribir 4 funciones para calcular suma, resta, multiplicación y
        división de dos números guardados en variables predefinidas.
    */

    //---¿Como llamar a una funcion?---//

    //Primero creo una variable que contenga el resultado de esa funcion
    var resultado: Int = suma(4, 7)
    //Luego imprimo el resultado de la suma guardado en la variable resultado
    println(resultado)
    var resultado1: Int = resta()
    println(resultado1)
    var resultado2: Int = mult()
    println(resultado2)
    var resultado3: Int = div(12, 2)
    println(resultado3)
    var saludo = saludar()
    println(saludo)
    var saludo2 = saludarNombre("Santiago")
    println(saludo2)
   /* var baseCuadrado = 23.33f
    var alturaCuadrado = 34.33f
    var area = areaCuadrado(baseCuadrado, alturaCuadrado)
    println(area)
    */
}

//---FUNCION DE SUMA---//
fun suma(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

//---FUNCION DE RESTA---//
fun resta(numero1: Int = 10, numero2: Int = 5): Int {//Declaracion de una funcion con valores predefinidos
    return numero1 - numero2
}

//---FUNCION DE MULTIPLICACION---//
fun mult(numero1: Int = 2, numero2: Int = 20): Int {
    return numero1 * numero2
}

//---FUNCION DE DIVICION---//
fun div(numero1: Int, numero2: Int): Int {
    return numero1 / numero2

}
/*
FUNCION EN UNA SOLA LINEA
fun retornaUnNumero() = 10
Esta funcion no tiene parametro y simplemente retorna el numero 10
*/

//Funcion saludar
fun saludar() = "Esta funcion no tiene parametro"

//Esta funcion no retorna un valor pero puede recibir un argumento
//En este caso el nombre
fun saludarNombre(nombre: String) {
    println("Hola $nombre, como estas?")
}

//Palabra reservada de Kotlin
//Unit = Indica que la funcion no retorna un valor
//Es similiar al void en java
//En el caso de las funciones que no devuelven un valor no es necesario indicarlo
//EJEMPLO
//Calcular el area de un cuadrado
//fun areaCuadrado(base: Float, altura: Float) = base * altura


