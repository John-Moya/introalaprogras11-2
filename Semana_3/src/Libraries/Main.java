package Libraries;
import javax.swing.*;

import static java.lang.String.*;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {

    System.out.println("Numeros acendentes");

        for(int i = 0 ; i<5; i ++ ){
            System.out.println("Hola desde un el ciclo es 0"+ i);
        }
    System.out.println("Numeros desendentes");

        for(int i = 10 ; i>-1; i -- ){
            System.out.println("Hola desde un el ciclo es 0"+ i);
        }

    System.out.println("Ejercicio 1");

        for(int i = 0 ; i<8; i ++ ){
            System.out.println("Este mensaje es el numero "+ i);
        }

    System.out.println("Primer while");

        int j = 0;
        while (j < 5){
            System.out.println("Hola desde el while el valor es "+ j);
            j++;
        }

    System.out.println("Ejercicio 2");

        int x = 0;
        while (x < 10){
            System.out.println("Hola " + x);
            x++;
        }
    //Desarrolle un nuevo proyecto que imprima un rectángulo de 10 símbolos “@” en 5 líneas.

    System.out.println("Ejercicio 3");

        for(int i = 0 ; i<5; i ++ ){
            System.out.println("@@@@@@@@@@ ");
        }


        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                System.out.print("@");
            }
            System.out.println();
        }

        int tabla,multi;
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Digite la tabla: "));
        for(int i=0; i<11;i++){
            multi = tabla*i;
            System.out.println(tabla+"x"+i+" = "+multi);
        }


        int opc = Integer.parseInt(showInputDialog("Ingrese su opcion"));
        do {
            if (opc == 1){
                double precio;
                precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio"));
                JOptionPane.showInternalMessageDialog(null,"El precio es: "+ precio);
                break;

            } else if(opc == 2){
                System.out.println("Eligio la opcion 2");
                int cantidad;
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas"));
                JOptionPane.showInternalMessageDialog(null,"La cantidad es : "+ cantidad);
                break;

            } else if (opc == 3){
                System.out.println("Eligio la opcion 3");
                String nombre;
                nombre = JOptionPane.showInputDialog("Digite el nombre");
                JOptionPane.showInternalMessageDialog(null,"El nombre es : "+ nombre);
                break;
            }
        } while (opc != 4);




    }


}

