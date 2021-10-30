package Data;

public class Micasa {

    String puertas;
    String ventanas;
    String cuartos;

    public Micasa(String puertas, String ventanas, String cuartos) {
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.cuartos = cuartos;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas( String puertas) {
        this.puertas = puertas;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String getCuartos() {
        return cuartos;
    }

    public void setCuartos(String cuartos) {
        this.cuartos = cuartos;
    }
}
