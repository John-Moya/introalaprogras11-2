package Data;

public class Automoviles {
    private String placa = "";
    private String nombre_clientes;
    private String precio_hora;

    //Constructores

    public Automoviles(String placa, String nombre_clientes, String precio_hora) {
        this.placa = placa;
        this.nombre_clientes = nombre_clientes;
        this.precio_hora = precio_hora;
    }


    //Encapsulamiento


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre_clientes() {
        return nombre_clientes;
    }

    public void setNombre_clientes(String nombre_clientes) {
        this.nombre_clientes = nombre_clientes;
    }

    public String getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(String precio_hora) {
        this.precio_hora = precio_hora;
    }
}
