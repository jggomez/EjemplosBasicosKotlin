enum class Genero {
    Masculino, Femenino
}

data class UsuarioGym(val id: String,
                      val nombres: String,
                      val genero: Genero,
                      val edad: Int,
                      val registros: ArrayList<RegistroEntrada> = ArrayList())

data class RegistroEntrada(val idUsuario: String,
                           val fecha: String,
                           var registroSalida: RegistroSalida? = null)

data class RegistroSalida(val idUsuario: String,
                          val fecha: String)

val lstUsuarioGym = ArrayList<UsuarioGym>()

class Gym {

    fun crearUsuario() {
        print("Digite su identificación: ")
        val id = readLine() ?: ""

        print("Digite su nombre: ")
        val nombres = readLine() ?: ""

        print("Digite su Genero Femenino (F) o Masculino (M): ")
        var generoTmp = readLine() ?: ""
        var genero = Genero.Masculino

        if (generoTmp == "F")
            genero = Genero.Femenino

        print("Digite su Edad: ")
        val edad = readLine()?.toInt() ?: 0

        lstUsuarioGym.add(UsuarioGym(id, nombres, genero, edad))

    }

    fun crearRegistroEntrada() {
        println("Digite Identificación: ")
        val id = readLine() ?: ""

        println("Digite fecha: ")
        val fecha = readLine() ?: ""

        lstUsuarioGym.firstOrNull { it.id == id }?.let { usuario ->
            usuario.registros.firstOrNull {
                it.fecha == fecha &&
                        it.registroSalida == null
            }?.let {
                println("No es posible registrar entrada ya que " +
                        "no tiene registro de salida")
            }
                    ?: usuario.registros.add(RegistroEntrada(id, fecha))
        }

    }

    fun crearRegistroSalida() {
        println("Digite Identificación: ")
        val id = readLine() ?: ""

        println("Digite fecha: ")
        val fecha = readLine() ?: ""

        lstUsuarioGym.firstOrNull { it.id == id }?.let { usuario ->
            usuario.registros.firstOrNull {
                it.fecha == fecha &&
                        it.registroSalida == null
            }?.let { entrada -> entrada.registroSalida = RegistroSalida(id, fecha) }
                    ?: println("No se puede registrar salida porque no tiene entrada")
        }
    }

}

fun main(args: Array<String>) {

    var opcion: Int
    val gym = Gym()

    do {
        println("Bienvenido, que operación deseas hacer:")
        println("1. Crear usuario")
        println("2. Crear Entrada")
        println("3. Crear Salida")
        println("4. Reportes")
        println("5. Salir")
        opcion = readLine()?.toInt() ?: 5

        when (opcion) {
            1 -> gym.crearUsuario()
            2 -> gym.crearRegistroEntrada()
            3 -> gym.crearRegistroSalida()
            4 -> gym.crearRegistroSalida()
        }

    } while (opcion != 5)

}

