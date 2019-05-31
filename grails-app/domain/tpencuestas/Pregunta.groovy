package tpencuestas

class Pregunta {

    String titulo

    static belongsTo = [encuesta : Encuesta]
    static hasMany = [respuestas: Respuesta ]

    static constraints = {
        titulo blank: false
        encuesta nullable: false
        respuestas nullable: false, minSize: 2 //no se puede hacer una pregunta sin mas de 2 respuestas
        //esto significa que cuando se crea se tienen que poner 2 por default
        //todo test
    }
}