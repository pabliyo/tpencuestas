package tpencuestas

class Encuesta {

    String titulo

    static hasMany = [preguntas: Pregunta ]

    static constraints = {
        titulo blank: false
        preguntas nullable: false, minSize: 1 //no se puede hacer una encuesta sin preguntas
        //esto significa que cuando se crea se tiene que poner 1 por default
        //todo test
    }

    static mapping = {
        preguntas cascade: "all-delete-orphan", sort: "id"
    }

}