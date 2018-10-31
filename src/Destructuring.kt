fun main(args: Array<String>) {
    val (lista, cadOrg) = dividirCadena("Juan Guillermo")
    println(lista[0])
    println(cadOrg)

    val (id, _, apellido) = crearCliente()
    println(id)
    println(apellido)
}

data class Cliente(val id: Int, val nombre: String, val apellido: String)

fun crearCliente() = Cliente(123, "Juan", "Gómez")

fun dividirCadena(cadenaOrg: String): Pair<List<String>, String> {
    val cadenas = cadenaOrg.split(" ")
    return Pair(cadenas, cadenaOrg)
}