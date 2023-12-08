
package logica;

import java.util.Date;

public class Responsable extends Persona {
    
    private int id_responsable;
    private String tipoResp;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipoResp, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipoResp = tipoResp;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }
    
    
    
}
