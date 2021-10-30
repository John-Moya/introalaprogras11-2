package Data;

public class Restaurante {

    private boolean servicio;
    private String menu;
    private String pago;
    public Cliente ingreso;


    public Restaurante(boolean servicio, String menu, String pago) {
        this.servicio = servicio;
        this.menu = menu;
        this.pago = pago;
        this.ingreso= new Cliente("305840741","Juan","Brenes");
    }


    public boolean getServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }


}
