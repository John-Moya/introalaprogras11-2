package semana05.Practica1;

import java.util.*;

public class Main {
        public static void main(String[] args) {
        Heladeria heladeria = new Heladeria();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el estado de la heladeria");
        String estadoHeladeria = scan.nextLine();
        if (estadoHeladeria.equals("Abierta")) {
            heladeria.setAbierta(true);
        } else {
            heladeria.setAbierta(false);
        }
        System.out.println("Estado de la heladeria: " + heladeria.isAbierta);
    }
}
