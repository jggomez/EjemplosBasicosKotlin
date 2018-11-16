package poo

class Rectangulo : IFigura {

    override fun calcularArea(): Int {
        println("Altura:")
        val altura: Int = readLine()?.toInt() ?: 0

        println("Base:")
        val base: Int = readLine()?.toInt() ?: 0

        return altura * base
    }

    override fun imprimirNombre(): String {
        return "Rectangulo"
    }
}