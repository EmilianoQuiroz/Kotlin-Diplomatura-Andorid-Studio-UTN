fun main(){
    /*
    ****************************
    *CLASE PRACTICA
    ****************************
    */
    //NOTAS DE ALUMNOS
    println("Ingrese la cantidad de notas a cargar: ")
    var cantidadNotas = readln().toInt()
    var arregloNotas = Array<Float>(cantidadNotas,{0.0f})
    for (i in arregloNotas.indices){
        println("Ingrese la nota: ")
        arregloNotas[i] = readln().toFloat()
    }
    println("El promedio de las notas ingresadas es %.2f".format(promedioArrayFloat(arregloNotas)))
    calificacion(arregloNotas)
}

fun promedioArrayFloat(arreglo: Array<Float>): Float {
    var suma = 0.0f
    for (i in arreglo) suma += i
    var promedio = suma / arreglo.size
    return promedio
}

fun calificacion(arreglo: Array<Float>){
    var notaMenorIgualA3 = false
    for (i in arreglo)if(i <= 3) notaMenorIgualA3 = true
    var promedio = promedioArrayFloat(arreglo)
    when{
        !notaMenorIgualA3 && promedio >= 6 -> println("APROBADO")
        notaMenorIgualA3 && promedio < 6 -> println("DESAPROBADO")
        !notaMenorIgualA3 && promedio < 6 -> println("A RECUPERATORIO")
    }
    //VENDING MACHINE
    var precio: Int
    var monto: Int

    do {
        println("Ingrese el precio del producto:")
        precio = readln().toInt()
        println("Ingrese el monto con el que paga:")
        monto = readln().toInt()
        if (precio > monto) println("El monto no alcanza para pagar el costo del producto.\nIngrese datos nuevamente por favor.")
    } while (precio > monto)


    vendingMachine(precio,monto)

}

fun vendingMachine(precio: Int,pago: Int){
    var billete1 = 0
    var billete2 = 0
    var billete5 = 0
    var billete10 = 0
    var billete20 = 0
    var billete50 = 0
    var billete100 = 0

    var vuelto = pago - precio

    if (vuelto == 0) println("No recibe vuelto, usted abonó con lo justo.")
    else println("Su vuelto es de $vuelto.\nY se le pagará con:")

    while (vuelto >= 100) {vuelto -= 100;billete100++}
    while (vuelto >= 50) {vuelto -= 50;billete50++}
    while (vuelto >= 20) {vuelto -= 20;billete20++}
    while (vuelto >= 10) {vuelto -= 10;billete10++}
    while (vuelto >= 5) {vuelto -= 5;billete5++}
    while (vuelto >= 2) {vuelto -= 2;billete2++}
    while (vuelto >= 1) {vuelto -= 1;billete1++}


    if (billete100 > 0) println("\t$billete100 billete/s de \$100 ")
    if (billete50 > 0) println("\t$billete50 billete/s de \$50 ")
    if (billete20 > 0) println("\t$billete20 billete/s de \$20 ")
    if (billete10 > 0) println("\t$billete10 billete/s de \$10 ")
    if (billete5 > 0) println("\t$billete5 billete/s de \$5 ")
    if (billete2 > 0) println("\t$billete2 billete/s de \$2 ")
    if (billete1 > 0) println("\t$billete1 billete/s de \$1")
}
