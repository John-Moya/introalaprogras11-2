package semana07.examen;

import java.util.*;
import javax.swing.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> estudiantes = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();
        List<Integer> aprobados = new ArrayList<>();
        List<Integer> reprobados = new ArrayList<>();
        //Obtener data
        for (int i = 1; i < 4; i++) {
            System.out.println("Grupo " + i);
            for (int j = 1; j < 4; j++) {
                System.out.println("Ingrese el nombre del estudiante " + j + ": ");
                String estudiante = scan.next();
                estudiantes.add(estudiante);
                System.out.println("Ingrese la nota del estudiante: " + j + ": ");
                int nota = Integer.parseInt(scan.next());
                notas.add(nota);
                if (nota >= 70) { aprobados.add(nota); } else { reprobados.add(nota); }
            }
        }
        // Obtener promedio
        int sumaTotal = 0, cantAprobados = aprobados.size(), cantReprobados = reprobados.size();
        for (int i = 0; i < notas.size(); i++) {
            sumaTotal += notas.get(i);
        }
        int promedio = sumaTotal / estudiantes.size();
        //JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\nAprobados: " + cantAprobados + "\nReprobados: " + cantReprobados);
        System.out.println("Promedio: " + promedio + "\nAprobados: " + cantAprobados + "\nReprobados: " + cantReprobados);
    }
}