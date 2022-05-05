fun main(){
    //---Variables inmutables---//
    /*
    No pueden cambiar su valor
    */

    val nombre = "Santiago"//Se recomienda nombrarlas en mayúsculas.

    println(nombre)

    //---Identificadores de variables---//
    /*
    Un identificador puede comnezar con _ o con una letra
    Puede incluir, pero no comenzar con un número
    No se permiten espacios en blanco
    No pueden contener los signos @, -, +, *
    Los identificadores distinguen entre minusculas y mayusculas
    No se pueden usar palabras reservadas
    Sugerencia: siempre el nombre de la variable debería ser declarativo de lo
    que contiene
    */

    //---Palabras recerbadas---//
    /*
    interface   continue    super   this    for if
    breack  try return  do  package class
    else    while   is  null    throw   objet   when
    */

    //---Tipos de datos---//

    //Numericos enteros
    var numero1: Byte = 2 //Ocupa 8 Bits en memoria
    //Puede representar hasta 256 valores, desde el -128 al 127
    println(numero1)

    val numero2: Short = 4884//Ocupa 16 bits
    // 65524 valores y va del -32768 al 32767
    println(numero2)

    val numero3 = 3566363//Es el mas utilizado
    //Ocupa 32 bits
    println(numero3)

    val numero4: Long = 41389861 //64 bits
    //Sirve para numero muy grandes
    println(numero4)

    //Numeros reales

    val numero5: Float = 3.14f //Son numero decimales
    //El tipo floar siempre lleva la f al final del numero
    //No se separa con coma, siempre con punto
    println(numero5)

    val numero6: Double = 2.34//Es para numeros decimales
    //Aunque en este caso no agregamos ninguna letra

    //Numericos sin sigo
    /*
    Nos permite almacenar mas nunmeros positivos
    eliminando a los negativos
    */
    var enteroSinSigno: UByte = 200u
    numero1 = 127
    println("El nuevo valor de numero1 es $numero1")
    println(enteroSinSigno)

    //010020

    //Caracter
    var numero: Char = '2'//El tipo de dato caracter toma un valor único entre comillas simples
    var letra = 'l'
    var caracter = '@'

    println(numero)
    println(letra)
    println(caracter)

    //Cadena de caracteres
    var saludo = "Hola mundo"//Las cadenas de caracteres van encerradas entre comillas
    println(saludo)

    //Caracteres de escape
    /*
    \t: tabulacion
    \b: retroceso
    \r: retorno de carro
    \n: salto de linea
    \': comillas simples
    \": comillas dobles
    \\: backslash
    \$: simbolo de pesos
    \u+xxxx: símbolo unicode con 4 digitos hexagesimales
    */
    println("Hola \t mundo")
    println("Hola \n mundo")
    println("Hola \" mundo \"")

    //Strings en multiples líneas

    var frase1 = """
        Esto es un mensaje
        que se va a ejecutar
        en varias lines sin la
        necesidad de generar varios
        prints
    """.trimIndent()
    println(frase1)

    //Booleano - true/false
    val verdadero = true
    val falso = false

    //Arreglos o arrays
    /*
    Un array o un arreglo es una estructura de datos que permite almacenar un conjunto de datos del mismo tipo
    es decir, guardar en una única variable, varias variables del mismo tipo de dato.
    El tamaño del arreglo es fijo, no puede cambiar. Y finalizan en la representada por la
    longitud -1, es su última posición.
    */
    val number: IntArray//Declaracion del arreglo
    number = IntArray(5)//Creacion de un arreglo con 5 posiciones
    val number2: Array<Int> = arrayOf(23,56,32,22,9)//Creamos el array en una sola linea

    val dias = arrayOf("Lunes","Martes","Miercoles","Jueves","Sabado","Domingo")
    //No hace falta declarar el tipo de arreglo

    //Mostrar datos del array por consola
    println(dias[0])//Dentro del println ponemos el nombre del array seguido por el número de posición del valor que queremos mostrar
    println(dias[1])
    println(dias[2])
    println(dias[3])
    println(dias[4])

    //Conversion de tipos
    var corto: Short = 17
    var entero: Int = corto.toInt()//convertimos el tipo de la variable de short a int

    /*
    - toByte()
    - toShort()
    - toInt()
    - toLong()
    - toFloat()
    - toDouble()
    - toChar()
    - toString()
    */

    //Operadores de concatenación

    var cadena: String = "Hola"
    var cadena1: String = " "
    var cadena2: String = "Mundo"

    //Operador de concatenación +
    println(cadena+cadena1+cadena2)

    //Concatenación con Strings Template
    println("La primer palabra es : $cadena")//Se hace con el signo de pesos

    //Operadores aritméticos
    var a = 10
    var b = 5

    println("Suma: ")
    println(a + b)
    println("Resta: ")
    println(a - b)
    println("Multiplicación")
    println(a * b)
    println("Divivión: ")
    println(a / b)
    println("Módulo o resto: ")
    println(a % b)

    //Operadores de incremento y decremento
    a++//Incrementa en 1 el valor de la variable
    println("Incremento de a: $a")
    b--//Decrementa un valor
    println("Decrementoo de b: $b")

    a = 2
    println("De $a a ${++a}")

    //Operadores de asignación
    a += b // es igual a decir que a = a + b
    println(a)
    a -= b //igual a decir que a = a - b
    println(a)
    a*=b //= a = a * b
    println(a)
    a/=b //= a = a / b
    println(a)

    //Operadores relacionales / Devuelve valores Booleanos
    a = 20
    b = 25
    println("$a es igual a $b : ${a == b}")

}