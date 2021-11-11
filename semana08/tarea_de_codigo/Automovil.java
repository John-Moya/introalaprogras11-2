package semana08.tarea_de_codigo;

public class Automovil {
    private String placa, modelo;
    private int capacidadPasajeros;

    public Automovil() {
        this.placa = "";
        this.modelo = "";
        this.capacidadPasajeros = 0;
        
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
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    
}
