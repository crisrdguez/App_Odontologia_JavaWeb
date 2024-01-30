<%@page import="logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
<h1>Editar Odontologo</h1>
<p>Este es el apartado para editar un odontologo del sistema</p>

<% Odontologo odon = (Odontologo)request.getSession().getAttribute("odonEditar"); %>
<form class="user" action="/SvEditOdontologo" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" value="<%=odon.getDni() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" value="<%=odon.getNombre() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido" value="<%=odon.getApellido() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono" value="<%=odon.getTelefono() %>"
                >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion" name="direccion" value="<%=odon.getDireccion() %>"
                >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="nacimiento" name="nacimiento" value="<%=odon.getFecha_nac() %>"
                >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad" value="<%=odon.getEspecialidad()%>"
                >
        </div>

        <!-- Aqui vendra todo lo necesario a horarios y usuarios -->
    </div>                                 
    <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
        Editar Odontologo
    </button>
</form>
<%@include file="components/bodyfin.jsp"%>
