
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turno;
    
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String horaTurno;
    private String afeccion;

    //Creamos un atributo de odontologo
    @ManyToOne
    @JoinColumn(name="id_odonto")  //nombre que va a tener en este caso la foreignkey que voy a tener
    private Odontologo odonto;
    
    @ManyToOne
    @JoinColumn(name="id_pacient")  //nombre que va a tener en este caso la foreignkey que voy a tener
    private Paciente pacient;
    
    public Turno() {
    }

    public Turno(int id_turno, Date fechaTurno, String horaTurno, String afeccion) {
        this.id_turno = id_turno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
    
    
}
