package poo.herencia

abstract class Adaptador<IN, OUT> {

    fun adaptarLista(usuarioAPI: List<IN>): List<OUT> {
        val lst = ArrayList<OUT>()

        usuarioAPI.forEach {
            lst.add(adaptarObjeto(it))
        }

        return lst

    }

    abstract fun adaptarObjeto(obj : IN) : OUT

}