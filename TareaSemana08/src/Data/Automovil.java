package Data;

public class Automovil {
    private int capacidadPasajeros;
    private String placa;
    private String modelo;

    // Hubo que arreglar el constructor
    public Automovil(int capacidadPasajeros, String placa, String modelo) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.placa = placa;
        this.modelo = modelo;
    }

    // Recuerde crear el constructor en blanco
    public Automovil(){

    }
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
