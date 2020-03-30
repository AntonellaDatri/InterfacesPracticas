package practica1.conversor.generico

class Generico(private var tipoConversor: Conversor){
 //   abstract var practica1.usuarioRedSocial.conversor : Conversor

    fun conversor(num : Double) : String{
        return (tipoConversor.conversor(num)).toString()
    }

    fun setTipoConversor(c : Conversor) {
        tipoConversor = c
    }

//    fun Generico(practica1.usuarioRedSocial.conversor: Conversor){
//        this.practica1.usuarioRedSocial.conversor = practica1.usuarioRedSocial.conversor
//    }
}