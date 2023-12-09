<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
<h1>Crea un Nuevo Usuario</h1>
<p>Este es el apartado para dar alta los diferentes usuarios del sistema</p>
<form class="user" action="/SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                placeholder="nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                placeholder="Password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                placeholder="Rol">
        </div>
    </div>                            
    <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
        Crear Usuario
    </button>
</form>
<%@include file="components/bodyfin.jsp"%>
