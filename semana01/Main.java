package semana01;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String nombre = "Alex";
        int edad = 19;
        System.out.print("Hola");
        System.out.print("Mundo");
        System.out.printf("Hola! Su nombre es %s y su edad es %d", nombre, edad);
        JOptionPane.showMessageDialog(null, "Hola! Con JOptionPane");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese su direccion: ");
        JOptionPane.showMessageDialog(null, ("Su direccion es: " + direccion));
        // Ejercicio
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su salario"));
        JOptionPane.showMessageDialog(null, "Hola, " + nombre1 + "\nTienes " + edad1 + " anhos y tu salario es de "
        + salario + " colones.");
        // Ejercicio suma de 4 numeros
        for (int i = 0; i <= 4; i++) {
            int numero;
            System.out.println("Ingrese un numero para el valor numero " + 1);
            numero = Integer.parseInt(scan.nextLine());
            numero += numero;
        }

        // Ejercicio saludo
        String nombreSaludo = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola, " + nombreSaludo + ", como estas?");
    }
}
