package poo

class Cuadrado : IFigura {

    override fun calcularArea(): Int {
        println("Longitud del lado")
        val longitud: Int = readLine()?.toInt() ?: 0

        return longitud * longitud
    }

    override fun imprimirNombre(): String {
        return "Cuadrado"
    }


}