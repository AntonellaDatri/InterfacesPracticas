import org.junit.Assert.*
import org.junit.Test
import usuarioRedSocial.*
import java.time.LocalDate

class UsuarioTest(){
    val pepa = Usuario("pepa Romero", "pepita",
        "Pepita@gmail.com", LocalDate.of(1999, 12, 4) )
    val pepe = Usuario("pepe Aguirre", "pepon",
        "Pepon@gmail.com", LocalDate.of(2000, 11, 14) )
    val jose = Usuario("jose Rojas", "jose",
    "jose@hotmail.com", LocalDate.of(1990, 1, 5) )

    @Test
    fun edadPepa(){
        assertEquals(20, pepa.edad())
    }
    @Test
    fun edadPepe(){
        assertEquals(19, pepe.edad())
    }
    @Test
    fun edadjose(){
        assertEquals(30, jose.edad())
    }
    @Test
    fun pepaTieneGmail(){
        assertTrue(pepa.tieneGmail())
    }
    @Test
    fun juseNoTieneGmail(){
        assertFalse(jose.tieneGmail())
    }
    @Test
    fun pepaYPepeSeSiguenMutuentePeroPepaSigueAJoseYElNoAElla(){
        pepa.teSigue(pepe)
        pepe.teSigue(pepa)
        jose.teSigue(pepa)
        assertTrue(pepa.seguidoresMutuos().contains(pepe))
        assertTrue(pepe.seguidoresMutuos().contains(pepa))
        assertFalse(pepa.seguidoresMutuos().contains(jose))

    }
}
