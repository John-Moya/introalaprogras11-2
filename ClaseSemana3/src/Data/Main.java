package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ejercicioEstudiantes();
    }

    public static void ejercicioEstudiantes() {

        int estudiantes = 0;
        int notaEstudiante[] = null;
        int menor = 101;
        int mayor = 0;
        int aprobados = 0;
        int reprobados = 0;
        double promedios = 0;
        int suma = 0;

        estudiantes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de estudiantes: "));
        notaEstudiante = new int[estudiantes];

        for (int i = 0; i < estudiantes; i++) {
            notaEstudiante[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante: " +i++));
            i--;
            System.out.println(i);

            if (notaEstudiante[i] >= 70){
                aprobados++;
            }else{
                reprobados++;
            }

            int actual = notaEstudiante[i];
            if (mayor < actual){
                mayor = actual;
            }else if(actual < menor){
                menor = actual;
            }

            suma += notaEstudiante[i];
        }

        promedios = suma / estudiantes;

        JOptionPane.showMessageDialog(null, "La nota mayor es: " + mayor);
        JOptionPane.showMessageDialog(null, "La nota menor es: " + menor);
        JOptionPane.showMessageDialog(null, "La cantidad de aprobados es: " + aprobados);
        JOptionPane.showMessageDialog(null, "La cantidad de reprobados es: " + reprobados);
        JOptionPane.showMessageDialog(null, "El promedio total es: " + promedios);
    }
}