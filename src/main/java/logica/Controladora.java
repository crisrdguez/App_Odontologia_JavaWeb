
package logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Cris
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String pass, String rol){
        
     Usuario usu =  new Usuario();
     usu.setNombreUsuario(nombreUsuario);
     usu.setPassword(pass);
     usu.setRol(rol);
     controlPersis.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }

    public void borrarUsu(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String password) {
        
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getPassword().equals(password)){
                    ingreso=true;
                }else{
                    ingreso=false;
                }
            }
        }
        
        return ingreso;
        
    }
    
    //Odontologos

    public void crearOdontologo(String dniOdon, String nombreOdon, String apellidoOdon, String telefonoOdon, 
            String direccionOdon, Date nacimientoOdon, String especialidadOdon) {
        
        Odontologo odon =  new Odontologo();
        
        odon.setDni(dniOdon);
        odon.setNombre(nombreOdon);
        odon.setApellido(apellidoOdon);
        odon.setTelefono(telefonoOdon);
        odon.setDireccion(direccionOdon);
        odon.setFecha_nac(nacimientoOdon);
        odon.setEspecialidad(especialidadOdon);
        
        controlPersis.crearOdontologo(odon);
    }

    public List<Odontologo> getOdontologos() {
        return controlPersis.getOdontologos();
    }

    public void borrarOdontologo(int id) {
        controlPersis.borrarOdontologo(id);
    }

    public Odontologo traerOdon(int id) {
        return controlPersis.traerOdon(id);
    }

    public void editarOdontologo(Odontologo odon) {
        controlPersis.editarOdontologo(odon);
    }
}
    

