fun main()
{
    //Creamos una variable con el rango de números
    val randomNumber = 1..6

    //Utilizamos el método random para generar el número aleatorio
    val dice = randomNumber.random()
    println(dice)
}
