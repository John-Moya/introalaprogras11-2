package Data;

public class Mecanico {

    private String nombre;
    private String herramientas;


    public Mecanico(String nombre, String herramientas) {
        this.nombre = nombre;
        this.herramientas = herramientas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }
}
