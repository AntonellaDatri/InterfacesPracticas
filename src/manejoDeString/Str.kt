package manejoDeString

import java.awt.event.KeyEvent

class Str {
    fun revertirS(str: String) : String{
        return str.reversed()
    }
    fun revertirFor(str: String) : String {
        var revertido : String = ""
        for (s:Char in str){
           revertido = s + revertido
        }
        return revertido
    }
    fun isPalindrome ( str : String) : Boolean{
        var s : String = this.revertirS(str)
        return str.equals(s, ignoreCase = true)
    }

    fun vowels(str:  String): Int {
        var vocalesVistas : Int = 0
        for (s:Char in str){
            vocalesVistas += this.sumarSiEsVocal(s)
        }
        return vocalesVistas
    }

    private fun sumarSiEsVocal(s : Char) : Int{
        return if(esVocal(s)){
            1
        } else{
            0
        }
    }

    private fun esVocal(s: Char): Boolean {
        return  s.equals('a', ignoreCase = true) ||
                s.equals('e', ignoreCase = true) ||
                s.equals('i', ignoreCase = true) ||
                s.equals('o', ignoreCase = true) ||
                s.equals('u', ignoreCase = true)
    }

    fun words(str: String): Int {
        var palabrasVistas : Int = 0
        var oracion : String = str
        while (oracion.isNotEmpty()){
            palabrasVistas += this.sumarSiEspalabra(oracion)
            oracion = oracion.substring(1, oracion.length)
        }
        return palabrasVistas
    }

    private fun sumarSiEspalabra(s: String): Int {
        return if((s.length > 1 && s.get(1).equals(' '))|| (s.length == 1 && ! s.get(0).equals(' '))){
            1
        }else{
            0
        }
    }

    fun parrafos(str: String): Int {
        var parrafosVistos : Int = 0
        var parrafo : String = str
        while (parrafo.isNotEmpty()){
            parrafosVistos += this.sumarSiEspalabra(parrafo)
            parrafo = parrafo.substring(1, parrafo.length)
        }
        return parrafosVistos
    }

    private fun sumarSiEsParrafo(s: String): Int {
        return if ( (s.length > 1 && s.get(1).equals(KeyEvent.VK_ENTER)) ||
                    (s.length == 1 && !s.get(0).equals(KeyEvent.VK_ENTER))) {
            1
        } else {
            0
        }
    }
}