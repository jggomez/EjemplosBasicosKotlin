fun main(args: Array<String>) {

    // Lista dinamica
    val nombres = ArrayList<String>()
    nombres.add("Juan")
    nombres.add("Pedro")

    // Array String
    val apellidos = Array(2, { "" })
    apellidos[0] = "Gomez"
    apellidos[1] = "Torres"

    // Array Int
    val edades = IntArray(2, { 0 })
    edades[0] = 20
    edades[1] = 40

    val lstUsuarios = unirListas(nombres, apellidos, edades)

    // Lambda
    lstUsuarios.forEach { println(it) }
    lstUsuarios.filter { it.length > 13 }.forEach { println(it) }
    lstUsuarios.map { it.substring(0, 5) } .forEach { println(it) }
}

fun unirListas(nombres: List<String>, apellidos: Array<String>,
               edades: IntArray): List<String> {

    val lstUsuarios = ArrayList<String>()

    for ((index, nombre) in nombres.withIndex()) {
        lstUsuarios.add("$nombre ${apellidos[index]} ${edades[index]}")
    }

    return lstUsuarios
}