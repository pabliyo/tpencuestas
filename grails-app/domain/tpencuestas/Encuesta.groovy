package tpencuestas

class Encuesta {

    String titulo
    long numeroTotalVotaciones

    static hasMany = [preguntas: Pregunta ]

    static constraints = {
        titulo(blank:false)
    }

    static mapping = {
        preguntas(cascade:"all-delete-orphan", sort:"id")
    }

}