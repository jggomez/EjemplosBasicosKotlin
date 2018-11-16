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

    fun contarIngresosUsuarioxDia() {

        println("Digite Identificación: ")
        val id = readLine() ?: ""

        println("Digite fecha: ")
        val fecha = readLine() ?: ""

        lstUsuarioGym.firstOrNull { it.id == id }?.let { usuario ->
            val numRegistros = usuario.registros.filter { it.fecha == fecha }.count()
            println("Ingresos del usuario ${id} para la fecha ${fecha} fueron ${numRegistros} veces")
        }

    }

    fun contarHombresyMujeres() {
        val numHombres = lstUsuarioGym.filter { it.genero == Genero.Masculino }.count()
        val numMujeres = lstUsuarioGym.filter { it.genero == Genero.Femenino }.count()

        println("El número de Hombres el el gym es de ${numHombres}")
        println("El número de Mujeres el el gym es de ${numMujeres}")
    }

    fun contarUsuariosMayores50() {
        val numMayor50 = lstUsuarioGym.count { it.edad > 50 }
        println("Usuarios mayores a 50 años => ${numMayor50}")
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
        println("4. Ingresos de usuario por día")
        println("5. Usuarios Hombres y Mujeres")
        println("6. Usuarios mayores a 50 años")
        println("7. Salir del Gym")
        opcion = readLine()?.toInt() ?: 7

        when (opcion) {
            1 -> gym.crearUsuario()
            2 -> gym.crearRegistroEntrada()
            3 -> gym.crearRegistroSalida()
            4 -> gym.contarIngresosUsuarioxDia()
            5 -> gym.contarHombresyMujeres()
            6 -> gym.contarUsuariosMayores50()
        }

    } while (opcion != 7)

}
