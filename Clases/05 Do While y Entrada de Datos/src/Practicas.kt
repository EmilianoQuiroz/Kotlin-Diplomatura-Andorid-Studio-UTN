fun main() {
//CAPTURA DE DATOS POR CONSOLA
    println("Ingrese su nombre: ")
    var nombre = readLine()//Captura un String y lo devuelve
    //Tambien se puede escribir como readln()
    println("Hola $nombre!")

    println("Ingrese su edad: ")
    //var edad = readLine()!!.toInt()
    //Usando readln() no necesitamos poner !!
    var edad = readln()
    println("Su edad es de $edad años.")

    //Valores nulos
    /*
    Un valor nulo implica que una variable esta vacia
    o que el valor no es valido
    */
    /*
   *********************************************
   *   ESTRUCTURA DO WHILE
   * *******************************************
   */
    //Primero se ejecuta la acción y luego se hace la comprobación
    var contador = 0
    do {
        contador++
        println("¿Cual es la capital de Argentina?")
        println("a. Montevideo")
        println("b. La Paz")
        println("c. Buenos Aires")
        println("d. Bogota")
        println("Elija la respuesta correcta: ")
        var eleccion = readln().lowercase()//Para pasar todas las respuestas a minuscula
        var retorna = eleccion != "c"
        if (retorna) println("Incorrecto, intente otra vez: ")
        else println("Correcto! Felicitaciones.\nUstede acerto luego de $contador intentos ")
    } while (retorna)
    /*
    *********************************************
    *   ARREGLOS - ARRAY
    * *******************************************
    */
    //Creacion de un array
    val arreglo: Array<Int> = arrayOf(2, 4, 6, 8, 10)

    //Array personalizado
    val arreglo2: IntArray = intArrayOf(2, 3, 5, 67, 89)

    //Creacion de un array vacio
    val arreglo3: Array<Int> = Array(4, { 0 })
    val arreglo4: Array<String> = Array(5, { "" })

    //Inicializacion de un array vacio personalizado
    val arreglo5: IntArray = IntArray(5)
    val arreglo6: CharArray = CharArray(5)//En cotlin no existe el string array

    //Declaracion de asignacion de valores a un Array de enteros
    val numeros = arrayOf(12, 34, 56, 78)

    //Obtener la primer poosicion de un Array
    var valor1 = numeros[0]
    var valor2 = numeros.get(0)
    //Ambas formas cumplen el mismo fin

    //Asignacion y modificacion de variables
    numeros[2] = 50
    numeros.set(3, 5)//Ambos llamados cunplen la misma funcion

    //Longitud de un Array
    var longitud = numeros.size

    //Recorrido de un array
    val dias = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    for (i in dias) println(i)
    println("*****************************")
    for (i in dias.indices) println("La posicion $i tiene el valor de ${dias[i]}")
    println("******************************")
    println(dias.joinToString())//Nos imprime los elementos del array separados por coma
    println("******************************")
    println(dias.joinToString("&"))//Se le puede pasar un parametro de separacion de los elementos del array

    //Carga de datos de un array 013308
    val arregloNuevo = IntArray(10)
    contador = 1
    for (i in arregloNuevo.indices){
        arregloNuevo[i] = contador
        contador++
    }
    println(arregloNuevo.joinToString("-"))

}