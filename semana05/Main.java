package semana05;

public class Main {
    public static void main(String[] args) {
        /*
        Puntos a tomar en cuenta a la hora de escoger un paradigma de programacion:
            - Rendimiento
            - Legibilidad
            - Reutilizacion
            - Tipo de flujo (secuencial o recursivo)
        */
        
        Fabrica miFabrica = new Fabrica();
        miFabrica.abreFabrica();
        System.out.println(miFabrica.nombreDeEncargado());
        
    }
}
