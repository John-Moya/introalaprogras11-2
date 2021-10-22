package Data;
public class Fabrica {

    String producto;
    String volumen;
    String empleados;
    public Municipio municipio;

    public void abreFabrica(){
        System.out.println("La fabrica abrio");
    }// Cuando el metodo es Void es no tipado

    public String nombreDeEncargado(String nombre){
        if (nombre == "Luis"){
            return "EL TURNO ES EL DIURNO";
        } else {
            return "El turno es el nocturno";
        }
    }// Tipado

}