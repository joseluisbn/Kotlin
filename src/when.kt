fun main() {

    println("Introduce tu edad")

    val edad = readLine()!!.toInt()

    when {
        edad < 18 -> println("Eres menor de edad")
        edad <65 -> println("Eres mayor de edad")
        else -> println("Eres mayor de edad, y jubilado")
    }

    //En vez de usar los operadores, podemos usar dos puntos (..) para delimitar rangos

    when (edad) {
        in 1..17 -> println("Eres menor de edad")
        in 18..64 -> println("Eres mayor de edad")
        else -> println("Eres mayor de edad, y jubilado")
    }

}
