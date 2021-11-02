package semana07.examen.Ejercicio03;

public class Paciente {
    private String nombre, cedula, estadia;
    private Medico medico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstadia() {
        return estadia;
    }
    
    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
