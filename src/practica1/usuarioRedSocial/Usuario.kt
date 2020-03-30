package practica1.usuarioRedSocial
import java.time.LocalDate
import kotlin.collections.ArrayList


class Usuario( private val nombreYApellido : String, private val usuario : String,
               private val email : String, private val nacimiento : LocalDate) {

    private var seguidores : List<Usuario> = ArrayList()
    private var seguidos : List<Usuario> = ArrayList()

    fun getNombreYApellido(): String {
        return this.nombreYApellido
    }
    fun getUsuario(): String{
        return this.usuario
    }
    fun getEMail(): String{
        return this.email
    }
    fun getNacimiento(): LocalDate{
        return this.nacimiento
    }
    fun getSeguidores(): List<Usuario> {
        return this.seguidores
    }

    fun getSeguidos(): List<Usuario>{
        return this.seguidos
    }

    fun edad() : Int{
        val fechaActual = LocalDate.now()
        return if (nacimiento.getDayOfYear() < fechaActual.dayOfYear) {
            fechaActual.year - nacimiento.getYear()
        } else {
            fechaActual.year - nacimiento.getYear() - 1
        }

    }

    fun tieneGmail() : Boolean{
        return email.substringAfterLast('@').equals("gmail.com", true)
    }

    fun teSigue(seguidor: Usuario) {
        seguidores += seguidor
        seguidor.seguir(this)
    }

    private fun seguir(u : Usuario) {
        seguidos += u
    }

    fun seguidoresMutuos(): List<Usuario> {
        return  this.seguidoresMutuosSet().toList()
    }

    fun seguidoresMutuosSet(): Set<Usuario> {
        return  seguidores.intersect(seguidos)
    }

}