package semana03.tareas;

import java.util.Scanner;

public class TareaEjercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cantidad de estudiantes: ");
        int cantEstudiantes = Integer.parseInt(scan.next());
        double total = 0;
        double calificacion = 0;
        int aprobados = 0, reprobados = 0;
        String estudiante;

        for (int i = 1; i < cantEstudiantes + 1; i++) {
            System.out.println("Nota del estudiante " + i + ": ");
            calificacion = Double.parseDouble(scan.next());
            if (calificacion >= 70) {
                aprobados += 1;
            } else if (calificacion < 70 && calificacion > 0){ reprobados += 1;}
            else if (calificacion < 0) {
                System.out.println("Nombre del estudiante: ");
                estudiante = scan.next();
                break;
            }
            total += calificacion;
        }

        double promedio = total/cantEstudiantes;
        System.out.println("Promedio: "+promedio);
        System.out.println("Aprobados: " + aprobados + ", Reprobados: " + reprobados);
    }   
}