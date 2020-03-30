package practica1.conversor
import practica1.conversor.generico.Conversor

class MillasAKilometros : Conversor() {
    override fun conversor(m: Double): String {
        return (m * 1.6).toString()
    }
}

