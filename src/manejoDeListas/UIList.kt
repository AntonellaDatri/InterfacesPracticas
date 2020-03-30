package manejoDeListas

import com.sun.org.apache.bcel.internal.generic.NEW
import java.util.*
import kotlin.collections.ArrayList

class UIList {
    fun isSorted(list: List<Int>) : Boolean{
        var l : List<Int> = list
        while ( l.size >= 2 && l.first() < l.get(1) ){
            l = l.drop(1)
        }
        return l.size == 1
    }

    fun asc(list: List<Int>, b: Boolean): List<Int> {
        return if (b){
            this.ordenarDeMenorAMayor(list)
        }else{
            this.ordenarDeMayorAMenor(list)
        }
    }

    private fun ordenarDeMayorAMenor(list: List<Int>): List<Int> {
        return list.sortedDescending()
    }

    private fun ordenarDeMenorAMayor(list: List<Int>): List<Int> {
        return list.sorted()
    }

    fun powMap(list: List<Int>): List<Int> {
        var potecias : List<Int> = ArrayList()
        for(l : Int in list){
            potecias += (l*l)
        }
        return potecias
    }

    fun sumProdPos(list: List<Int>): Int {
        var suma : Int = 0
        var indice : Int = 1
        for (l : Int in list){
            suma += l * indice
            indice += 1
        }
        return suma
    }


}