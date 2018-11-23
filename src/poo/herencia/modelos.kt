package poo.herencia


data class UsuarioBaseDatos(val nombres: String,
                            val apellidos: String,
                            val edad: Int,
                            val email: String = "")

data class UsuarioAPI(val nombresYApellidos: String,
                      val edad: Int)