package Data;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    loquevimosenclase();
    }
    public static void loquevimosenclase(){
// Clase es un conjunto de codigo
        // Variable espacio de memoria RAM en la cual se guarda un dato
        // EF243555F Hola
        // String
        String saludo = "Saludo"; // String nombre;
        Integer edad = 25;
        Float temperatura = 25.09F;
        Double salario = 25.000;
        Boolean verdadero = false;

        int edad1 = 26;
        float celsius = 26.04F;
        double salarioNeto = 25.000;
        boolean falso = false;
        char inicial = 'a';
        String apellido; //Variable no asignada, instanciada

        System.out.print("Hola");
        System.out.println("Hola");
        System.out.printf("Hola");

        String nombre = "José";
        int edad2 = 21;
        String nombre2 = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showInternalMessageDialog(null, nombre2);
        String edad3 = JOptionPane.showInputDialog("Ingrese su edad");
        JOptionPane.showInternalMessageDialog(null, edad3);
        String direccion1 = JOptionPane.showInputDialog("Ingrese su dirección");
        JOptionPane.showInternalMessageDialog(null, direccion1);
        String sueldo = JOptionPane.showInputDialog("Ingrese su sueldo");
        JOptionPane.showInternalMessageDialog(null, sueldo);


        //Ejercicio suma de números

        int numero1 = 0, numero2= 0, numero3= 0, numero4= 0;
        int resultado;
        double promedio;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        System.out.println(numero1);
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        System.out.println(numero2);
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        System.out.println(numero3);
        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        System.out.println(numero4);

        resultado = numero1 + numero2 + numero3 + numero4;
        promedio = resultado/4;

        System.out.println(resultado);
        System.out.println(promedio);



    }

}
