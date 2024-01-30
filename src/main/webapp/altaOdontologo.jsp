<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
<h1>Crea un Nuevo Odontólogo</h1>
<form class="user" action="/SvOdontologos" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni"
                placeholder="dni">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                placeholder="Teléfono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="nacimiento" name="nacimiento"
                placeholder="Fecha de nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad"
                placeholder="Especialidad">
        </div>

        <!-- Aqui vendra todo lo necesario a horarios y usuarios -->
    </div>                            
    <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
        Crear Odontologo
    </button>
</form>
<%@include file="components/bodyfin.jsp"%>