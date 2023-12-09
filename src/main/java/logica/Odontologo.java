
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona {
    
    private String especialidad;
    
    @OneToOne
    private Horario unHorario;
    
    @OneToOne
    private Usuario usuario;
    
    @OneToMany(mappedBy="odonto") //mapeado por, es decir va a ir a la clase turno y va a buscar algo que se llame turn
    private List<Turno> listaTurnos;

    public Odontologo() {
    }

    public Odontologo(String especialidad, Horario unHorario, Usuario usuario, List<Turno> listaTurnos, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.unHorario = unHorario;
        this.usuario = usuario;
        this.listaTurnos = listaTurnos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    
    
}
