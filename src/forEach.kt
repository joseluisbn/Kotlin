fun main() {

    var libros = arrayListOf("El problema de los tres cuerpos", "Hyperion", "El despertar del leviatán", "Solaris")

    //Recorremos el array con el lambda

    libros.forEach { libro ->
        println(libro)
    }

    //Otra manera

    libros.forEachIndexed { i, libro ->
        println("$i, $libro")
    }
}
