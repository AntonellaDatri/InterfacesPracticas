package conversor
import conversor.generico.Conversor


class KilometrosAMillas : Conversor() {
    override fun conversor (k : Double) : String{
        return (k * 0.6).toString()
    }
}