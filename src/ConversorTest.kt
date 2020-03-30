import org.junit.Assert.*
import org.junit.Test
import practica1.conversor.*
import practica1.conversor.generico.Generico

class ConversorTest{
    val millasAKilometros = MillasAKilometros()
    val kilometrosAMillas = KilometrosAMillas()
    val bidireccional = Bidireccional()
    val millasKilometrosG  = Generico(millasAKilometros)
    val kilometrosMillasG  = Generico(kilometrosAMillas)


    //millas a kilometros
    @Test
    fun Millas1(){
        assertEquals(millasAKilometros.conversor(1.0), "1.6")
    }
    @Test
    fun Millas5(){
        assertEquals(millasAKilometros.conversor(5.0), "8.0")
    }
//kilometros a millas

    @Test
    fun kilometros1(){
        assertEquals(kilometrosAMillas.conversor(1.0), "0.6")
    }
    @Test
    fun kilometros5(){
        assertEquals(kilometrosAMillas.conversor(5.0), "3.0")
    }

//bidireccional
    @Test
    fun Millas15AKilometros(){
        assertEquals(bidireccional.conversor(15.0, "MilLas"), "24.0")
    }
    @Test
    fun kilometros15AMillas(){
        assertEquals(bidireccional.conversor(15.0, "KilometRos"), "9.0")
    }

//Generico
    @Test
    fun Millas15(){
        assertEquals(millasKilometrosG.conversor(15.0), "24.0")
    }
    @Test
    fun kilometros15(){
        assertEquals(kilometrosMillasG.conversor(15.0), "9.0")
    }
}