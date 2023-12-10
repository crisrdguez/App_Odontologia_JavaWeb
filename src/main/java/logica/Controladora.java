
package logica;


import java.util.ArrayList;
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
    
}
