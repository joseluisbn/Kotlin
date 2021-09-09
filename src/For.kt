fun main() {

    //Creamos el array

    var libros = arrayOf("El problema de los tres cuerpos", "Hyperion", "El despertar del leviatán", "Solaris")

    //Recorremos con el bucle todo el array

    for (i in libros) {
        println(i)
    }

    //Ahí ha tomado todo el array, pero podemos delimitar el rango

    for (i in 0..2) {
        println(libros[i])
    }
}
