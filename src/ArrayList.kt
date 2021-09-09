fun main() {

    /*Al contrario del array, que tenía una dimensión fija,
    * el arrayList sí puede modificar sus dimensiones*/

    var libros = arrayListOf("El problema de los tres cuerpos", "Hyperion", "El despertar del leviatán", "Solaris")

    //Recorremos con el bucle todo el array

    for (i in libros) {
        println(i)
    }

    println("-----------")

    //Podemos agregar nuevos elementos al array con el método add

    libros.add("Dune")

    for (i in libros) {
        println(i)
    }

    println("-----------")

    //Para suprimir un elemento se utiliza el método remove

    libros.removeAt(2)

    for (i in libros) {
        println(i)
    }

    println("-----------")

    //Para ordenar el array utilizamos el método sort

    libros.sort()

    for (i in libros) {
        println(i)
    }
}
