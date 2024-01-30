<%@page import="logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
 <div class="container-fluid">
        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Odontologos</h1>
        <p class="mb-4">A continuación podrás acceder al listado de odontologos </p>
        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>DNI</th>
                                <th>Nombre Odontologo</th>
                                <th>Apellido</th>
                                <th>Especialidad</th>
                                <th style="width:210px">Acción</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>DNI</th>
                                <th>Nombre Odontologo</th>
                                <th>Apellido</th>
                                <th>Especialidad</th>
                                <th style="width:210px">Acción</th>
                            </tr>
                        </tfoot>
                        <% List<Odontologo> listaOdontologos = (List)request.getSession().getAttribute("listaOdontologos"); %>
                        <tbody>
                            <% for(Odontologo odon: listaOdontologos){ %>
                            <tr>
                                <td><%=odon.getId() %></td>
                                <td><%=odon.getDni() %></td>
                                <td><%=odon.getNombre() %></td> 
                                <td><%=odon.getApellido() %></td> 
                                <td><%=odon.getEspecialidad() %></td>
                                <td style="display:flex; width:230px;">
                                    <form name="eliminar" action="SvElimOdontologos" method="POST"><!--Esto es para mandar el codigo al servlet-->
                                        <button type="submit" class="btn btn-danger btn-user btn-block" style="margin-right:5px;">
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                        </button>
                                        <input type="hidden" name="id" value="<%=odon.getId()%>"> <!--Esto es para mandar el codigo al servlet-->
                                    </form>
                                    
                                    <form name="editar" action="SvEditOdontologo" method="GET"><!--Esto es para mandar el codigo al servlet-->
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px;">
                                            <i class="fas fa-pencil-alt"></i> Editar
                                        </button>
                                        <input type="hidden" name="id" value="<%=odon.getId() %>"> <!--Esto es para mandar el codigo al servlet-->
                                    </form>
                                    
                                </td>
                            </tr>
                            
                            <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
<%@include file="components/bodyfin.jsp"%>

