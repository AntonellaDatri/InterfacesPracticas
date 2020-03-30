package practica1.conversor
import practica1.conversor.generico.Conversor


class KilometrosAMillas : Conversor() {
    override fun conversor (k : Double) : String{
        return (k * 0.6).toString()
    }
}