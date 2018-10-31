fun main(args: Array<String>) {
    val operaciones = Operaciones(10, 20)

    println("La suma es ${operaciones.sumar()}")
    println("La suma es ${operaciones.restar()}")
    println("La suma es ${operaciones.multiplicar()}")
    println("La suma es ${operaciones.operar(num1 = 5, num2 = 10)}")
    println("La suma es ${operaciones.operar(num1 = 5, num2 = 10, operador = "resta")}")
    println("La suma es ${operaciones.bucarNumMayor(50, 85)}")

    val arrNums = IntArray(4)
    arrNums[0] = 20
    arrNums[1] = 10
    arrNums[2] = 100
    arrNums[3] = 50
    val resp = operaciones.buscarMayor(arrNums)
    println("El mayor es $resp")
}

class Operaciones(private val num1: Int,
                  private val num2: Int) {

    fun buscarMayor(arrNums: IntArray): Int {
        var tempMayor = 0
        for (elemento in arrNums) {
            if (elemento > tempMayor) {
                tempMayor = elemento
            }
        }
        return tempMayor
    }

    fun bucarNumMayor(num1: Int = 0, num2: Int): Int {
        return when {
            num1 > num2 -> num1
            num2 > num1 -> num2
            else -> -1
        }
    }

    fun sumar(): Int {
        return num1 + num2
    }

    fun restar() = num1 - num2

    fun multiplicar() = num1 * num2

    fun operar(operador: String = "suma",
               num1: Int,
               num2: Int): Int {

        return when (operador) {
            "suma" -> num1 + num2
            "resta" -> num1 - num2
            "mult" -> num1 * num2
            else -> -1
        }

    }

}






