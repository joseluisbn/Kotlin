fun main()
{

    //Creamos el array

    var escritores = arrayOf("Frederik Pohl", "Liu Cixin", "Dan Simmons")

    //Imprimimos el índice deseado

    println(escritores[1])

    //Podemos conocer el tamaño del array

    println("El tamaño del array es " + escritores.size)

    //Para reasignar el valor de una posición del array

    escritores[0] = "Frank Herbert"

    //Imprimimos y verificamos el cambio

    println(escritores[0])

}
