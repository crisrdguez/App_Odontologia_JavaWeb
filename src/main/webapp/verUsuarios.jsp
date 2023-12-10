<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyinicio.jsp"%>
 <div class="container-fluid">
        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
        <p class="mb-4">A continuación podrás acceder al listado de usuarios </p>
        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre Usuario</th>
                                <th>Rol</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>Nombre Usuario</th>
                                <th>Rol</th>
                            </tr>
                        </tfoot>
                        <% List<Usuario> listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios"); %>
                        <tbody>
                            <% for(Usuario usu: listaUsuarios){ %>
                            <tr>
                                <td><%=usu.getId_usuario() %></td>
                                <td><%=usu.getNombreUsuario() %></td>
                                <td><%=usu.getRol() %></td>
                            </tr>
                            
                            <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
<%@include file="components/bodyfin.jsp"%>
