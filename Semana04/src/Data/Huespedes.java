package Data;

public class Huespedes {
    public String nombre;
    public String cedula;
    public int estadia;
    public int habitacion;

    public void solicitarComida (){
        System.out.println("El huesped ha solicitado comida");
    }

    public void salida (){
        System.out.println("El huesped ha salido del hotel");
    }
}
