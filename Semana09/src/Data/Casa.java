package Data;
public class Casa {
    String metros;
    String precio;
    int habitaciones;
    Extras[] lasExtras;
    public Casa(String metros, String precio, int habitaciones, Extras[] lasExtras) {
        this.metros = metros;
        this.precio = precio;
        this.habitaciones = habitaciones;
        this.lasExtras = lasExtras;
    }
    public Casa() {
    }
    public Extras[] getLasExtras() {
        return lasExtras;
    }
    public void setLasExtras(Extras[] lasExtras) {
        this.lasExtras = lasExtras;
    }
    public String getMetros() {
        return metros;
    }
    public void setMetros(String metros) {
        this.metros = metros;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public int getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }
}
