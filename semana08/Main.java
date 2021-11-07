package semana08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        // int[] numeros = new int[6];
        // numeros[0] = 35;
        // numeros[1] = 36;
        // numeros[2] = 37;
        // numeros[3] = 38;
        // numeros[4] = 39;
        // numeros[5] = 40;

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println(numeros[i]);
        // }

        // int[][] matrix = new int[2][2];
        // matrix[0][0] = 25;
        // matrix[0][1] = 50;
        // matrix[1][0] = 75;
        // matrix[1][1] = 100;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         System.out.println(matrix[i][j]);
        //     }
        // }
        System.out.println("Indique el numero de filas: ");
        int filas = Integer.parseInt(scan.next());
        System.out.println("Indique el numero de columnas: ");
        int columnas = Integer.parseInt(scan.next());

        int[][] matrix = new int[filas][columnas];
        main.sumarEsquinas(matrix);
    }

    public void sumarEsquinas(int matriz[][]) {
        int numSupIzq = matriz[0][0];
        int numSupDer = matriz[0][matriz.length-1];
        int numInfIzq = matriz[matriz.length-1][0];
        int numInfDer = matriz[matriz.length-1][matriz.length-1];
        int suma = numSupIzq + numSupDer + numInfIzq + numInfDer;
        System.out.println("Suma de las esquinas de la matriz: " + suma);
    }

    public void sumaDiagonal(int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int num = matriz[i][i];
            suma += num;
        }
        System.out.println("La suma de las diagonales es: " + suma);
    } 

    public void sumaDiagonalAlReves(int matriz[][]) {
        int suma = 0;
        for (int i = matriz.length-1; i >= 0; i--) {
            int num = matriz[i][i];
            suma += num;
        }
        System.out.println("La suma de las diagonales al reves es: " + suma);
    } 

    public void sumaDiagonalInversa(int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int num = matriz[0+i][matriz.length - i - 1];
            suma += num;
        }
        System.out.println("Suma de la diagonal inversa: "+suma);
    }

    public void getNumMayor(int matriz[][]) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (mayor < matriz[i][j]) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("Numero mayor de la matriz: " + mayor);
    }
}
