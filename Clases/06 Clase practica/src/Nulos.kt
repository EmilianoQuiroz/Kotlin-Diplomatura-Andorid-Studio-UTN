fun main(){
    /*
    **********************************************
    *              NULL
    **********************************************
    */
    /*
    Null: es un valor que representa que una variable
    está vacía o que no apunta a ningún dato válido
    Exception: son problemas que ocurren en tiempo de
    ejecución y que detienen el progreso abruptamente
    NullPointerException: es una excepción provocada cuando
    queremos utilizar una variable que contiene un valor nulo
    Null Safety: es una incorporación de Kotlin para
    disminuir ese tipo de excepciones.

    En Kotlin los nulos no existen, a menos que se exprese
    lo contrario. A ningún objeto se le puede asignar Null.
    En Kotlin todos los tipos son objetos
    */
    //La siguiente sentencia no compilará:
    //var x: Int = null //A la variable no se le puede asignar el valor nulo
    //Para que una variable sea nula debe ser marcada con el signo de pregunta
    var x: Int? = null
    //A partir de esto el compilador nos va a exigir que comprobemos los nulos antes de hacer algo con una variable
    //Comprobación
    if (x != null) {
        val y = x.toDouble()
    }
}