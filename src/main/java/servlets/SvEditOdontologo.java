
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;

@WebServlet(name = "SvEditOdontologo", urlPatterns = {"/SvEditOdontologo"})
public class SvEditOdontologo extends HttpServlet {
    
     Controladora control = new Controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traemos la id del input
        int id = Integer.parseInt(request.getParameter("id"));
        
        Odontologo odon = control.traerOdon(id);
        
        HttpSession misesion = request.getSession();
        
        misesion.setAttribute("odonEditar", odon);
        
        response.sendRedirect("editOdontologo.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dniOdon = request.getParameter("dni"); 
        String nombreOdon = request.getParameter("nombre");
        String apellidoOdon = request.getParameter("apellido");
        String telefonoOdon = request.getParameter("telefono"); 
        String direccionOdon = request.getParameter("direccion");
        String nacimientoOdonStr = request.getParameter("nacimiento");//"yyyy-MM-dd"
        String especialidadOdon = request.getParameter("especialidad");
        
        // Utiliza SimpleDateFormat para convertir la cadena a un objeto Date
        Date nacimientoOdon = null;
        
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Parsea la fecha del formulario
            Date parsedDate = inputFormat.parse(nacimientoOdonStr);

            // Formatea la fecha en el formato deseado
            nacimientoOdon = outputFormat.parse(outputFormat.format(parsedDate));
        } catch (ParseException e) {
            e.printStackTrace(); // Manejo de errores, puedes personalizar esto según tus necesidades
        }

        
        Odontologo odon = (Odontologo)request.getSession().getAttribute("odonEditar");
        
        odon.setDni(dniOdon);
        odon.setNombre(nombreOdon);
        odon.setApellido(apellidoOdon);
        odon.setTelefono(telefonoOdon);
        odon.setDireccion(direccionOdon);
        odon.setFecha_nac(nacimientoOdon);
        odon.setEspecialidad(especialidadOdon);
        
        control.editarOdontologo(odon);
        
        response.sendRedirect("SvOdontologos");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
