package semana08.tarea_de_codigo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Crear objeto automovil
        Automovil automovil = new Automovil();

        // Definir variables
        int cantAutomoviles, cantPasajeros;
        String placa, modelo;

        // Crear array de automoviles
        Automovil[] automoviles;
        System.out.println("Ingrese la cantidad de automoviles: ");
        cantAutomoviles = Integer.parseInt(scan.next());
        automoviles = new Automovil[cantAutomoviles];

        for (int i = 1; i < automoviles.length + 1; i++) {
            System.out.println("Automovil " + i);  
            System.out.println("Ingrese la placa: ");
            placa = scan.next(); automovil.setPlaca(placa);
            System.out.println("Ingrese el modelo: ");
            modelo = scan.next(); automovil.setModelo(modelo);
            System.out.println("Ingrese la cantidad de pasajeros: ");
            cantPasajeros = Integer.parseInt(scan.next()); automovil.setCapacidadPasajeros(cantPasajeros);
        }

        System.out.println(automoviles.toString());
    }
}
