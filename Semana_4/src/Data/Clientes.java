package Data;

public class Clientes {
    public int cedula;
    public String nombre;
    public int factura;

    public static void entrada(){
        System.out.println("Ha ingresado a la farmacia");
    }
    public static void salir(){
        System.out.println("Ha salido de la farmacia");
    }
    public Boolean solicitar(){
        return true;
    }
}
