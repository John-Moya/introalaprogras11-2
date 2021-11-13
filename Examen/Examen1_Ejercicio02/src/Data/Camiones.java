package Data;

public class Camiones {
    static String placa = "";
    private String marca;
    private String modelo;
    private String peso;

    //Constructores

    public Camiones(String marca, String modelo, String peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }


    //Encapsulamiento

    public static String getPlaca() {
        return placa;
    }

    public static void setPlaca(String placa) {
        Camiones.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
