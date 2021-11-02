package semana02;

import javax.swing.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = "Alex";
        int numero = 25;
        float temperatura = 25.06F;
        double currency = 25.000;
        char inicial = 'a';

        String microfono1 = "AT2020";
        String microfono2 = "Blue Yeti";

        /*
        if (microfono1 == "AT2020"){
            System.out.println("Este microfono sirve para streaming.");
        }
         */

        int numeroPlaca = 141536;
        int numeroPlaca2 = 248577;
        int numeroPlaca3 = 126710;

        /*
        if (numeroPlaca == 141536){
            System.out.println("Puede salir los dias pares");
        } else {
            System.out.println("Debe usar un auto con placa impar, que podria ser " + numeroPlaca2);
        }
         */

        /*
        Operadores relacionales
        == : Es igual a
        => : igual o mayor a
        <= : igual o menor a
        != : diferente de
        > : mayor que
        < : menor que
        */

        /*
        int prueba = 15;
        if(prueba == 15) {
            System.out.println("Los datos coinciden.");
        }

        // Ejercicio SAT
        int notaSAT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificacion del SAT: "));
        if (notaSAT >= 800){
            JOptionPane.showMessageDialog(null, "Puede matricular las carreras de Medicina, Informatica o Enfermeria");
        } else {
            JOptionPane.showMessageDialog(null, "Puede matricular un tecnico.");
        }

        // Ejercicio voto
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Usted es e legible para votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Usted aun no es elegible para votar.");
        }

        // Ejercicio calificaciones
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion del estudiante: "));
        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "El estudiante aprobo el curso.");
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante reprobo el curso.");
        }
         */

        /*
        // Ejercicio if compuesto provincias
        int provincia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de su provincia: "));
        if (provincia == 1){
            JOptionPane.showMessageDialog(null, "Usted nacio en San Jose.");
        } else if (provincia == 2) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Alajuela.");
        } else if (provincia == 3) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Cartago.");
        } else if (provincia == 4) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Heredia.");
        } else if (provincia == 5) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Guanacaste.");
        } else if (provincia == 6) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Puntarenas.");
        } else if (provincia == 7) {
            JOptionPane.showMessageDialog(null, "Usted nacio en Limon.");
        } else {
            JOptionPane.showMessageDialog(null, "Provincia indefinida.");
        }
        */

        // Switch dias de la semana
        System.out.println("Ingrese un numero del 1 al 7");
        int dia = Integer.parseInt(scan.nextLine());
        switch (dia) {
            case 1 -> System.out.println("El dia es domingo y es dia laboral.");
            case 2 -> System.out.println("El dia es lunes y es dia laboral.");
            case 3 -> System.out.println("El dia es martes y es dia laboral.");
            case 4 -> System.out.println("El dia es miercoles y es dia laboral.");
            case 5 -> System.out.println("El dia es jueves y es dia laboral.");
            case 6 -> System.out.println("El dia es viernes y es dia laboral.");
            case 7 -> System.out.println("El dia es sabado y es dia laboral.");
            default -> System.out.println("No ha ingresado una opcion valida.");
        }

        // Ejercicio casa de empenho
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del articulo: "));
        int precioRedondeado = Math.round(precio);
        JOptionPane.showMessageDialog(null, "Precio redondeado del articulo: " + precioRedondeado);
    }
}
