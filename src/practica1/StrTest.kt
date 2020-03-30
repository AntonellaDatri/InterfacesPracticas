package practica1

import practica1.manejoDeString.Str
import org.junit.Assert.*
import org.junit.Test

class StrTest{
    var str = Str()
    @Test
    fun revertirSimple(){
        assertEquals(str.revertirS("Hola"), "aloH")
    }
    @Test
    fun revertirFor(){
        assertEquals(str.revertirFor("Hola"), "aloH")
    }
    @Test
    fun noesCapicua(){
        assertFalse(str.isPalindrome("Hola"))
    }
    @Test
    fun esCapicua(){
        assertTrue(str.isPalindrome("Neuquen"))
    }
    @Test
    fun vocalesHola(){
        assertEquals(str.vowels("holA"), 2)
    }
    @Test
    fun vocalesAcidoClorhidrico(){
        //no contempla acentos
        assertEquals(str.vowels("Acido clorhidrico"), 7)
    }
    @Test
    fun cantidadDePalabras(){
        assertEquals(str.words("construcción de interfaces de usuario"), 5)
    }
    @Test
    fun cantidadDePalabrasTerminaConEspacio(){
        assertEquals(str.words("construcción de interfaces de usuario "), 5)
    }
    @Test
    fun cantidadDeParrafos(){
        assertEquals(str.parrafos(  "construcción " +
                                        "de " +
                                        "interfaces" +
                                        " de" +
                                        " usuario"), 5)
    }
    @Test
    fun cantidadDeParrafosMas1Enter(){
        assertEquals(str.parrafos(  "construcción " +
                "de " +
                "interfaces" +
                " de" +
                " usuario" +
                " "), 5)
    }

}