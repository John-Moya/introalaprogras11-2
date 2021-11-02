package semana05.Practica02;

import java.util.*;

public class Casa {
    String ubicacion;
    int cantidadDeEstrellas; // 1 - 5 estrellas
    public Casa () {}

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the cantidadDeEstrellas
     */
    public int getCantidadDeEstrellas() {
        return cantidadDeEstrellas;
    }

    /**
     * @param cantidadDeEstrellas the cantidadDeEstrellas to set
     */
    public void setCantidadDeEstrellas(int cantidadDeEstrellas) {
        this.cantidadDeEstrellas = cantidadDeEstrellas;
    }
}
