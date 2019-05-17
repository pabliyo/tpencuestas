package tpencuestas

class Encuesta {

    String titulo
    long numeroTotalVotaciones

    static hasMany = [ opciones : Opcion ]

    static constraints = {
        titulo(blank:false)
    }

    static mapping = {
        opciones(cascade:"all-delete-orphan", sort:"id")
    }

}