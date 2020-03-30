package conversor.generico

class Generico(private var tipoConversor: Conversor){
 //   abstract var conversor : Conversor

    fun conversor(num : Double) : String{
        return (tipoConversor.conversor(num)).toString()
    }

    fun setTipoConversor(c : Conversor) {
        tipoConversor = c
    }

//    fun Generico(conversor: Conversor){
//        this.conversor = conversor
//    }
}