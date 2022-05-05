fun main(){
    //Diplomatura Android Studio - Clase 1

    //---Comentarios---//
    //Comentarios de una sola línea
    /*
    Comentario
    de
    varias
    líneas
    */
    //TODO tipo de comentario que deja una marca
    //fixme Funciona igual que el todo
    //pero se guarda en varias lineas

    //BASES DE LA PROGRAMACIÓN
    //---¿Qué es la programación?---//
    /*
    Acción de crear programas o aplicaciones a través del desarrollo
    de un código fuente que se basa en un conjunto de instrucciones
    que sigue el ordenador para ejecutar un programa.
    Resolver problemas de la vida real utilizando un lenguaje para
    comunicarse con el ordenador.
    */

    //---¿Que es un algoritmo?---//
    /*
    Es una secuencia no ambigua, finita y ordenada de instrucciones
    que han de seguirse para resolver un determinado problema.
    */

    //---¿Que es un pseudocódigo?---//
    /*
    Es una descripción de alto nivel de un algoritmo que es más cercano
    al lenguaje humano que al lenguaje máquina. No tiene ningún tipo de
    standard.
    */

    //---¿Qué es un diagrama de flujo?---//
    /*
    Son representaciones graficás de los algoritmos.
    */

    //---Lenguajes de programación---//
    /*
    Conjunto de instrucciones que le permiten al programador dar una serie
    de órdenes al ordenador. Es el intermediario entre el lenguaje humano
    y el lenguaje máquina

    Tipos:
    -Bajo Nivel: se ejecuta directamente en el procesador (leguaje máquina,
    lenguaje ensamblador).
    -Medio Nivel: permiten una mayor abstracción, pero tienen propiedades de
    los lenguajes de bajo nivel (c).
    -Alto Nivel: son traducidos por un compilador al lenguaje de máquina, son
    mucho más fáciles de aprender que los de nivel medio, ya que, utilizan
    instrucciones más fáciles de interpretar por los humanos.
    */

    //---Integrated Development Environment(IDE)---//
    /*
    Es una aplicación que proporciona una serie de servicios que facilitan
    la creación, modificación, compilación, implementación y depuración de
    software.
    */

    //---Kotlin---//
    /*
    Lenguaje expresivo y conciso, y esta creado para proveer seguridad
    de tipos y contra nulos.
    fue creado en 2011 por los programadores de jetBrains con el fin de
    sustituir al lenguaje de programación Java en sus proyectos de Android.
    Es un lenguaje muy similar a Scala.
    Se caracteriza por su exactitud y claridad, lo que permite reducir
    notablemente los errores de código.

    Beneficios de usar Kotlin:
    1. Menos código combinado con una mayor legibilidad
    2. Lenguaje y ambiente maduro. Posee un ecosistema de herramientas
    muy sólido y esta perfectamente integrado a Android Studio.
    3. Compatibilidad.
    4. Interoperabilidad con Java
    5. Soporte para desarrollo multiplataforma.
    6. Código de seguridad.
    7. Fácil aprendizaje.
    8. Gran comunidad.
    9. Es un lenguaje estable
    10. Operabilidad.
    11. Claridad para saber que es lo que está haciendo el código.

    Kotlin puede utilizar perfectamente las librerias de Java
    */

    //Salida de un str

    println("Hola mundo")//Imprime un dato con un salto de línea
    println("Hola mundo")
    println("Hola mundo")

    print("Hola mundo ")//Imprime el dato sin el salto de línea
    print("Hola mundo ")
    println("Hola mundo ")

    //---Variables---//

    var nombre = "Santiago"//Se puede modificar su valor
    val apellido = "Quiroz"//No puede cambiar su valor

    nombre = "Emiliano"//Cambio del valor de la variable

    println("Tu nombre es $nombre y tu apellido es $apellido")



}