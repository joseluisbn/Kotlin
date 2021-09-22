fun main()
{

    //Una vez creada la clase, creamos la instancia (invocamos) en main

    val firstDice = Dice()

    //Para acceder a sus propiedades (en este caso las caras) se utiliza la notación de puntos

    firstDice.roll()

}

//Primero creamos la clase fuera del main
class Dice
{
    var sides = 6
    fun roll()
    {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}
