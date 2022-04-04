package PersonaEntidades;

import java.util.Date;

public class PersonaEntidades {
    
    public String Nombre;
    public Date fecha;

    public PersonaEntidades() {
    }

    public PersonaEntidades(String Nombre, Date fecha) {
        this.Nombre = Nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
