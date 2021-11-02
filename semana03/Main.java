package semana03;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion numero " + i);
        }

        for (int i = 10; i > 0; i--) { // decremento: i > -1, -2, -n
            System.out.println(i);
        } System.out.println("Feliz anho nuevo!");

        for (int i = 0; i < 11; i++) {
            System.out.println("Incremento numero " + i);
        }

        int j = 1;
        while (j < 5) {
            System.out.println("Iteracion " + j);
            j++;
        }

        while (j < 11) {
            System.out.println("Iteracion " + j);
            j++;
        }

        int test = 0;
        while (test < 5) {
            for (int i = 0; i < 10; i++) {
                System.out.print("@");
            }
            System.out.println("\n");
            test++;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("@@@@@@@@@@");
        }

        System.out.println("Ingrese un numero: "); 
        int numero = scan.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }

        System.out.println("Ingrese un numero: "); 
        int numero2 = scan.nextInt();
        for (int i = 0; i < numero2; i++) {
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println("Ingrese la opcion que desea. \n1. Ver precio de tiquetes \n2. Comprar tiquetes"
        + "\n Ingresar datos de usuario \n4. Salir: ");
        int opcion = Integer.parseInt(scan.next());
        do {
            if (opcion == 1) {
                System.out.println("Ninhos menores de 12 anhos: 10.000 \nAdulto regular: 20.000 \nTercera edad: 12.500");
            } else if (opcion == 2) {
                System.out.print("Ingrese la cantidad de tiquetes: ");
                int cantTiquetes = Integer.parseInt(scan.next());
                System.out.println("Su total seria: " + cantTiquetes * 20000);
            } else if (opcion == 3) {
                System.out.println("Ingrese su nombre: ");
                String nombreUsuario = scan.next();
                System.out.println("Ingrese su edad: ");
                int edad = Integer.parseInt(scan.next());
            }
        } while (opcion != 4);
    }   
}
