package conversor

class Bidireccional {
    private fun kilometrosAMillas (k : Double) : String{
        return (k * 0.6).toString()
    }

    private fun millasAKilometros(m: Double): String {
        return (m * 1.6).toString()
    }

    fun conversor(n : Double, tipo : String) : String{
        if (tipo.equals("millas", ignoreCase = true)){
            return this.millasAKilometros(n);
        }
        else if (tipo.equals("kilometros", ignoreCase = true))  {
            return this.kilometrosAMillas(n)
        }
        else {
            return  "No se conoce ese tipo de medicion, intentelo de nuevo"
        }
    }
}