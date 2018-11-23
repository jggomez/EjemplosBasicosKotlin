package poo.herencia

class UsuarioAdaptadorToAPI : Adaptador<UsuarioBaseDatos, UsuarioAPI>() {

    override fun adaptarObjeto(usuarioBD: UsuarioBaseDatos): UsuarioAPI {
        return UsuarioAPI(
                usuarioBD.nombres + usuarioBD.apellidos,
                usuarioBD.edad)
    }
}