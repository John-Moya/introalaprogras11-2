package Data;

public class Taller {

    String Ubicacion;
    String Herramientas;
    String Empleados;
    String Coches;

    public void abrirTaller(){

        System.out.println("Local Abierto");

    }

    public String atenderTaller(String disponibilidad){
        if (Empleados == "Disponible"){
            return "Atendiendo";
        } else {
            return "Espere para ser atentido ";
        }
    }



}
