package Libraries;

public class Main {

    import javax.lang.model.util.AbstractElementVisitor14;
import javax.swing.*;

    public static void main(String[] args) {
	// write your code here
/* Arreglos
        int[] numeros = new int[6];
        numeros[0] = 35;
        numeros[1] = 36;
        numeros[2] = 37;
        numeros[3] = 38;
        numeros[4] = 39;
        numeros[5] = 40;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        /* JOptionPane
        String[] nombre = new String[2];
        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = JOptionPane.showInputDialog("Ingrese el Nombre");

        }*/

        /*Arreglos Bidimencionales
        int [] [] num2 = new int [2][2];
        num2 [0][0] = 25;
        num2 [0][1] = 50;
        num2 [1][0] = 75;
        num2 [1][1] = 100;

        for (int i=0; i < num2.length; i++){
            for (int j=0;  j < num2.length; j++){
                System.out.println(num2[i][j]);
            }
        }*/

        //


         /*Práctica 01
        String [] letras = new String [5];
        letras [0] = "A";
        letras [1] = "E";
        letras [2] = "I";
        letras [3] = "O";
        letras [4] = "U";

        for (int i=0; i<letras.length; i++){
            System.out.println(letras[i]);
        }*/

        /*Práctica 02
        Float [] num = new Float[4];
        num [0] = 1.5F;
        num [1] = 2.5F;
        num [2] = 3.5F;
        num [3] = 4.5F;

        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }*/

        /*Práctica 03
        double[] numD = new double [2];
        for (int i =0; i< numD.length; i++){
            numD[i] =  Double.parseDouble(JOptionPane.showInputDialog( "Ingrese el número: "));
            }

        for (int i =0; i< numD.length; i++){
            System.out.println(numD[i]);
        }*/


        /*Práctica 04
        double[] [] numDouble = new double[2][2];

        double suma = 0;
        double numMayor = numDouble[0][0];

        for (int i = 0; i < numDouble.length; i++){
            for (int j=0; j < numDouble.length; j++){
                numDouble[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los números: "));
            }
        }


        for (int i = 0; i < numDouble.length; i++){

            for (int j=0; j < numDouble.length; j++){
                 JOptionPane.showMessageDialog(null,"Los valores son: " +numDouble[i][j]);
                suma  = suma + numDouble[i][j];

                if (   numDouble[i][j] >  numMayor){
                    numMayor = numDouble[i][j];
                };
            }
        }
        System.out.println(numMayor);
        JOptionPane.showMessageDialog(null, "La suma total es de: "+suma);*/

        //Práctica 05

        int [][] aleatoreo = new int[3][3];

        for (int i = 0; i < aleatoreo.length; i++){
            for (int j=0; j < aleatoreo.length; j++){
                [i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los números: "));
            }
        }

    }
}
