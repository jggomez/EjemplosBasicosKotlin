package poo.herencia

class UsuarioAdaptadorToBD : Adaptador<UsuarioAPI, UsuarioBaseDatos>() {


    override fun adaptarObjeto(usuarioAPI: UsuarioAPI): UsuarioBaseDatos {
        val nombre = usuarioAPI.nombresYApellidos.split(" ")[0]
        val apellido = usuarioAPI.nombresYApellidos.split(" ")[1]

        return UsuarioBaseDatos(
                nombre,
                apellido,
                usuarioAPI.edad
        )
    }

}