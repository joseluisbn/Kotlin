fun main()
{

    println("Introduce los invitados uno a uno.\nPara finalizar presionar únicamente enter")

    val listaInvitados = arrayListOf<String>()

    do
    {
        print("Invitado: ")
        val invitado = readLine().toString()
        listaInvitados.add(invitado)

    } while (invitado != "")

    println("\nLos invitados introducidos son:\n")
    for (invitado in listaInvitados) println(invitado)

}
