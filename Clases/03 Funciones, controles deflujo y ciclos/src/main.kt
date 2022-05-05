fun main() {
/*
//---Temario de la clase 4:---//

-Funciones
-Condicionales
    * If - “Then” - Else
-When
- Operadores de comparación
- Iteradores
    * For
    *While
    *Do While
-Repaso de Arrays
-Taller

*/


//---FUNCIONES---//
/*
Las funciones son bloques de código que sirven para organizar la
estructura de nuestro programa.
Las funciones se definen a partir de la necesidad de ser reutilizadas en
diferentes partes del código.
Las funciones pueden devolver un resultado o no. Muchas veces se hace
la distinción entre Función (cuando devuelve un valor) y Procedimiento
(Cuando no devuelve nada). En Kotlin llamaremos a los dos tipos,
simplemente función.
Por ejemplo:
Si tengo una función llamada “suma” la voy a invocar cada vez que
necesite calcular una suma. De esta manera, consigo que el código quede
mejor articulado y además, es más fácil para mantener.
*/

//---ESTRUCTURA DE UNA FUNCIÓN---//

//    fun nombreFuncion(parametro1:tipo,parametro2:tipo,parametro3:tipo){
    //La funcion se crea mediante la palabra reservada "fun"
    //Luego escribimos el nombre de la funcion
    //Luego pasamos los parametros con su tipo de dato
    //Puede tener cero, uno, dos o muchos parametros
    //Por ultimo  entre corchetes escribimos el cuerpo de la funcion

    //...CUERPO DE LA FUNCION...

    //002158

    // }

/*

//---Declaración de una función - Ejemplo---//

fun suma(numero1: Int, numero2: Int): Int {
return numero1 + numero2
}

//---Versión simplificada Equivalente---//

fun suma(numero1: Int, numero2: Int):Int = numero1 + numero2

*/
    //---Uso o invocación de una función---//
//Primero declaramos la funcion

    /*  fun suma(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }
//Luego la llamamos dentro de una variable
    //var resultado = println( suma(3, 7))
}
*/
    fun estrcturasCondicionales() {
        /*
    //---Estructuras Condicionales---//

    Las estructuras condicionales nos ayudan a controlar el flujo de los
    programas. Estas estructuras se basan en la evaluación de condiciones
    para tomar decisiones de acuerdo a ciertos parámetros dados.
    En Kotlin vamos a ver las siguientes estructuras:
    ● If
    ● When

    //---Estructuras condicionales- if---//

    Las estructuras condicionales nos permiten evaluar una condición y en
    base al resultado ejecutar código diferente según el caso.
    La estructura if se arma de la siguiente forma:

    if (Esta condición es verdadera) {
    Entonces ejecuto esto
    }

    Básicamente en la linea de codigo de arriba, en los paréntesis vamos a
    colocar la condición que se tiene que cumplir y entre las llaves que hacer
    si se cumple.

    //---Estructuras condicionales- if: Ejemplo---//

    Por ejemplo supongamos que queremos saber si un numero ingresado es
    mayor a 18

    fun main(args : Array<String>) {
            var edad = 18
        if (edad >= 18) {
            println("El numero ingresado es mayor o igual que 18")
        }
    }

    //---Estructuras condicionales- if, else---//

    En algunos casos no nos basta con saber que se cumple una condición,
    sino que en caso de que no se cumpla necesitamos que se haga otra cosa.
    Para resolver este aspecto, existe el comando else el que se encargará de
    ejecutar todo lo que está entre sus llaves en caso de que la condición no
    se cumpla.

    if (Esta condición es verdadera) {
        Entonces ejecuto esto
    }
    else{
        Sino, ejecuto esto otro
    }

    //--Estructuras condicionales - if, else: Ejemplo--//

    Tomando el ejercicio anterior, haremos que si el numero ingresado es
    menor a 18 escriba por consola algo relacionado a ello.

    fun main(args : Array<String>) {
        var edad = 18
        if (edad >= 18) {
            println("El numero ingresado es mayor o igual que 18")
        }
        else{
            println("El numero ingresado es menor que 18")
        }
    }

    //---Estructuras condicionales - if anidados--//

    Es importante saber que se pueden anidar múltiples if en caso de ser
    necesario. Esto permite que se pueda hacer operaciones específicas
    anidadas considerando múltiples condiciones.

    if (/* Si esto sucede */) {
        // Entonces ejecuto esto
            if (/* Si esto sucede */) {
                // Entonces ejecuto esto otro
            }
            else {
                // Entonces ejecuto esto otro
            }
    }
    else{
        // Entonces ejecuto esto
    }
    */
/*
//---Estructuras condicionales - if anidados: Ejemplo---//

if (Tiene Pasaporte) {
    // Entonces ejecuto esto
        if (Tiene edad >=18) {
            // Entonces puede viajar solo
        } else {
            // Entonces no puede viajar solo
    }
} else {
    // No Viaja
}

*/
/*
004016
//---Estructura When---//


//---Estructuras condicionales- when---//

Por último, si el valor a comparar determina múltiples acciones
independientes (o sea que una acción no esté relacionada con otra) se
puede usar el comando when, comúnmente llamado case en otros
lenguajes, que nos permite evaluar múltiples condiciones

when (/*un parametro aca, supongamos un int*/) {
    1, 2 -> // Es 1 o 2 ejecuto lo que ponga de este lado
    3 -> // Es 3 ejecuto lo que ponga de este lado
    else -> {
        // Si ninguna condicion se cumplio, ejecuto esto.
        // Si bien se puede prescindir del else, no es
        // buena practica no realizar nada con el
    }
}

//--Estructuras condicionales- when--//
When además, soporta otro tipo de condiciones que no son constantes,
por ejemplo:

when (/*un parametro aca, supongamos un int*/) {
    in 1..17 -> // Si el parámetro se encuentra entre 1 y 17
    !in 1..17 -> // Si el parámetro NO se encuentra entre 1 y 17
else -> {
    // Si ninguna condicion se cumplio, ejecuto esto.
    // Si bien se puede prescindir del else, no es
    // buena practica no realizar nada con el
    }
}
*/
    }
}

//EJEMPLO CON WHEN
/*
fun main(args: Array<String>) {
    var edad = 19
    var resultado: String = ""
    when (edad) {
        in 1..17 -> resultado = "Menor"
        in 18..18 -> resultado = "Igual"
        in 19..1000 -> resultado = "Mayor"
        else -> {
            resultado = "Ninguno"
        }
    }
    println("El resultado de when es: $resultado")
}
*/

/*
//---Estructuras condicionales - when: Otra forma---//

Esta segunda forma de escribir un when permite analizar otro tipo de
condiciones.

    when {
        a > b -> // Si a es mayor que b
        c > d -> // Si c es mayor que d
    else -> {
        // Si ninguna condicion se cumplio, ejecuto esto.
    }
}

A diferencia de la forma anterior, de esta manera se pueden involucrar
una variedad mayor de condiciones, por eso se dice que esta forma es
más parecida a un if que a un switch.
La evaluación de condiciones de las “estructuras condicionales” se basa
en la lógica booleana, es decir, que las condiciones evaluarán los
parámetros para determinar si estos son verdaderos (true) o falsos
(false).
Como vimos en el caso de if y when
SI (Condición booleana es verdadera) → entonces hago algo

Para esto existen una serie de operadores que nos van a ayudar con la
tarea.

Algunos de estos son:
● == : Se usa para comparar igualdad en los valores. (5 == 5) // true
● != : Comparo si no son iguales los valores. (5 != 5) // false
● < : Compara si el valor de la izquierda es menor que el de la derecha.
● > : Compara si el valor de la izquierda es mayor que el de la derecha.
Ejemplos
● if(2 < 2) // false
● if(2 < 9) // true
● if(2==2) //true
● if(2!=3) // true

Las condiciones a evaluar se pueden combinar utilizando operadores
booleanos:

● && : Comando usado para la operación AND (y).
● || : Comando usado para la operación OR (o)
● ! : Comando usado para la operación NOT (no)
Ejemplos:
● if(a>b && a>18) //Se tienen que cumplir ambas condiciones para que
sea true, de lo contrario es false
● if(a>b || a>18) //Basta con que se cumpla alguna de las condiciones
para que sea true, de lo contrario es false
● Con el operador ! (NOT) podemos invertir la lógica de la condición:
if(a>b) puede representarse como if(!(a<b)) → esto no es equivalente
*/

//---ITERADORES---//

fun iteradores() {
/*
Los iteradores son estructuras de control que nos permitirán repetir una
tarea hasta que la misma esté completa.
Dentro de los iteradores tenemos:
● For...do: Este comando realizará la operación solicitada “Para” (qué
es la traducción de for) una N cantidad de veces.
● While...do : Este comando realizará la operación solicitada
“Mientras” se cumpla una condición.
● do...While : Este comando es similar al anterior pero con la
diferencia que el primero, evalúa la condición antes del primer loop
mientras que la segunda acepción, primero ejecuta al menos una vez
el loop y luego evalúa la condición.

//---CICLO FOR---//

El comando For...do puede utilizarse tanto para hacer un loop una
determinada cantidad de veces, como así también para recorrer un
objeto iterable como un Array.
El comando para hacer un loop sobre una cantidad de iteraciones
definidas es:

    for (i in 1..10){       for (i in 1 until 11){
        x++                     x++
        println (x)             println (x)
    }                       }

Ambas formas son equivalentes y en este caso, se generará un loop que
ejecutará todo aquello que se encuentre encerrado entre las llaves 10
veces.

Este comando se utiliza normalmente para recorrer los elementos de un
Array, también se dice Iterar un Array.

    var service = arrayOf(1000, 2000, 3000, 4000)
        for (valor in service){
        println (valor)
    }

//---CICLO DO WHILE---//

While ejecuta el código dentro de sus llaves siempre que la condición
dentro de los paréntesis sea verdadera. En este caso el código de
incrementar en uno e imprimir va a ser verdadero hasta que la variable
llegue a 10.

var veces = 0
while (veces < 10) {
    veces++
    println("Y va " + veces + " veces.")
}
La diferencia entre while y do...while es el orden en el que se lee la
condición:

var veces = 0
do {
    veces++
    println("Y va " + veces + " veces.")
} while (veces < 10)

//---REPASO DE ARRAYS---//

Creación de Arrays:

var a: Array<Int> = arrayOf(2, 4, 8, 16, 32, 64)

En Kotlin tenemos tipos de arrays personalizados, la siguiente instrucción
es equivalente de la anterior:
var a: IntArray = intArrayOf(2, 4, 8, 16, 32, 64)
Los tipos de array personalizadosson:
● ByteArray
● ShortArray
● IntArray
● ...

Creación de Arrays - crear un array vacío:

var a: Array<Int> = Array<Int>(5, {0})
var a: Array<String> = Array<String>(5, {“”})
Inicialización de un Array personalizado vacío.
var a: IntArray = IntArray(5)
var a: StringArray = StringArray(5)

Lectura de valores de un array:

var a: Array<Int> = arrayOf(2, 4, 8, 16, 32, 64)
    //Leo el valor que está en índice 2 del Array a
    var valor: Int = a[2] // valor ahora contiene 8
    var valor: Int = a.get(2)

Escritura en una posición de un array:

    var a: Array<Int> = arrayOf(2, 4, 8, 16, 32, 64)
    //Asigno 128 en en índice 2 del array a
    a.set(2, 128)

    Conocer la longitud de un array
    var a: Array<Int> = arrayOf(2, 4, 8, 16, 32, 64)
    println(a.size) //El Array tiene 6 posiciones, índices del 0 al 5


*/


}