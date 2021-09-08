fun main()
{
    println("Introduce un número")

    try
    {
        val entrada = readLine()!!.toDouble()
        print("El número introducido es $entrada")
    } catch (e: Exception)
    {
        println("Entrada errónea. Por favor, introduce un número")
        main()
    } finally
    {
        println("Fin del programa")
    }
}
