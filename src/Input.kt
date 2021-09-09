fun main() {

    println("Introduce tu nombre")
    val nombre = readLine()
    println("Tu nombre es " + nombre)

    //o bien

    println("Bienvenid@, $nombre")

    //o bien

    println("""
        ***Bienvenid@***
        Nombre: $nombre
    """.trimIndent())
}
