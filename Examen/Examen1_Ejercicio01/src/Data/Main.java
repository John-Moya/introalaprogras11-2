package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	/* 1. La empresa Soluciones S.A. lo ha contratado para desarrollar un programa para el registro
	de calificaciones de estudiantes, dado que los grupos son de 3, se debe elaborar para 3 estudiantes,
	 los estudiantes cuentan con tres calificaciones, el promedio debe ser mostrado haciendo uso
	 de JOptionPane. (10 Puntos) */


        for (int i = 1; i < 4; i++){
            System.out.println("Grupo " +i);
            for (int j = 0; j < 3; j++){
                String nom = JOptionPane.showInputDialog("Ingrese su nombre");
                int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primer Nota"));
                int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda Nota"));
                int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercer Nota"));

                int total = (nota1+nota2+nota3)/3;
                System.out.println(nom+ " su nota promedio es de: " + total);
                JOptionPane.showMessageDialog(null,nom+ " su nota promedio es de: " + total);
            }

        }
    }
}
