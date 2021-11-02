package semana05.Practica1;

public class Heladeria {
    String ubicacion;
    int cantidadDeEmpleados;
    boolean isAbierta;

    public void setAbierta(boolean isAbierta) {
        this.isAbierta = isAbierta;
    }

    public boolean isAbierta() {
        return isAbierta;
    }

    public Supervisor supervisor;

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }
    public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }
    
}
