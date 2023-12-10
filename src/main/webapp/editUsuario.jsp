<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
<h1>Editar Usuario</h1>
<p>Este es el apartado para editar un usuario del sistema</p>

<% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar"); %>
<form class="user" action="/SvEditUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu" value="<% usu.getNombreUsuario(); %>"
                >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password" value="<% usu.getPassword(); %>"
                placeholder="Password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol" value="<% usu.getRol(); %>"
                placeholder="Rol">
        </div>
    </div>                            
    <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
        Editar Usuario
    </button>
</form>
<%@include file="components/bodyfin.jsp"%>
