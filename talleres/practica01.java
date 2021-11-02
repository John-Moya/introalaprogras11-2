package talleres;
import java.util.*;


public class practica01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        double a =  Double.parseDouble(scan.next());
        System.out.println("Ingrese un segundo valor: ");
        double b = Double.parseDouble(scan.next());
        double primerRedondeo = Math.round(a);
        double segundoRedondeo = Math.round(b);
        if (primerRedondeo > segundoRedondeo) {
            System.out.println("El primer valor, el cual es " + primerRedondeo + " es mayor.");
        } else if (segundoRedondeo > primerRedondeo) {
            System.out.println("El segundo valor, el cual es " + segundoRedondeo + " es mayor.");
        }
    }
}

