<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>APP WEB ENCUESTAS</title>
</head>
<body>
<content tag="nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li>
                            <li class="dropdown-item"><a href="#">Perfil</a>
                        </li>
                        <li>
                            <g:link controller='logout'>Logout</g:link>
                        </li>
        </ul>
    </li>
</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Bienvenido a Encuestas!</h1>

        <p>
            Bienvenido a la nueva App de Encuestas. Usted podra crear sus propias encuestas y opciones
            podra compartir con toda la comunidad y amigos. Disfrutela !.
        </p>

        <div id="controllers" role="navigation">
            <h2>Controladores disponibles:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>