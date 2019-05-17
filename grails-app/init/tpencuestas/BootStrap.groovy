package tpencuestas




class BootStrap {

    def init = { servletContext ->

        8.times { encuestaIndex ->
            Encuesta encuesta = new Encuesta(titulo: "Encuesta ${encuestaIndex}")
            2.times { opcionIndex ->
             encuesta.addToOpciones(titulo: "Titulo ${encuestaIndex} - ${opcionIndex}" )
            }
           encuesta.save()

        }


        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')

        def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')

        def admin = User.findOrSaveWhere(username: 'pabliyo' , password: 'pabliyo' , firstName: 'pablo' , lastName: 'feliz' , email: 'pabliyo_racing@hotmail.com')

        def user = User.findOrSaveWhere(username: 'fernando' , password: 'fernando' , firstName: 'fernando' , lastName: 'tejelo' , email: 'fer_tejelo@hotmail.com')

        if(!admin.authorities.contains(adminRole)){
            UserRole.create(admin,adminRole, true)
        }

        if(!user.authorities.contains(adminRole)){
            UserRole.create(user,userRole, true)
        }

    }
    def destroy = {
    }
}
