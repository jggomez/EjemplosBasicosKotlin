package poo.polimorfismo

class Cuadrado : IFigura {

    var result = 10

    var lado = 0

    override fun calcularArea(): Int {
        println("Longitud del lado")
        val longitud: Int = readLine()?.toInt() ?: 0

        return longitud * longitud
    }

    override fun imprimirNombre(): String {
        return "Cuadrado"
    }


}