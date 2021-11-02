package semana05.Practica02;

public class Vendedor {
    
    String nombre, licenciaDeBR;
    int casasVendidas;
    public Vendedor(){}


    /**
     * @return the casasVendidas
     */
    public int getCasasVendidas() {
        return casasVendidas;
    }

    /**
     * @param casasVendidas the casasVendidas to set
     */
    public void setCasasVendidas(int casasVendidas) {
        this.casasVendidas = casasVendidas;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the licenciaDeBR
     */
    public String getLicenciaDeBR() {
        return licenciaDeBR;
    }

    /**
     * @param licenciaDeBR the licenciaDeBR to set
     */
    public void setLicenciaDeBR(String licenciaDeBR) {
        this.licenciaDeBR = licenciaDeBR;
    }
    
}