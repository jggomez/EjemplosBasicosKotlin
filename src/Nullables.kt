fun main(args: Array<String>) {
    convertirCadenaMayuscula("Juan")
    val (long1, long2) = obtenerTamListas(ArrayList<Int>(),
            null)
    println(long1)
    println(long2)
    operadorAny("Test")
    operadorAny(5)
}

fun operadorAny(valor: Any) {

    if (valor is String) {
        // Realizo operacion
    }

    if (valor is Int) {
        // Realizo operacion
    }

}

fun convertirCadenaMayuscula(cadena: String?): String {
    return cadena?.toUpperCase() ?: ""
}

fun obtenerTamListas(list1: List<Int?>, list2: List<Int>?):
        Pair<Int, Int> {

    val long1 = list1.size
    val long2 = list2?.size ?: 0

    return Pair(long1, long2)

}