package tpencuestas

class Respuesta {

    String titulo //El valor a mostrar por pantalla SI/NO/NOSE ,si es soc ver de usar un id
    User votante
    static belongsTo = [pregunta : Pregunta]

    static constraints = {
        titulo blank: false
        pregunta nullable: false
        //todo test
    }
}
