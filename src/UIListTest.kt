import org.junit.Assert.*
import practica1.manejoDeListas.*
import org.junit.Test

class UIListTest {
    val lista: UIList = UIList()

    @Test
    fun estaOrdenada() {
        var list: List<Int> = (1..3).toList()
        assertTrue(lista.isSorted(list))
    }

    @Test
    fun noEstaOrdenada() {
        var list: List<Int> = listOf(1, 4, 3)
        assertFalse(lista.isSorted(list))
    }

    @Test
    fun debeEstaOrdenadaMayorAMenor() {
        var list: List<Int> = listOf(1, 4, 3)
        assertTrue(lista.asc(list, false).equals(listOf(4, 3, 1)))
    }

    @Test
    fun debeEstaOrdenadaMenorAMayor() {
        var list: List<Int> = listOf(1, 4, 3)
        assertTrue(lista.asc(list, true).equals(listOf(1, 3, 4)))

    }

    @Test
    fun cuadradosDe(){
        assertTrue(lista.powMap(listOf(1, 2, 3, 4, 5)).equals(listOf(1, 4, 9, 16, 25)))
    }
    @Test
    fun sumProdPos(){
        assertTrue(lista.sumProdPos(listOf(1, 1, 2, 3, 5, 8)).equals(94))
    }
}