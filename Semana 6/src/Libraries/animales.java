package Libraries;

public class animales {

    private String raza;
    private String alimento;
    private String edad;

    //Constructor
    public animales(String saberRaza, String tipoAlimento, String saberEdad) {
        this.raza = saberRaza;
        this.alimento = tipoAlimento;
        this.edad = saberEdad;

    }

    //Encapsulamiento
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
