// Clase de datos
data class Usuario(val nombre: String,
                   val apellido: String)

// Funciones extendidas
fun Usuario.imprimir() = "${this.nombre} ${this.apellido}"

fun Usuario.impMayuscula() = "${this.nombre.toUpperCase()} ${this.apellido.toUpperCase()}"

fun Usuario.igualNombre(usuario: Usuario) = this.nombre == usuario.nombre

fun main(args: Array<String>) {
    // Creación de instancias
    val usuario1 = Usuario("Juan", "Gómez")
    val usuario2 = Usuario("Juan", "Torres")

    val lstUsuarios = ArrayList<Usuario>()
    lstUsuarios.add(usuario1)
    lstUsuarios.add(usuario2)

    for (usuario in lstUsuarios) {
        println(usuario.imprimir())
        println(usuario.impMayuscula())
    }

    println("Igual nombre ${usuario1.igualNombre(usuario2)}")

}