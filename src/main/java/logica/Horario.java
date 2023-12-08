
package logica;

public class Horario {
    
    private int id_horario;
    private String horarioInicio;
    private String horarioFin;

    public Horario() {
    }

    public Horario(int id_horario, String horarioInicio, String horarioFin) {
        this.id_horario = id_horario;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }
    
    
    
}
