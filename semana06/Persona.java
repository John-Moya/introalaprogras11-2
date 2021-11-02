package semana06;

public class Persona {
    private String nombre, edad, profesion;
    public Empresa lugarDeTrabajo;

    public Persona(String nombre, String edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.lugarDeTrabajo = new Empresa("EMR", 1600);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public Empresa getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }
    public void setLugarDeTrabajo(Empresa lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }
}
