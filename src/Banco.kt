fun main(args: Array<String>) {
    menu()
}

data class Cuenta(val id: String, val nombres: String,
                  var saldo: Double = 0.0)

fun Cuenta.imprimir() =
        "Id = ${this.id} - Nombre = ${this.nombres} - Saldo = ${this.saldo}"

val lstCuentas = ArrayList<Cuenta>()

fun menu() {

    var opcion: Int
    do {
        println("Bienvenido, que operación deseas hacer:")
        println("1. Crear cuenta")
        println("2. Consultar cuenta")
        println("3. Consignación")
        println("4. Retiros")
        println("5. Imprimir cuentas")
        println("6. Promedio de saldo de las cuentas")
        println("7. Salir")
        opcion = readLine()?.toInt() ?: 6

        when (opcion) {
            1 -> crearCuenta()
            2 -> consultarCuenta()
            3 -> consignar()
            4 -> retirar()
            5 -> imprimirCuentas()
        }

    } while (opcion != 6)
}

fun imprimirCuentas() {
    lstCuentas.forEach { println(it.imprimir()) }
}

fun retirar() {

    print("Digite su Identificación: ")
    val id = readLine() ?: ""

    print("Valor a retirar: ")
    val valor = readLine()?.toDouble() ?: 0.0

    val cuenta = lstCuentas.first { it.id == id }

    if (valor > cuenta.saldo) {
        println("No cuenta con el saldo suficiente para el retiro")
        return
    }

    lstCuentas.first { it.id == id }.saldo -= valor

}

fun consignar() {

    print("Digite su Identificación: ")
    val id = readLine() ?: ""

    print("Valor a consignar: ")
    val valor = readLine()?.toDouble() ?: 0.0

    lstCuentas.first { it.id == id }.saldo += valor

}

fun consultarCuenta() {

    print("Digite su Identificación: ")
    val id = readLine() ?: ""

    val cuenta = lstCuentas.firstOrNull { it.id == id }

    println(cuenta?.imprimir() ?: "La cuenta no existe")
}

fun crearCuenta() {

    print("Digite su Identificación: ")
    val id = readLine() ?: ""

    print("Digite su nombre: ")
    val nombre = readLine() ?: ""

    lstCuentas.add(Cuenta(id, nombres = nombre))

}