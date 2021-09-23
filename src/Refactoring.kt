/*fun main()
{

    //Una vez creada la clase, creamos la instancia (invocamos) en main

    val firstDice = Dice(6)
    println("Your ${firstDice.sides} sided dice rolled ${firstDice.roll()}!")

    val secondDice = Dice(20)
    println("Your ${secondDice.sides} sided dice rolled ${secondDice.roll()}!")

}

//Primero creamos la clase fuera del main
class Dice(val sides: Int)
{
    fun roll(): Int
    {
        return (1..sides).random()
    }
}*/

fun main()
{
    val firstDice = Dice(6)
    val diceRoll = firstDice.roll()
    println("Your ${firstDice.sides} sided dice rolled ${diceRoll}!")

    val secondDice = Dice(20)
    println("Your ${secondDice.sides} sided dice rolled ${secondDice.roll()}!")
}

class Dice(val sides: Int)
{

    fun roll(): Int
    {
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}
