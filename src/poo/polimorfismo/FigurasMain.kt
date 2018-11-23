package poo.polimorfismo

fun main(args: Array<String>) {

    val figurasMain = FigurasMain()
    var figura : IFigura = Cuadrado()

    figurasMain.imprimirDatos(figura)

    figura = Rectangulo()

    figurasMain.imprimirDatos(figura)

    figura = Triangulo()

    figurasMain.imprimirDatos(figura)

}

class FigurasMain {

    fun imprimirDatos(figura: IFigura) {
        println("El area del ${figura.imprimirNombre()} es de => ${figura.calcularArea()}")
    }

}