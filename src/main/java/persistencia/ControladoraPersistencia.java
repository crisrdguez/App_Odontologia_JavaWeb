
package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

/**
 *
 * @author Cris
 */
public class ControladoraPersistencia {
    
    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController odontologoJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuarioJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
        return usuarioJPA.findUsuarioEntities();
        
    }
}
