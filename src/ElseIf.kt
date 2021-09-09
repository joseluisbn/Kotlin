fun main() {

    println("Introduce tu edad")

    val edad = readLine()!!.toInt()

    if (edad < 18){
        println("Eres menor de edad")
    } else if (edad < 65){
        println("Eres mayor de edad")
    } else{
        println("Eres mayor de edad, y jubilado")
    }
}
