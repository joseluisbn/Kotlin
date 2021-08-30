fun main() {
    
    mensaje("Andrés", "Rincón", 35)
   
}

//Creamos la función e introducimos las variables y sus tipos

fun mensaje(nombre: String, apellidos: String, edad: Int){
    println("""
    Nombre: $nombre
    Apellidos: $apellidos
    Edad: $edad
    """.trimIndent())
}
