package poo.herencia

fun main(args: Array<String>) {

    val adaptadorAPI = UsuarioAdaptadorToAPI()

    val lstUsuarioBD = ArrayList<UsuarioBaseDatos>()
    lstUsuarioBD.add(UsuarioBaseDatos("juan", "Gomez", 15))
    lstUsuarioBD.add(UsuarioBaseDatos("Carolina", "Vallejo", 28))
    lstUsuarioBD.add(UsuarioBaseDatos("Daniela", "Liscano", 23))

    val lstUsuarioAPIs = adaptadorAPI.adaptarLista(lstUsuarioBD)

    lstUsuarioAPIs.forEach {
        println(it.nombresYApellidos)
    }

}