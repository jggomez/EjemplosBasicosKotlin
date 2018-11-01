val lstNumeros = ArrayList<Int>()

fun main(args: Array<String>) {
    lstNumeros.add(5)
    lstNumeros.add(10)
    lstNumeros.add(20)

    lstNumeros.filtrar {
        it > 10
    }.forEach {
        println(it)
    }

    lstNumeros.filtrar(filtroIgual)
            .forEach {
                println(it)
            }
}

fun List<Int>.filtrar(funcFiltrar: (Int) -> Boolean)
        : List<Int> {

    val lstFiltrada = ArrayList<Int>()
    this.forEach {
        if (funcFiltrar(it)) {
            lstFiltrada.add(it)
        }
    }
    return lstFiltrada
}

val filtroIgual: (Int) -> Boolean = { x ->
    x == 10
}

