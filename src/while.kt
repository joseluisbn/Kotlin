fun main()
{

    println("Introduce los invitados uno a uno.\nPara finalizar presionar únicamente enter")

    val listaInvitados = arrayListOf<String>()

    print("Invitado: ")
    var invitado = readLine().toString()

    while (invitado != "")
    {
        listaInvitados.add(invitado)
        print("Invitado: ")
        invitado = readLine().toString()
    }

    println("\nLos invitados introducidos son:\n")

    for (invitado in listaInvitados) println(invitado)

}
