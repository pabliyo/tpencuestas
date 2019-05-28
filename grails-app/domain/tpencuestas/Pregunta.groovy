package tpencuestas

class Pregunta {

    String titulo
    long numeroVotaciones

    static belongsTo = [encuesta : Encuesta]

    static constraints = {
        titulo(blank:false)
        encuesta(nullable:true)
    }
}