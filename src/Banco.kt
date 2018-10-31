fun main(args: Array<String>) {
    menu()
}

data class Cuenta(val id: String, val nombres: String,
                  var saldo: Double)

fun Cuenta.imprimir() =
        "${this.id} - ${this.nombres} - ${this.saldo}"

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
        println("6. Salir")
        opcion = readLine()?.toInt() ?: 5
    } while (opcion != 5)
}