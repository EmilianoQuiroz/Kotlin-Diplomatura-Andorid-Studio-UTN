import java.util.*

fun main(){
    //Operadores relacionales
    var a = 20
    var b =20
    println("a es igual a b: ${a == b}")//El operador == es de igualdad
    //Y el operador = es de asignación
    println("a es diferente de b: ${a != b}")
    println("a es mayor que b: ${a > b}")
    println("a es menor que b: ${a < b}")
    println("a es menor o igual que b: ${a <= b}")
    println("a es mayor o igual que b: ${a >= b}")

    /*
    TABLA DE VERDAD:
    A   B   AND OR
    V   V   V   V
    V   F   F   V
    F   V   F   V
    F   F   F   F

    OPERADOR NOT (negación)
    A   NOT
    V   F
    F   V
    */

    //Operadores lógicos (operadores de tipo booleano - el resultado es de tipo booleano)
    /*
    && and
    || or
    ! not
    */
    var log1 = true
    var log2 = false

    println("AND: ${log1 && log2}")
    println("OR: ${log1 || log2}")
    println("Not: ${!log1}")
/*
    //Manejo de string
    var nombre = "Santiago"
    println(nombre)
    println("length: ${nombre.length}")//.length nos da el número de caracteres del string
    //Devuelve un entero con la longitud del string
    println("isEmpty: ${nombre.isEmpty()}")//Nos devuelve un booleano que nos indica si el str esta vacio
    println("contains: ${nombre.contains("mili")}")//devuelve un booleano que nos indica si contiene la subcadedna indicada
    //Distingue en entre mayúsculas y minúsculas
    //010219
    println("substring: ${nombre.substring(6)}")
    //Devuelve una subcadena desde la posicion indicada
    println("substring: ${nombre.substring(2,6)}")
    //Tambien se le pueden dar dos parametros
    println("replace: ${nombre.replace('a','e')}")
    //Reemplaza los caracteres, el primer parametro es el caracter a reemplazar y el segundo es el que lo reemplaza
    println("replaceFirstChar: ${nombre.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
    //Cambia la primera letra y la convierte en mayúscula

    //Comparacion de string
    val palabra1 = "Hola"
    val palabra2 = "hola"
    //Operador de comparacion ==
    //Devuelve true si tienen el mismo valor
    println("palabra1 == palabra2: ${palabra1 == palabra2}")

    //Operador de igualdad referencial
    //Devuelve treu si las dos variables apuntan al mismo objeto y tuenen el mismo valor
    println("palabra1 === palabra2: ${palabra1 === palabra2}")
    /*
    equals()
    es un metodo que devuelve el mismo resultado que ===
    con la diferencia de que si agregamos un parametro true
    nos ignora las mayusculas en la comparacion
    */
    println("palabra1.equals(palabra2): ${palabra1.equals(palabra2,true)}")

    //compareTo()
    //Es un método para comparar el orden de dos cadenas
    //Devuelve un valor entero
    //Si las cadenas son iguales devuelve 0
    //si una cadena es mayor que la otra devuelve un numero negativo
    //Si la cadena es menor que la otra devuelve un numero positivo
    println("palabra1.compareTo(palabra,true): ${palabra1.compareTo(palabra2, true)}")
*/
    /*
    ***************************
    *       EJERCICIOS        *
    ***************************
    Calculadora:
    Hacer un programa que pueda realizar las siguientes operaciones:
    *Suma
    *Resta
    *Divición
    *Multiplicación
    *Resto de la divición
    Imprimir cada resultado en una linea por cada operacion
    acompañada de un texto que puestre la operacion mas el
    resulado. Por ejemplo:
    Suma = 2 + 2 = 4 ...
    */
    var primerValor = 10
    var segundoValor = 5

    var suma = primerValor + segundoValor
    var resta = primerValor - segundoValor
    var divicion = primerValor / segundoValor
    var multiplicacion = primerValor * segundoValor
    var diferencia = primerValor % segundoValor

    println("*************************CALCULADORA***************************")

    println("Suma = ${suma}")
    println("Resta = ${resta}")
    println("Divicion = ${divicion}")
    println("Multiplicacion = ${multiplicacion}")
    println("Resto = ${diferencia}")

    /*
     Escribir frases con variables

     Dadas las siguientes variables
     var palabra1 = "cuesta"
     var palabra2 = "subir"
     var palabra3 = "la"
     var palabra4 = "a"
     var palabra5 = "e"
     var palabra6 = "i"
     var palabra7 = "v"
     var palabra8 = "s"
     var palabra9 = "n"
     var palabra10 = "d"
     var palabra11 = "y"
     var palabra12 = "medio"

     Imprimir por pantalla la frase "A cuesta le cuesta subir la
     cuesta y en medio de la cuesta, va y se acuesta"

    */
    var palabra1 = "cuesta"
    var palabra2 = "subir"
    var palabra3 = "la"
    var palabra4 = "a"
    var palabra5 = "e"
    var palabra6 = "l"
    var palabra7 = "v"
    var palabra8 = "s"
    var palabra9 = "n"
    var palabra10 = "d"
    var palabra11 = "y"
    var palabra12 = "medio"

    println("***********************FRASE CON VARIABLES********************************")
    println("A ${palabra1} ${palabra6}${palabra5} ${palabra1} ${palabra2} ${palabra3} ${palabra1}")
}