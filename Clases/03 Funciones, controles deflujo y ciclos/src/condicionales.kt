fun main() {
/*
    *****************************
    ESTRUCTURAS CONDICIONALES
    *****************************
*/
//Estructura If
    var numero1: Int = 123
    var numero2: Int = 156

    if (numero1 > numero2) {
        println("El primer numero es mayor que el segundo")
    } else {
        println("El segundo numero es mayor")
    }
/*
    Temas vistos:
        -if
        -if else
        -if anidados
        -when
*/
    var tienePasaporte = true
    var edad = 18
    if (tienePasaporte) {
        if (edad >= 18) {
            println("Puede viajar solo")
        } else {
            println("No puede viajar solo")
        }
    } else {
        println("No puede viajar solo")
    }
    //FORMA ABREVIADA
    if (tienePasaporte) {
        if (edad >= 18) println("Puede viajar solo")
        else println("No puede viajar")
    }
    //OTRO EJEMPLO DE CONDICIONAL
    var sexo = "Mujer"
    var edaD = 63
    //Version 1
    if (sexo == "Hombre" && edaD >= 65) println("Puede jubilarse")
    else if (sexo == "Mujer" && edaD >= 60) println("Puede jubilarse")
    else println("No se puede jubilar todavia")
    //version 2
    if (sexo.equals("Hombre") && edaD >= 65 || sexo.equals("Mujer") && edaD >= 60) println("Ya se puede jubilar")
    else println("No se puede jubilar todavia")
/*
Ejercicio:
Determinar de tres numero cual es el mas grande
*/
    var nro1 = 33
    var nro2 = 43
    var nro3 = 13

    if (nro1 > nro2 && nro1 > nro3) println("Numero mayor: $nro1")
    else if (nro2 > nro1 && nro2 > nro3) println("Numero mayor: $nro2")
    else println("Numero mayor: $nro3")

//---EJERCICIO 2---//
/*
2. Vamos a agregar interactividad a nuestro programa. Para ello, vamos
a hacer uso de una función que permite el ingreso de datos durante
la ejecución del programa:
Agregar a la función anterior la posibilidad de ingresar los dos valores
en tiempo de ejecución, a través de la consola
*El programa debe mostrar textos que den información al usuario de lo
que tiene que hacer y de los resultados, por ejemplo:
“Programa para sumar”
“Ingrese el primer número: ”
“La suma de 2 + 3, dio como resultado 5”
Dado el siguiente array [12, 0, -4, 48, -52, 25, 2, 31]
A. Escribir una función que devuelva el resultado de la suma de todos
sus valores.
B. Escribir una función que devuelva el promedio de los valores del
array.
C. Escribir una función que devuelva la cantidad de números negativos.
D. Escribir una función que muestre los números impares y además que
muestre la cantidad.
E. Escribir una función que muestre los números del Array que sean
múltiplos de 2, de 3 o de 5
*Tener en cuenta para todas las operaciones, que el Array pueda
cambiar, es decir, que es necesario calcular la longitud del Array.
*/
}