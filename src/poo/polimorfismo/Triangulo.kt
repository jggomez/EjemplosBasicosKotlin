package poo.polimorfismo

class Triangulo : IFigura {

    override fun calcularArea(): Int {
        println("Altura:")
        val altura: Int = readLine()?.toInt() ?: 0

        println("Base:")
        val base: Int = readLine()?.toInt() ?: 0

        return (altura * base) / 2
    }

    override fun imprimirNombre(): String {
        return "Triangulo"
    }
}