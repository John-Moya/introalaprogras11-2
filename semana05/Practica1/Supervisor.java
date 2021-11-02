package semana05.Practica1;

public class Supervisor {
    String nombre = "Test"; 
    String cargo;
    int edad, longevidadEnEmpresa;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getLongevidadEnEmpresa() {
        return longevidadEnEmpresa;
    }
    public void setLongevidadEnEmpresa(int longevidadEnEmpresa) {
        this.longevidadEnEmpresa = longevidadEnEmpresa;
    }
}
